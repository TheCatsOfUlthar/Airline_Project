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
    private Customer customer;

    /**
     * The before each declarator allows a certain action to happen before each test case. In this
     * case, we are creating a new searchCustomer class instantiation.
     */
    @BeforeEach
    void setUp() {
        searchCustomer = new searchCustomer();
        customer = new Customer();
    }

    /**
     * Negative Test
     *
     * This test case will pass if the customer that is being updated is a valid customer in the
     * database.
     *
     * @param customer - Customer Object
     */
    @ParameterizedTest
    @MethodSource("testMethodSource")
    public void updateUserTest(Customer customer) {
       searchCustomer.updateCustomer(customer);
    }

    /**
     * This method creates a stream of arguments, so multiple parameter methods can be tested. This is
     * where the inputs for the test case comes from.
     *
     * @return - a stream of arguments
     */
    static Stream<Arguments> testMethodSource() {
        return Stream.of(
                Arguments.arguments(new Customer("", "Sam", "Thomas", "12345678", "123456789", "12720", "1997-17-08", "Male", "12341234")),
                Arguments.arguments(new Customer("CS003", "Sam", "Thomas", "12345678", "123456789", "12720", "1997-17-08", "Male", "12341234"))
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
