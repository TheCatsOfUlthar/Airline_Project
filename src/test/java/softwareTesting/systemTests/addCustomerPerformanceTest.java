package softwareTesting.systemTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Customer;
import softwareTesting.addCustomer;
import softwareTesting.searchCustomer;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class addCustomerPerformanceTest {

  private softwareTesting.addCustomer addCustomer;
  private Customer customer;
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
    customer = null;
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