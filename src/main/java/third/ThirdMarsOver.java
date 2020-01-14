package third;

import static third.ThirdDirection.*;

public class ThirdMarsOver {

  private int x;
  private int y;
  private ThirdDirection direction;

  public ThirdMarsOver(int x, int y, ThirdDirection direction) {

    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public ThirdDirection getDirection() {
    return direction;
  }

  public ThirdMarsOver turnLeft() {
    if (direction == EAST) {
      return new ThirdMarsOver(x, y, NORTH);
    }
    if (direction == SOUTH) {
      return new ThirdMarsOver(x, y, EAST);
    }
    return new ThirdMarsOver(x, y, WEST);
  }
}
