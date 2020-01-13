package second;

import static second.SecondDirection.*;

public class SecondNorthMarsOver extends SecondMarsOver {

  public SecondNorthMarsOver(int x, int y) {
    super(x, y, NORTH);
  }

  public SecondMarsOver goForward() {

    return new SecondNorthMarsOver(super.getX(), super.getY() + 1);
  }
}
