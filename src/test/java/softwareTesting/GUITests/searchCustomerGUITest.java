package softwareTesting.GUITests;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Main;

class searchCustomerGUITest {

    FrameFixture window;
    Main frame;

    @BeforeEach
    void setUp() {
        frame = GuiActionRunner.execute(Main::new);
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }

  @Test
  void updateCustomerGenderSelectGUITest() {
      window.menuItem("Customer").click();
      window.menuItem("Search Customer").click();
      window.textBox("Customer ID").setText("CS001");
      window.button("Find").click();

      window.radioButton("Female").click();

      window.radioButton("Male").requireSelected(true);
      window.radioButton("Female").requireSelected(false);
  }

  @Test
  void updateCustomerBlankFieldsGUITest() {
      window.menuItem("Customer").click();
      window.menuItem("Search Customer").click();

      window.textBox("First Name").requireEmpty();
      window.textBox("Last Name").requireEmpty();
      window.textBox("Nic No").requireEmpty();
      window.textBox("Passport ID").requireEmpty();
      window.textBox("Address").requireEmpty();
      window.cleanUp();
  }

    @AfterEach
    void tearDown() {
        frame = null;
        window = null;
    }
}