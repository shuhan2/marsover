package second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static second.SecondDirection.NORTH;

class SecondMarsOverTest {

  @Test
  void should_return_north_x_1_y_2_when_go_forward_given_north_x_1_y_1() {
    SecondMarsOver marsOver = new SecondMarsOver(1, 1, NORTH).goForward();

    assertEquals(new SecondMarsOver(1, 2, NORTH), marsOver);
  }
}