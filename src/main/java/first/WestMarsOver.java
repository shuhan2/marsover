package first;

import static first.Direction.WEST;

public class WestMarsOver extends MarsOver {

  public WestMarsOver(int x, int y) {
    super(x, y, WEST);
  }

  public MarsOver goForward() {

    return new WestMarsOver(super.getX() - 1, super.getY());
  }
}
