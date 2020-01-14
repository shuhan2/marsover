package third;

import java.util.Arrays;

import static third.ThirdDirection.values;

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

    int originalIndex = Arrays.asList(values()).indexOf(direction);
    int indexOfLeft = originalIndex == 0 ? 3 : originalIndex - 1;
    return new ThirdMarsOver(x, y,values()[indexOfLeft]);
  }
}
