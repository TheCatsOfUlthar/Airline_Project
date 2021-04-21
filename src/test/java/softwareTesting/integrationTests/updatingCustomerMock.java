package softwareTesting.integrationTests;

import org.junit.Before;
import org.junit.Test;
import softwareTesting.Customer;
import softwareTesting.Database;
import softwareTesting.searchCustomer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class updatingCustomerMock {

    private Database mockDatabase;
    private softwareTesting.searchCustomer searchCustomer;
    private PreparedStatement preparedStatement;

    @Before
    public void setUp() {
        mockDatabase = mock(Database.class);
        searchCustomer = new searchCustomer();
    }
    
    @Test
    public void testUpdateCustomer() throws SQLException {
        Customer customer = new Customer("CS001", "John", "Alex", "34232222", "3443", "Uk",
                "1996-06-01", "Male", "1234567890");

        when(mockDatabase.initializeDatabase()).thenReturn(true);
        when(mockDatabase.setSQLQuery("")).thenReturn(preparedStatement);
        when(mockDatabase.executePreparedStatementUpdate(preparedStatement)).thenReturn(1);

        searchCustomer.updateCustomer(customer);
    }
}
