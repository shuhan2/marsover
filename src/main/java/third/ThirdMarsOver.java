package third;

import java.util.Arrays;

import static third.ThirdDirection.EAST;
import static third.ThirdDirection.SOUTH;
import static third.ThirdDirection.WEST;
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
    return new ThirdMarsOver(x, y, values()[indexOfLeft]);
  }

  public ThirdMarsOver turnRight() {
    int originalIndex = Arrays.asList(values()).indexOf(direction);
    int indexOfRight = originalIndex == 3 ? 0 : originalIndex + 1;
    return new ThirdMarsOver(x, y, values()[indexOfRight]);
  }

  public ThirdMarsOver goForward() {
    if (direction == SOUTH) {
      return new ThirdMarsOver(x, y - 1, direction);
    }
    if (direction == EAST) {
      return new ThirdMarsOver(x + 1, y, direction);
    }
    return new ThirdMarsOver(x, y + 1, direction);
  }
}
