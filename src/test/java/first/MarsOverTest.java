package first;


import org.junit.jupiter.api.Test;

import static first.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsOverTest {

  @Test
  void should_return_north_coordinate_1_2_when_go_forward_given_north_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, NORTH).goForward();
    assertEquals(1, marsOver.getX());
    assertEquals(2, marsOver.getY());
    assertEquals(NORTH, marsOver.getDirection());
  }

  @Test
  void should_return_west_coordinate_1_1_when_turn_left_given_north_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, NORTH).turnLeft();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(WEST, marsOver.getDirection());
  }

  @Test
  void should_return_east_coordinate_1_1_when_turn_right_given_north_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, NORTH).turnRight();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(EAST, marsOver.getDirection());
  }

  @Test
  void should_return_south_coordinate_1_0_when_go_forward_given_south_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, SOUTH).goForward();
    assertEquals(1, marsOver.getX());
    assertEquals(0, marsOver.getY());
    assertEquals(SOUTH, marsOver.getDirection());
  }

  @Test
  void should_return_east_coordinate_1_1_when_turn_left_given_south_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, SOUTH).turnLeft();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(EAST, marsOver.getDirection());
  }

  @Test
  void should_return_west_coordinate_1_1_when_turn_right_given_south_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, SOUTH).turnRight();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(WEST, marsOver.getDirection());
  }

  @Test
  void should_return_west_coordinate_0_1_when_go_forward_given_west_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, WEST).goForward();
    assertEquals(0, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(WEST, marsOver.getDirection());
  }

  @Test
  void should_return_south_coordinate_1_1_when_turn_left_given_west_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, WEST).turnLeft();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(SOUTH, marsOver.getDirection());
  }

  @Test
  void should_return_north_coordinate_1_1_when_turn_right_given_west_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, WEST).turnRight();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(NORTH, marsOver.getDirection());
  }

  @Test
  void should_return_east_coordinate_2_1_when_go_forward_given_east_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, EAST).goForward();
    assertEquals(2, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(EAST, marsOver.getDirection());
  }

  @Test
  void should_return_north_coordinate_1_1_when_go_forward_given_east_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, EAST).turnLeft();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(NORTH, marsOver.getDirection());
  }

  @Test
  void should_return_south_coordinate_1_1_when_go_forward_given_east_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, EAST).turnRight();
    assertEquals(1, marsOver.getX());
    assertEquals(1, marsOver.getY());
    assertEquals(SOUTH, marsOver.getDirection());
  }
}