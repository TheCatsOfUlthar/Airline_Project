package softwareTesting.GUITests;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Main;

class ticketGUITest {

  private FrameFixture window;
  private Main frame;

  @BeforeEach
  void setUp() {
    frame = GuiActionRunner.execute(Main::new);
    window = new FrameFixture(frame);
    window.show(); // shows the frame to test
  }

  @Test
  void test() throws Exception {
    window.menuItem("Tickets").click();
    window.menuItem("Book Ticket").click();
    window.label("jLabel9").requireNotVisible();
    window.label("jLabel10").requireNotVisible();
    window.label("jLabel11").requireNotVisible();
    window.label("jLabel18").requireNotVisible();
    window.label("jLabel19").requireNotVisible();
    window.label("jLabel20").requireNotVisible();
    window.label("jLabel4").requireNotVisible();
    window.cleanUp();
  }

  @AfterEach
  void tearDown() {
    frame = null;
    window = null;
  }
}