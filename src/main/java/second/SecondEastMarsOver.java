package second;

import static second.SecondDirection.EAST;

public class SecondEastMarsOver extends SecondMarsOver {

  public SecondEastMarsOver(int x, int y) {
    super(x, y, EAST);
  }

  public SecondEastMarsOver goForward() {
    return new SecondEastMarsOver(super.getX() + 1, super.getY());
  }
}
