import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userCreationTest {

  userCreation userCreation;

  @BeforeEach
  void setUp() {
    userCreation = new userCreation();
  }

  @Test
  void shouldCheckLoginInput() {
    assertTrue(
        userCreation.verifyUserInformation("Robert", "Kissinger", "Rkissinger9134", "Hello123&&"));
  }

  @AfterEach
  void tearDown() {}
}
