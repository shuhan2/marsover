package fourth;

import lombok.Getter;

@Getter
public class RoverState {
  private int x;
  private int y;
  private FourthDirection direction;

  public RoverState(int x, int y, FourthDirection direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }
}
