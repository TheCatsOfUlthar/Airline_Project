package softwareTesting.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import softwareTesting.Flight;
import softwareTesting.addflight;

import java.util.stream.Stream;

/**
 * This test suite holds all the unit tests created for the addFlight class.
 */
class addFlightTest {

  private softwareTesting.addflight addflight;

  /**
   * This method is done before each test case that will be run
   * to have a fresh object everytime.
   */
  @BeforeEach
  void setUp() {
    addflight = new addflight();
  }

  /**
   *
   * Positive Testing
   *
   * This is a unit test testing the function of adding a flight to the system.
   *
   * @param testFlight - Flight object
   */
  @ParameterizedTest
  @MethodSource("addingFlightParameters")
  public void addingFlightTest(Flight testFlight) {
    addflight.addFlight(testFlight);
  }

  /**
   * This method is used to pass in multiple parameters to a test case. In this case
   * it is used to pass in the addingFlightParameters.
   *
   * @return - Flight object
   */
  static Stream<Arguments> addingFlightParameters() {
    return Stream.of(
            Arguments.arguments(
                    new Flight(
                            "F0004",
                            "Usa",
                            "India",
                            "Usa",
                            "2022-07-17",
                            "8.00AM",
                            "10.00PM",
                            "1000")),
            Arguments.arguments(
                    new Flight(
                            "F0005",
                            "American Airlines",
                            "Usa",
                            "India",
                            "2022-07-17",
                            "8.00AM",
                            "10.00PM",
                            "999")));
  }
}