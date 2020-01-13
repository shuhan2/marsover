package first;

import static first.Direction.*;

public class NorthMarsOver extends MarsOver {

  public NorthMarsOver(int x, int y) {
    super(x, y, NORTH);
  }

  public MarsOver goForward() {

    return new NorthMarsOver(super.getX(), super.getY() + 1);
  }
}
