package softwareTesting.systemTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.ticketreport;

import static org.junit.jupiter.api.Assertions.*;

class loadDataTest {

  private softwareTesting.ticketreport ticketreport;

  @BeforeEach
  void setUp() {
    ticketreport = new ticketreport();
  }

  @AfterEach
  void tearDown() {}

  @Test
  void loadData() {
    long start = System.currentTimeMillis();
    ticketreport.LoadData();
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println(timeElapsed);
    assertTrue(timeElapsed < 10);
  }
}