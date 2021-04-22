package softwareTesting.GUITests;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Main;
import softwareTesting.addCustomer;

import static org.junit.jupiter.api.Assertions.*;

class addCustomerGUITest {

  FrameFixture window;
  Main frame;

  @BeforeEach
  void setUp() {
    frame = GuiActionRunner.execute(Main::new);
    window = new FrameFixture(frame);
    window.show(); // shows the frame to test
  }

  @Test
  void test() {
    window.textBox("test");
  }

  @AfterEach
  void tearDown() {}
}