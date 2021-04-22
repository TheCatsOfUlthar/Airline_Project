package softwareTesting.integrationTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Customer;
import softwareTesting.addCustomer;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * This test class is a basic stub that tests to the interaction between two methods
 * in the addCustomer class.
 */
public class addCustomerIntegrationTest {

    private addCustomer mockAddCustomer;
    private Customer sampleCustomer;
    private ResultSet resultSet;
    private addCustomer addCustomer;

    /**
     * This method sets up each variable that is used during the testing phase.
     */
    @BeforeEach
    public void setup() {
        resultSet = mock(ResultSet.class);
        addCustomer = new addCustomer();
        mockAddCustomer = mock(addCustomer.class);
        sampleCustomer = new Customer("", "Sam", "Thomas", "123456789",
                "12345678", "1234", "2016-04-18", "Male", "1234567890");
    }

    /**
     * This test case is an example of how one method calls another and returns a Customer object. We mocked
     * the method getCustomerInformation() and set the return value to a Customer object. In the print line
     * it shows that when that method is called it returns the Customer object.
     */
    @Test
    public void testAddCustomerIntegration() {

        // when this method is called return the sample customer

        try {
            when(mockAddCustomer.getCustomerInformation()).thenReturn(sampleCustomer);

            // printing out the return of the method
            System.out.println(mockAddCustomer.getCustomerInformation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * This tests that when nothing is returned for resultSet.getString that the code
     * can handle that nothing was returned.
     *
     * @throws SQLException - ResultSet may not be connected to a database and there for
     * needs error handling in case that is not.
     */
    @Test
    void autoIDAddCustomerTest() throws SQLException {
        when(resultSet.getString("MAX(ID)")).thenReturn("");
        addCustomer.autoID();
    }
}
