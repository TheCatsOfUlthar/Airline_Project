package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.ticketreport;

/**
 * This test suite holds all the unit tests that were created for the
 * ticketReport class.
 */
class ticketReportTest {

  private softwareTesting.ticketreport ticketreport;

  /**
   * This method is done before each test case that will be run
   * to have a fresh object everytime.
   */
  @BeforeEach
  void setUp() {
    ticketreport = new ticketreport();
  }

  @Test
  public void loadDataTest() {

  }

  /**
   * The after each declarator allows an action to be performed after each test case
   * test case to null which will save memory by allowing the garbage collector to clean up faster.
   */
  @AfterEach
  void tearDown() {}
}