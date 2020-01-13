package first;

import static first.Direction.SOUTH;

public class SouthMarsOver extends MarsOver {

  public SouthMarsOver(int x, int y) {
    super(x, y, SOUTH);
  }

  public MarsOver goForward() {

    return new SouthMarsOver(super.getX(), super.getY() - 1);
  }
}
