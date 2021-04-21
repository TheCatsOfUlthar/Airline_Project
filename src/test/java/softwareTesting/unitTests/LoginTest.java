package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import softwareTesting.Login;

import java.util.stream.Stream;

class LoginTest {

  private Login login;

  @BeforeEach
  void setUp() {
    login = new Login();
  }

  @AfterEach
  void tearDown() {}

  @ParameterizedTest
  @MethodSource("loginUserParameters")
  void loginUserTest(String username, String password) {
    login.loginUser(username, password);
  }

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