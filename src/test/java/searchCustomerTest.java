import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

public class searchCustomerTest {

    private searchCustomer searchCustomer;
    private JLabel txtPhoto;

    @BeforeEach
    void setUp() {
        searchCustomer = new searchCustomer();
        txtPhoto = new JLabel();
        txtPhoto.setSize(100, 100);
    }

    @ParameterizedTest
    @ValueSource(strings = {"CS001", "CS002", "CS003", ""})
    void doesCustomerExist(String id) {
        searchCustomer.searchCustomerInformation(id, txtPhoto);
    }

/*    @Test
    void shouldThrowException() {
        Assertions.assertThrows(ClassNotFoundException.class, () ->
                searchCustomer.searchCustomerInformation("", txtPhoto));
    }*/

    @AfterEach
    void tearDown() {
        searchCustomer = null;
    }
}
