package second;


import java.util.Arrays;

import static second.SecondDirection.*;


public class SecondMarsOver {

  private int x;
  private int y;
  private SecondDirection direction;

  public SecondMarsOver(int x, int y, SecondDirection direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public SecondMarsOver goForward() {
    return new SecondMarsOver(x, y + 1, direction);
  }

  @Override
  public int hashCode() {
    return this.x * 13 + this.y * 17 +
        3 * Arrays.asList(values()).indexOf(direction) + 23;
  }

  @Override
  public boolean equals(Object obj) {
    return this.x == ((SecondMarsOver)obj).x &&
        this.y == ((SecondMarsOver)obj).y &&
        this.direction.equals(((SecondMarsOver)obj).direction);
  }
}
