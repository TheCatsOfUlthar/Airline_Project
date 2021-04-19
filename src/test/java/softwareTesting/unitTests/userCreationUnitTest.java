package softwareTesting.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import softwareTesting.User;
import softwareTesting.userCreation;

import java.util.stream.Stream;

public class userCreationUnitTest {

    private userCreation userCreation;

    @BeforeEach
    void setUp() {
        userCreation = new userCreation();
    }

    /**
     *
     * This is test the creation of a user and that it properly stores it into a
     * database. If any of the field are empty of not formatted correctly then
     * the system will display Invalid Information.
     *
     * @param user - User object
     */
    @ParameterizedTest
    @MethodSource("createUserParameters")
    void createUserTest(User user) {
        userCreation.createUser(user);
    }

    static Stream<Arguments> createUserParameters() {
        return Stream.of(
                Arguments.arguments(
                        new User(
                                "UO999",
                                "Bob",
                                "Smith",
                                "bob123",
                                "123"
                        )
                ),
                Arguments.arguments(
                        new User(
                                "UO999",
                                "Bob",
                                "Smith",
                                "bob123",
                                ""
                        )
                ),
                Arguments.arguments(
                        new User(
                                "UO999",
                                "Bob",
                                "Smith",
                                "",
                                "123"
                        )
                ),
                Arguments.arguments(
                        new User(
                                "UO999",
                                "Bob",
                                "",
                                "bob123",
                                "123"
                        )
                )
        );
    }
}
