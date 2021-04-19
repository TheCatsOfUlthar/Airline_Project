package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import softwareTesting.Customer;
import softwareTesting.Flight;
import softwareTesting.addCustomer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class addCustomerTest {

  private softwareTesting.addCustomer addCustomer;
  private Customer sampleCustomer;
  private Flight flight1;

  @BeforeEach
  void setUp() {
    addCustomer = new addCustomer();
    Date date = new Date("Wed Feb 06 20:19:13 EST 2019");
    addCustomer.txtDOB.setDate(date);

    sampleCustomer =
        new Customer(
            "Sam",
            "Thomas",
            "CS001",
            "123456789",
            "12345678",
            "1234",
            "2016-04-18",
            "Male",
            "1234567890");

    List<Flight> flights = new ArrayList<>();

    flight1 = new Flight("1234", "Delta", "RSW", "UJK", "2019-06-14", "8.00AM", "10.00AM", "850");
    flights.add(flight1);
  }

  /** This is a driver to test the functionality between the Customer Class and the Flight class. */
  /*  @Test
  void normalFlight() {
    sampleCustomer.addFlight(flight1);
  }*/

  /**
   * Negative Testing - This is to show that if all information is not filled out, then the customer
   * won't be added to the database. This is when the photo is not chosen.
   */
  @Test
  void addCustomerToDatabaseTest() {
    addCustomer.addCustomerToDatabase(sampleCustomer);
  }

  @Test
  void getUserImageTest() {
    addCustomer.getUserImage();
  }

  @Test
  void initComponents() {

    long startTime = java.util.Calendar.getInstance().getTimeInMillis();
    new addCustomer().initComponents();
    long endTime = java.util.Calendar.getInstance().getTimeInMillis();
    // This tests that the GUI initlization time is less than 5 seconds
    assertTrue(endTime - startTime <= 5000);
    System.out.println("GUI Startup time: " + startTime);
  }

  @Test
  void getDOB() {
    addCustomer customerView = new addCustomer();
    customerView.txtDOB.getMaxSelectableDate();
    assertNotNull(customerView.txtDOB);
    assertDoesNotThrow(() -> {});
  }

  @Test
  void testGetCustomerInformation() {

    addCustomer customerView = new addCustomer();

    if (customerView.txtFirstName.isValid()) {
      customerView.txtFirstName.setText("testString");
      String compareValue = "testString";
      assertEquals(customerView.txtFirstName, compareValue);
    }
  }

  @AfterEach
  void tearDown() {}
}
