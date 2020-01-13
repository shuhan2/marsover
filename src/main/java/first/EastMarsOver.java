package first;

import static first.Direction.EAST;
import static first.Direction.SOUTH;

public class EastMarsOver extends MarsOver {

  public EastMarsOver(int x, int y) {
    super(x, y, EAST);
  }

  public MarsOver goForward() {

    return new EastMarsOver(super.getX() + 1, super.getY());
  }
}
