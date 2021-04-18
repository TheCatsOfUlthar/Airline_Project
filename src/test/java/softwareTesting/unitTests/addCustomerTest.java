package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Customer;
import softwareTesting.Flight;
import softwareTesting.addCustomer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class addCustomerTest {

  private softwareTesting.addCustomer addCustomer;
  private Customer sampleCustomer;

  @BeforeEach
  void setUp() {
    addCustomer = new addCustomer();
    Date date = new Date("Wed Feb 06 20:19:13 EST 2019");
    addCustomer.txtDOB.setDate(date);

    sampleCustomer = new Customer("Sam", "Thomas", "CS001", "123456789",
            "12345678", "1234", "2016-04-18", "Male", "1234567890");

    List<Flight> flights = new ArrayList<>();

    Flight flight1 = new Flight("1234", "Delta", "RSW", "UJK", "2019-06-14", "8.00AM", "10.00AM", "850");
    flights.add(flight1);
  }

  @Test
  void normalFlight() {
    //Customer customerMock = Mockito.mock(Customer.class);
    //when(customerMock).thenReturn()
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

  /*@Test
  void getUserImageTest() {
    addCustomer.getUserImage();
  }*/

  @AfterEach
  void tearDown() {}
}
