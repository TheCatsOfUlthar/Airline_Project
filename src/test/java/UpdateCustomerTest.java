import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class UpdateCustomerTest {

    private searchCustomer searchCustomer;

    @BeforeEach
    void setUp() {
        searchCustomer = new searchCustomer();
    }

    @ParameterizedTest
    @MethodSource("testMethodSource")
    public void shouldThrowException(String ID, String firstName, String lastName, String NIC,
                                     String passport, String address, String date, String gender,
                                     String contact) {
       searchCustomer.updateCustomer(ID, firstName, lastName, NIC, passport, address, date, gender, contact);
    }

    static Stream<Arguments> testMethodSource() {
        return Stream.of(
                Arguments.arguments("", "Sam", "Thomas", "12345678", "123456789", "12720", "1997-17-08", "Male", "12341234"),
                Arguments.arguments("CS003", "Sam", "Thomas", "12345678", "123456789", "12720", "1997-17-08", "Male", "12341234")
        );
    }

    @AfterEach
    void tearDown() {
        searchCustomer = null;
    }
}
