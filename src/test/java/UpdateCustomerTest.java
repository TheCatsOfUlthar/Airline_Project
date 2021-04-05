import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/** The Update Customer Test, testing requirement:
 *
 * "The reservation system shall allow a customer account to be edited and updated."
 */
public class UpdateCustomerTest {

    /** Search Customer Object. */
    private searchCustomer searchCustomer;

    /**
     * The before each declarator allows a certain action to happen before each test case. In this
     * case, we are creating a new searchCustomer class instantiation.
     */
    @BeforeEach
    void setUp() {
        searchCustomer = new searchCustomer();
    }

    /**
     * Negative Test
     *
     * This test case will pass if the customer that is being updated is a valid customer in the
     * database.
     *
     * @param ID - The ID of the user being updated
     * @param firstName - the first name of the user being updated
     * @param lastName - the last name of the user being updated
     * @param NIC - this is the NIC number being updated
     * @param passport - this is the passport number being updated
     * @param address - the address of the person being updated
     * @param date - this is the of the user being updated
     * @param gender - the gender of the person being updated
     * @param contact - this is the phone number of the person being updated
     */
    @ParameterizedTest
    @MethodSource("testMethodSource")
    public void updateUserTest(String ID, String firstName, String lastName, String NIC,
                                     String passport, String address, String date, String gender,
                                     String contact) {
       searchCustomer.updateCustomer(ID, firstName, lastName, NIC, passport, address, date, gender, contact);
    }

    /**
     * This method creates a stream of arguments, so multiple parameter methods can be tested. This is
     * where the inputs for the test case comes from.
     *
     * @return - a stream of arguments
     */
    static Stream<Arguments> testMethodSource() {
        return Stream.of(
                Arguments.arguments("", "Sam", "Thomas", "12345678", "123456789", "12720", "1997-17-08", "Male", "12341234"),
                Arguments.arguments("CS003", "Sam", "Thomas", "12345678", "123456789", "12720", "1997-17-08", "Male", "12341234")
        );
    }

    /**
     * The after each declarator allows an action to be performed after each test case. Here we are
     * setting the searchCustomer instantiation for each test case to null which will save memory by
     * allowing the garbage collector to clean up faster.
     */
    @AfterEach
    void tearDown() {
        searchCustomer = null;
    }
}
