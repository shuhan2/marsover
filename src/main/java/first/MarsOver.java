package first;

import java.util.Arrays;

import static first.Direction.values;

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
