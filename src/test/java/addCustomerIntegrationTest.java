import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * This test class is a basic stub that tests to the interaction between two methods
 * in the addCustomer class.
 */
public class addCustomerIntegrationTest {

    // This is the mocked Object.
    private addCustomer mockAddCustomer;

    /**
     * This method mocks the object every time the a test case is run.
     */
    @Before
    public void setup() {
        mockAddCustomer = mock(addCustomer.class);
    }

    /**
     * This test case is an example of how one method calls another and returns a Customer object. We mocked
     * the method getCustomerInformation() and set the return value to a Customer object. In the print line
     * it shows that when that method is called it returns the Customer object.
     */
    @Test
    public void testAddCustomerIntegration() {
        // Sample Customer Object
        Customer sampleCustomer = new Customer("", "Sam", "Thomas", "123456789",
                "12345678", "1234", "2016-04-18", "Male", "1234567890");

        // when this method is called return the sample customer
        when(mockAddCustomer.getCustomerInformation()).thenReturn(sampleCustomer);

        // printing out the return of the method
        System.out.println(mockAddCustomer.getCustomerInformation());
    }
}
