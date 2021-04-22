package softwareTesting;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ticketGUITest {

  FrameFixture window;
  Main frame;

  @BeforeEach
  public void setUp() {
    frame = GuiActionRunner.execute(Main::new);
    window = new FrameFixture(frame);
    window.show(); // shows the frame to test

    frame.jMenu1.setName("Customer");
    frame.jMenu2.setName("Tickets");
    frame.jMenu3.setName("Flight");
    frame.jMenu4.setName("User");

    frame.jMenuItem1.setName("Add Customer");
    frame.jMenuItem2.setName("Search Customer");
    frame.jMenuItem3.setName("Book Ticket");
    frame.jMenuItem4.setName("Add Flight");
    frame.jMenuItem5.setName("User Creation");
    frame.jMenuItem6.setName("Ticket Report");
  }

  @AfterEach
  void tearDown() {}

  @Test
  public void test() throws Exception {
    window.menuItem("Tickets").click();
    window.menuItem("Book Ticket").click();
    window.label("jLabel9").requireEnabled();
  }
}
