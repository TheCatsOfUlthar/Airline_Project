package softwareTesting.unitTests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import softwareTesting.ticket;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/** The type Ticket test. */
class ticketTest {

  // Initializing class which we are testing.
  private softwareTesting.ticket ticket;

  /**
   * The before each declarator allows a certain action to happen before each test case. In this
   * case, we are creating a new ticket class instantiation.
   */
  @BeforeEach
  void setUp() {
    ticket = new ticket();
  }

  /**
   * Positive Test - BlackBox: Equivalence Class Test
   *
   * This is a test case, marked by the @Test declarator, which calls the function
   * calculateTotalPrice() with two valid testing parameters. The function returns the total ticket
   * price and saves it in output. The output is then checked to make sure that it is equal to the
   * expected value.
   */
  @Test
  void shouldCalculatePrice() {
    int output = ticket.calculateTotalPrice(100, 3);
    assertEquals(300, output);
  }

  /**
   * Negative Test - BlackBox: Equivalence Class Test with Boundary Value Analysis
   *
   * This is a Parameterized Test which includes integer values that should cause exceptions when
   * passed to the method shouldThrowException(). The flight cost should not be multiplied by any
   * number that is not a positive integer.
   *
   * @param quantity is substituted for each value in the @ValueSource
   */
  @ParameterizedTest
  @ValueSource(ints = {(Integer.MIN_VALUE - 1), -1, 0, (Integer.MAX_VALUE + 1)})
  void shouldThrowException(int quantity) {
    Assertions.assertThrows(
        RuntimeException.class, () -> ticket.calculateTotalPrice(100, quantity));
  }

  /**
   * This tests the book flight function and to see the actual output look in the database.
   *
   * @param ticketId - the ticket id
   * @param flightID - the flight id
   * @param customerId - the customer id
   * @param flightClass - the flight class either economy or business
   * @param price - the price of the flight
   * @param numberOfSeats - number of seats being purchased/booked
   * @param date - the date of the flight
   */
  @ParameterizedTest
  @MethodSource("bookTicketParameters")
  public void bookTicketTest(String ticketId, String flightID, String customerId,
                             String flightClass, String price, String numberOfSeats,
                             String date) {
    ticket.bookFlight(ticketId, flightID, customerId, flightClass, price, numberOfSeats, date);
  }

  static Stream<Arguments> bookTicketParameters() {
    return Stream.of(
            Arguments.arguments(
                 "TO999",
                 "FO001",
                 "CS001",
                 "Economy",
                 "50000",
                 "0",
                 "2019-06-14"
            ),
            Arguments.arguments(
                    "TO999",
                    "FO001",
                    "CS001",
                    "Economy",
                    "50000",
                    "1",
                    "2019-06-14"
            ));
  }

  @ParameterizedTest
  @MethodSource("searchForCustomerParameters")
  void searchForCustomerTest(String id) {
    ticket.searchForCustomer(id);
  }

  static Stream<Arguments> searchForCustomerParameters() {
    return Stream.of(
            Arguments.arguments(
                    "CS001"
            ),
            Arguments.arguments(
                    ""
            ));
  }

  @ParameterizedTest
  @MethodSource("searchForFlightParameters")
  void searchForFlightTest(String source, String depart) {
    ticket.searchForFlight(source, depart);
  }


  static Stream<Arguments> searchForFlightParameters() {
    return Stream.of(
            Arguments.arguments(
                    "India",
                    "India"
            ),
            Arguments.arguments(
                    "India",
                    "Uk"
            ));
  }

  /**
   * The after each declarator allows an action to be performed after each test case. Here we are
   * setting the ticket instantiation for each test case to null which will save memory by allowing
   * the garbage collector to clean up faster.
   */
  @AfterEach
  void tearDown() {
    ticket = null;
  }
}
