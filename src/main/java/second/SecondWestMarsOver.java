package second;

import static second.SecondDirection.WEST;

public class SecondWestMarsOver extends SecondMarsOver {

  public SecondWestMarsOver(int x, int y) {
    super(x, y, WEST);
  }

  public SecondWestMarsOver goForward() {
    return new SecondWestMarsOver(super.getX() - 1, super.getY());
  }
}
