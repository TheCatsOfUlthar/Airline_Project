import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ticketTest {

  private ticket ticket;

  @BeforeEach
  void setUp() {
    ticket = new ticket();
  }

  @Test
  void shouldCalculatePrice() {
    int output = ticket.calculateTotalPrice(100, 3);
    assertEquals(300, output);
  }

  @ParameterizedTest
  @ValueSource(ints = {(Integer.MIN_VALUE - 1), -1, 0, (Integer.MAX_VALUE + 1)})
  void shouldThrowException(int quantity) {
    Assertions.assertThrows(
        RuntimeException.class, () -> ticket.calculateTotalPrice(100, quantity));
  }

  @AfterEach
  void tearDown() {
    ticket = null;
  }
}
