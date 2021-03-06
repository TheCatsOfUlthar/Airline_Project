import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** The type User creation test. */
class userCreationTest {

  /** The User creation. */
  private userCreation userCreation;

  /**
   * The before each declarator allows a certain action to happen before each test case. In this
   * case, we are creating a new ticket class instantiation.
   */
  @BeforeEach
  void setUp() {
    userCreation = new userCreation();
  }

  /**
   * Positive Test - BlackBox: Decision Table
   *
   * This test case passes valid login information to the verifyUserInformation() method. Each
   * String parameter is verified against custom regex patterns to ensure each String matches their
   * correct formats. If all Strings are verified, then the function returns true and the assertion
   * passes. If one, two, three, or four of the Strings do not pass regex verification, the function
   * returns false and the assertion fails.
   */
  @Test
  void shouldCheckLoginInput() {
    assertTrue(
        userCreation.verifyUserInformation("Robert", "Kissinger", "Rkissinger9134", "Hello123&&"));
  }

  /**
   * The after each declarator allows an action to be performed after each test case. Here we are
   * setting the ticket instantiation for each test case to null which will save memory by allowing
   * the garbage collector to clean up faster.
   */
  @AfterEach
  void tearDown() {}
}
