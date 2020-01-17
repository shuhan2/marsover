package fourth;

import org.junit.jupiter.api.Test;

import static fourth.Command.*;
import static fourth.Command.M;
import static fourth.FourthDirection.EAST;
import static fourth.FourthDirection.NORTH;
import static fourth.FourthDirection.SOUTH;
import static fourth.FourthDirection.WEST;
import static org.junit.jupiter.api.Assertions.*;

class FourthMarsRoverTest {
  @Test
  void should_return_west_x_1_y_1_when_turn_left_given_north_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, NORTH);
    FourthMarsRover finalMarsRover = marsRover.command(L);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(WEST, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_east_x_1_y_1_when_turn_left_given_south_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, SOUTH);
    FourthMarsRover finalMarsRover = marsRover.command(L);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(EAST, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_north_x_1_y_1_when_turn_left_given_east_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, EAST);
    FourthMarsRover finalMarsRover = marsRover.command(L);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(NORTH, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_south_x_1_y_1_when_turn_left_given_west_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, WEST);
    FourthMarsRover finalMarsRover = marsRover.command(L);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(SOUTH, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_east_x_1_y_1_when_turn_right_given_north_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, NORTH);
    FourthMarsRover finalMarsRover = marsRover.command(R);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(EAST, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_south_x_1_y_1_when_turn_right_given_east_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, EAST);
    FourthMarsRover finalMarsRover = marsRover.command(R);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(SOUTH, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_west_x_1_y_1_when_turn_right_given_south_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, SOUTH);
    FourthMarsRover finalMarsRover = marsRover.command(R);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(WEST, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_north_x_1_y_1_when_turn_right_given_west_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, WEST);
    FourthMarsRover finalMarsRover = marsRover.command(R);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(NORTH, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_north_x_1_y_2_when_go_forward_given_north_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, NORTH);
    FourthMarsRover finalMarsRover = marsRover.command(M);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(2, finalMarsRover.getState().getY());
    assertEquals(NORTH, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_east_x_2_y_1_when_go_forward_given_east_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, EAST);
    FourthMarsRover finalMarsRover = marsRover.command(M);

    assertEquals(2, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(EAST, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_south_x_1_y_0_when_go_forward_given_south_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, SOUTH);
    FourthMarsRover finalMarsRover = marsRover.command(M);

    assertEquals(1, finalMarsRover.getState().getX());
    assertEquals(0, finalMarsRover.getState().getY());
    assertEquals(SOUTH, finalMarsRover.getState().getDirection());
  }

  @Test
  void should_return_west_x_0_y_1_when_go_forward_given_west_x_1_y_1() {
    FourthMarsRover marsRover = new FourthMarsRover(1, 1, WEST);
    FourthMarsRover finalMarsRover = marsRover.command(M);

    assertEquals(0, finalMarsRover.getState().getX());
    assertEquals(1, finalMarsRover.getState().getY());
    assertEquals(WEST, finalMarsRover.getState().getDirection());
  }
}