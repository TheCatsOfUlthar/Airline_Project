package unitTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import softwareTesting.Flight;
import softwareTesting.addflight;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class addFlightTest {

  private softwareTesting.addflight addflight;

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

/*  @Test
  void getInfo() {
    Flight testFlight = addflight.getFlightInformation();
    assertTrue(testFlight instanceof Flight);
  }*/
}