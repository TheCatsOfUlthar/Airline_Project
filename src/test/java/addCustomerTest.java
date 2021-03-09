import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class addCustomerTest {

  private addCustomer addCustomer;

  @BeforeEach
  void setUp() {
    addCustomer = new addCustomer();
  }

  @Test
  void shouldCheckCustomerFieldTypes() {
    addCustomer addCustomer = new addCustomer();
    assertTrue(
        addCustomer.checkUserInput(
            "robert",
            "kissinger",
            "123456789",
            "C12345678",
            "5825 myaddress",
            "2021-02-02",
            "male",
            "239"));
  }

  @AfterEach
  void tearDown() {
    addCustomer = null;
  }
}
