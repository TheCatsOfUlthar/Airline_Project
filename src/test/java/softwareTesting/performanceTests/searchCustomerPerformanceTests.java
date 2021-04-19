package softwareTesting.performanceTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Customer;
import softwareTesting.searchCustomer;

import javax.swing.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class searchCustomerPerformanceTests {

  private softwareTesting.addCustomer addCustomer;
  private softwareTesting.searchCustomer searchCustomer;
  private javax.swing.JLabel txtPhoto;


  @BeforeEach
  void setUp() throws IOException {
    searchCustomer = new searchCustomer();
    txtPhoto = new JLabel();
    txtPhoto.setSize(100, 100);
  }

  @AfterEach
  void tearDown() {
    Customer customer = null;
  }

  @Test
  void addToDatabase() {
    long start = System.currentTimeMillis();
    searchCustomer.searchCustomerInformation("CS001",txtPhoto);
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println(timeElapsed);
    assertTrue(timeElapsed < 30);
  }
}