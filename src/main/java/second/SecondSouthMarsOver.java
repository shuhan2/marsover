package second;

import static second.SecondDirection.SOUTH;

public class SecondSouthMarsOver extends SecondMarsOver {

  public SecondSouthMarsOver(int x, int y) {
    super(x, y, SOUTH);
  }

  public SecondMarsOver goForward() {

    return new SecondSouthMarsOver(super.getX(), super.getY() - 1);
  }

  public SecondMarsOver turnLeft() {
    return new SecondEastMarsOver(super.getX(), super.getY());
  }
}
