package first;

import java.util.Arrays;

import static first.Direction.*;

public class MarsOver {

  private int x;
  private int y;
  private Direction direction;

  public MarsOver(int x, int y, Direction direction) {
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

  public Direction getDirection() {
    return direction;
  }

  public MarsOver goForward() {
    if (direction.equals(EAST)) {
      return new MarsOver(this.x + 1, this.y, direction);
    }
    if (direction.equals(WEST)) {
      return new MarsOver(this.x - 1, this.y, direction);
    }
    if (direction.equals(SOUTH)) {
      return new MarsOver(this.x, this.y - 1, direction);
    }
    return new MarsOver(this.x, this.y + 1, direction);
  }

  public MarsOver turnLeft() {
    int originalIndexOfDirection = Arrays.asList(values()).indexOf(direction);
    int indexOfLeft = originalIndexOfDirection == 0 ? 3 : originalIndexOfDirection - 1;
    return new MarsOver(this.x, this.y, Direction.values()[indexOfLeft]);
  }

  public MarsOver turnRight() {
    int originalIndexOfDirection = Arrays.asList(values()).indexOf(direction);
    int indexOfRight = originalIndexOfDirection == 3 ? 0 : originalIndexOfDirection + 1;
    return new MarsOver(this.x, this.y, Direction.values()[indexOfRight]);
  }
}
