package first;

public class MarsOver {
  private int x;
  private int y;
  private String direction;

  public MarsOver(int x, int y, String direction) {
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

  public String getDirection() {
    return direction;
  }

  public MarsOver goForward() {
    if (direction.equals("South")) {
      return new MarsOver(this.x, this.y - 1, direction);
    }
    return new MarsOver(this.x, this.y + 1, direction);
  }

  public MarsOver turnLeft() {
    if (direction.equals("South")) {
      return new MarsOver(this.x, this.y, "East");
    }
    return new MarsOver(this.x, this.y, "West");
  }

  public MarsOver turnRight() {
    return new MarsOver(this.x, this.y, "East");
  }
}
