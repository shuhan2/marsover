package second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondMarsOverTest {

  @Test
  void should_return_north_x_1_y_2_when_go_forward_given_north_x_1_y_1() {
    SecondMarsOver marsOver = new SecondNorthMarsOver(1, 1).goForward();

    assertEquals(new SecondNorthMarsOver(1, 2), marsOver);
  }

  @Test
  void should_return_south_x_1_y_0_when_go_forward_given_south_x_1_y_1() {
    SecondMarsOver marsOver = new SecondSouthMarsOver(1, 1).goForward();

    assertEquals(new SecondSouthMarsOver(1, 0), marsOver);
  }

  @Test
  void should_return_west_x_0_y_1_when_go_forward_given_west_x_1_y_1() {
    SecondMarsOver marsOver = new SecondWestMarsOver(1, 1).goForward();

    assertEquals(new SecondWestMarsOver(0, 1), marsOver);
  }

  @Test
  void should_return_east_x_2_y_1_when_go_forward_given_east_x_1_y_1() {
    SecondEastMarsOver marsOver = new SecondEastMarsOver(1, 1).goForward();

    assertEquals(new SecondEastMarsOver(2, 1), marsOver);
  }

  @Test
  void should_return_west_x_1_y_1_when_turn_left_given_north_x_1_y_1() {
    SecondMarsOver marsOver = new SecondNorthMarsOver(1, 1).turnLeft();

    assertEquals(new SecondWestMarsOver(1, 1), marsOver);
  }


  @Test
  void should_return_east_x_1_y_1_when_turn_left_given_south_x_1_y_1() {
    SecondMarsOver marsOver = new SecondSouthMarsOver(1, 1).turnLeft();

    assertEquals(new SecondEastMarsOver(1, 1), marsOver);
  }

  @Test
  void should_return_south_x_1_y_1_when_turn_left_given_west_x_1_y_1() {
    SecondMarsOver marsOver = new SecondWestMarsOver(1, 1).turnLeft();

    assertEquals(new SecondSouthMarsOver(1, 1), marsOver);
  }

  @Test
  void should_return_north_x_1_y_1_when_turn_left_given_east_x_1_y_1() {
    SecondMarsOver marsOver = new SecondEastMarsOver(1, 1).turnLeft();

    assertEquals(new SecondNorthMarsOver(1, 1), marsOver);
  }

  @Test
  void should_return_east_x_1_y_1_when_turn_right_given_north_x_1_y_1() {
    SecondMarsOver marsOver = new SecondNorthMarsOver(1, 1).turnRight();

    assertEquals(new SecondEastMarsOver(1, 1), marsOver);
  }
}