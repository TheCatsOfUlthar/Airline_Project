package softwareTesting.performanceTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Customer;
import softwareTesting.addCustomer;

import static org.junit.jupiter.api.Assertions.*;

class addCustomerPerformanceTest {

  private softwareTesting.addCustomer addCustomer;

  @BeforeEach
  void setUp() {
    addCustomer = new addCustomer();
  }

  private static final long MEGABYTE = 1024L * 1024L;

  static long bytesToMegabytes(long bytes) {
    return bytes / MEGABYTE;
  }

  /**
   *
   */
  @Test
  void autoID() {
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
    long memory = runtime.totalMemory() - runtime.freeMemory();
    for (int i = 0; i < 500; i++) {
      addCustomer.autoID();
      new Customer().setID(String.valueOf(addCustomer.txtID));
      new Customer().setID(String.valueOf(addCustomer.txtID));
      new Customer().setID(String.valueOf(addCustomer.txtID));
      new Customer().setID(String.valueOf(addCustomer.txtID));
    }
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    assertTrue(memory < 20000000 && bytesToMegabytes(memory) < 100);
  }

  /**
   * The after each declarator allows an action to be performed after each test case
   * test case to null which will save memory by allowing the garbage collector to clean up faster.
   */
  @AfterEach
  void tearDown() {
    addCustomer = null;
  }
}
