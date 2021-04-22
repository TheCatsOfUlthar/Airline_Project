package softwareTesting.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import softwareTesting.searchCustomer;

import javax.swing.*;

/** Search Customer Test, testing requirement:
 *
 *  "The reservation system shall allow users to search for a customer."
 */
class searchCustomerTest {

    // Setting up the objects to be used
    private softwareTesting.searchCustomer searchCustomer;
    private JLabel txtPhoto;

    /**
     * The before each declarator allows a certain action to happen before each test case. In this
     * case, we are creating a new searchCustomer class instantiation and creating a JLabel to pass
     * into the method being tested.
     */
    @BeforeEach
    void setUp() {
        searchCustomer = new searchCustomer();
        txtPhoto = new JLabel();
        txtPhoto.setSize(100, 100);
    }

    /**
     * Negative Test
     *
     * This test case tests to see if the user exists in the database.
     *
     * @param id - this is ID of the customer that is being searched
     */
    @ParameterizedTest
    @ValueSource(strings = {"CS001", "CS002", "CS003", ""})
    void doesCustomerExist(String id) {
        searchCustomer.searchCustomerInformation(id, txtPhoto);
    }

    /**
     * This is a unit test to test if the user can get select an image
     * from the file explorer.
     */
    @Test
    void getUserImageTest() {
        searchCustomer.getUserImage();
    }

    /**
     * The after each declarator allows an action to be performed after each test case. Here we are
     * setting the searchCustomer instantiation for each test case to null which will save memory by allowing
     * the garbage collector to clean up faster.
     */
    @AfterEach
    void tearDown() {
        searchCustomer = null;
    }
}
