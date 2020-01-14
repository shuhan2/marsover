package third;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static third.ThirdDirection.*;

class ThirdMarsOverTest {

  @Test
  void should_return_west_x_1_y_1_when_turn_left_given_north_x_1_y_1() {
    ThirdMarsOver marsOver = new ThirdMarsOver(1, 1, NORTH);
    ThirdMarsOver thirdMarsOver = marsOver.turnLeft();

    assertEquals(1, thirdMarsOver.getX());
    assertEquals(1, thirdMarsOver.getY());
    assertEquals(WEST, thirdMarsOver.getDirection());
  }
}