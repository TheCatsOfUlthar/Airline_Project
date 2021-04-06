import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class addCustomerTest {

  @BeforeEach
  void setUp() {
    List<Flight> flights = new ArrayList<>();

    Flight flight1 = new Flight("1234", "Delta", "RSW", "UJK", "2019-06-14", "8.00AM", "10.00AM", "850");
    flights.add(flight1);
  }

  @Test
  void normalFlight() {
    Customer customerMock = Mockito.mock(Customer.class);
    //when(customerMock).thenReturn()
  }

  @AfterEach
  void tearDown() {}
}
