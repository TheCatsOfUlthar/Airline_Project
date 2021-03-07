import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

  @AfterEach
  void tearDown() {
    ticket = null;
  }
}
