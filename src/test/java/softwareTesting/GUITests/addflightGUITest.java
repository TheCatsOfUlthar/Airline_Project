package softwareTesting.GUITests;

import org.assertj.swing.assertions.Assertions;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softwareTesting.Main;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.in;
import static org.assertj.core.api.Assertions.not;
import static org.assertj.core.api.Assertions.notIn;

import static org.junit.jupiter.api.Assertions.*;

class addflightGUITest {

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
    String[] contents = {"India", "Srilanka", "Uk", "Usa", "Canada", "China"};
    window.menuItem("Flight").click();
    window.menuItem("Add Flight").click();
    window.comboBox("source").requireItemCount(6);
    window.comboBox("departure").requireItemCount(6);
    window.cleanUp();
  }

  @AfterEach
  void tearDown() {
    frame = null;
    window = null;
  }
}
