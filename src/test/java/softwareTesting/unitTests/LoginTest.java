package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import softwareTesting.Login;

import java.util.stream.Stream;

/**
 * This holds all the unit tests for the Login class.
 */
class LoginTest {

  private Login login;

  /**
   * This method is done before each test case that will be run
   * to have a fresh object everytime.
   */
  @BeforeEach
  void setUp() {
    login = new Login();
  }

  /**
   * The after each declarator allows an action to be performed after each test case
   * test case to null which will save memory by allowing the garbage collector to clean up faster.
   */
  @AfterEach
  void tearDown() {}

    /**
     * This test case is used to test that the user is in the system and
     * that the user can be logged into the system.
     *
     * @param username - username typed in by the user
     * @param password - password typed in by the user
     */
    @ParameterizedTest
    @MethodSource("loginUserParameters")
    void loginUserTest(String username, String password) {
      login.loginUser(username, password);
    }

    /**
     * This method is used for accepting multiple parameters in the
     * loginUserTest.
     *
     * @return - Stream of arguments, in this case different username and password
     * combinations
     */
    static Stream<Arguments> loginUserParameters() {
    return Stream.of(
            Arguments.arguments(
                    "john",
                    "123"
            ),
            Arguments.arguments(
                    "sam",
                    "456"
            ),
            Arguments.arguments(
                    "",
                    "456"
            ),
            Arguments.arguments(
                    "sam",
                    ""
            ),
            Arguments.arguments(
                    "",
                    ""
            ));
  }
}