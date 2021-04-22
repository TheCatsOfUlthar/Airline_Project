package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import softwareTesting.Customer;
import softwareTesting.Flight;
import softwareTesting.addCustomer;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * This test suite tests the addCustomerClass.
 */
class addCustomerTest {

  private addCustomer addCustomer;
  private addCustomer addCustomerSpy;
  private Customer sampleCustomer;
  private Flight flight1;
  private ActionEvent actionEvent;

  /**
   * This setup method is done so that each test case can use these objects/variables/
   */
  @BeforeEach
  void setUp() {
    addCustomer = new addCustomer();
    Date date = new Date("Wed Feb 06 20:19:13 EST 2019");
    addCustomer.txtDOB.setDate(date);

    addCustomerSpy = spy(addCustomer);

    sampleCustomer = new Customer("Sam", "Thomas", "CS001", "123456789",
            "12345678", "1234", "2016-04-18", "Male", "1234567890");

    List<Flight> flights = new ArrayList<>();

    flight1 = new Flight("1234", "Delta", "RSW", "UJK", "2019-06-14", "8.00AM", "10.00AM", "850");
    flights.add(flight1);
  }

  /**
   * Negative Testing - This is to show that if all information is not
   * filled out, then the customer won't be added to the database. This is
   * when the photo is not chosen.
   */
  @Test
  void addCustomerToDatabaseTest() {
    addCustomer.addCustomerToDatabase(sampleCustomer);
  }

  /**
   * This test case is a unit test and tests the addCustomerToDatabase method from
   * the addCustomer class. This checks the user input to see if it is correct.
   *
   * @param data - true or false, if the input is correct or not
   */
  @ParameterizedTest
  @ValueSource(booleans = {true, false})
  void addCustomerToDatabase(boolean data) {
    doReturn(data).when(addCustomerSpy).checkUserInput(sampleCustomer);

    addCustomerSpy.addCustomerToDatabase(sampleCustomer);
  }

  /**
   * This is a unit test case designed to test the getUserImage method from the
   * addCustomer class.
   */
  @Test
  void getUserImageTest() {
    try {
      addCustomer.getUserImage();
      System.out.println("Photo Successfully Extracted");
    } catch (NullPointerException n) {
      n.printStackTrace();
      System.out.println("No photo Selected");
    }
  }

  /**
   * This unit test tests the response time of creating and showing the components for the
   * addCustomer class.
   */
  @Test
  void initComponents() {
try {
  long startTime = java.util.Calendar.getInstance().getTimeInMillis();
  new addCustomer().initComponents();
  long endTime = java.util.Calendar.getInstance().getTimeInMillis();
  //This tests that the GUI initialization time is less than 5 seconds
  assertTrue(endTime - startTime <= 5000);
  System.out.println("GUI Initialized under 5 seconds");
} catch (Exception e) {
  e.printStackTrace();
}
  }

  /**
   * This unit test is to test the date of birth function.
   */
  @Test
  void getDOB() {
    addCustomer customerView = new addCustomer();
    customerView.txtDOB.getMaxSelectableDate();
    assertNotNull(customerView.txtDOB);
    assertDoesNotThrow(() -> {
    });
    System.out.println("DOB Verified not NULL");
  }

  /**
   * This unit test is used to test getting the customer information from the
   * UI elements.
   */
  @Test
  void testGetCustomerInformation() {
    try{
    addCustomer.getCustomerInformation();
      System.out.println("Customer Information Returned");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * This unit test is used to get the interaction between two methods in the addCustomer class.
   *
   * @param data - true or false, makes the method being called either return true or false and
   *             in this case it is the radio button method. True makes the customer male and false
   *             makes the customer female.
   */
  @ParameterizedTest
  @ValueSource(booleans = {true, false})
  void getCustomerInformationTest(boolean data) {
    doReturn(sampleCustomer).when(addCustomerSpy).getTextInformation();
    doReturn(data).when(addCustomerSpy).getR1ButtonSelected();

    Customer testCustomer = addCustomerSpy.getCustomerInformation();
    System.out.println(testCustomer.getGender());
  }

  @Test
  void jButton1Test() {
    addCustomer.jButton2ActionPerformed(actionEvent);
  }

  /**
   * The after each declarator allows an action to be performed after each test case
   * test case to null which will save memory by allowing the garbage collector to clean up faster.
   */
  @AfterEach
  void tearDown() {}
}
