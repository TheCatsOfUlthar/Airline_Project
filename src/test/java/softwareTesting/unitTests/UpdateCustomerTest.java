package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import softwareTesting.Customer;
import softwareTesting.Database;
import softwareTesting.searchCustomer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

/**
 * The Update Customer Test, testing requirement:
 *
 * <p>"The reservation system shall allow a customer account to be edited and updated."
 */
class UpdateCustomerTest {

  /** Search Customer Object. */
  private searchCustomer searchCustomer;
  private searchCustomer searchCustomerSpy;
  private Customer customer;

  private PreparedStatement preparedStatement;

  private ActionEvent actionEvent;

  /**
   * The before each declarator allows a certain action to happen before each test case. In this
   * case, we are creating a new searchCustomer class instantiation.
   */
  @BeforeEach
  void setUp() {
    searchCustomer = new searchCustomer();
    searchCustomerSpy = spy(searchCustomer);

    customer = new Customer(
            "Sam",
            "Thomas",
            "",
            "12345678",
            "123456789",
            "12720",
            "1997-17-08",
            "Male",
            "12341234");
  }

  /**
   * Negative Test
   *
   * <p>This test case will pass if the customer that is being updated is a valid customer in the
   * database.
   *
   * @param customer - Customer Object
   */
  @ParameterizedTest
  @MethodSource("testMethodSource")
  void updateUserTest(Customer customer) {
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
        Arguments.arguments(
            new Customer(
                "Sam",
                "Thomas",
                "",
                "12345678",
                "123456789",
                "12720",
                "1997-17-08",
                "Male",
                "12341234")),
        Arguments.arguments(
            new Customer(
                "Sam",
                "Thomas",
                "CS003",
                "12345678",
                "123456789",
                "12720",
                "1997-17-08",
                "Male",
                "12341234")));
  }

  @ParameterizedTest
  @ValueSource(booleans = {true, false})
  void selectingRadioButtonTest(boolean data) {
    doReturn(data).when(searchCustomerSpy).getR1ButtonSelected();
    doReturn("1996-06-01").when(searchCustomerSpy).getDate();

    searchCustomerSpy.jButton2ActionPerformed(actionEvent);
  }

  @Test
  void updateCustomerCatchTest() throws SQLException {
    Database databaseSpy = mock(Database.class);
    when(databaseSpy.setSQLQuery("")).thenThrow(SQLException.class);

    searchCustomer.updateCustomer(customer);
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
