package first;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsOverTest {

  @Test
  void should_return_north_coordinate_1_1_when_go_forward_given_north_coordinate_1_1() {
    MarsOver marsOver = new MarsOver(1, 1, "North").goForward();
    assertEquals(1, marsOver.getX());
    assertEquals(2, marsOver.getY());
    assertEquals("North", marsOver.getDirection());
  }
}