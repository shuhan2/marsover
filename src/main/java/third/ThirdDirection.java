package third;

import java.util.function.Function;

public enum ThirdDirection {
  NORTH(Constants.ADD_Y_FUNCTION),
  EAST(Constants.ADD_X_FUNCTION),
  SOUTH(Constants.SUB_Y_FUNCTION),
  WEST(Constants.SUB_X_FUNCTION);

  private Function<ThirdMarsOver, ThirdMarsOver> goForward;

  public Function<ThirdMarsOver, ThirdMarsOver> getGoForward() {
    return goForward;
  }

  ThirdDirection(Function<ThirdMarsOver, ThirdMarsOver> goForward) {
    this.goForward = goForward;
  }

  private static class Constants {

    static final Function<ThirdMarsOver, ThirdMarsOver> SUB_Y_FUNCTION = marsOVer -> new ThirdMarsOver(marsOVer.getX(), marsOVer.getY() - 1, marsOVer.getDirection());
    static final Function<ThirdMarsOver, ThirdMarsOver> SUB_X_FUNCTION = marsOVer -> new ThirdMarsOver(marsOVer.getX() - 1, marsOVer.getY(), marsOVer.getDirection());
    static final Function<ThirdMarsOver, ThirdMarsOver> ADD_X_FUNCTION = marsOVer -> new ThirdMarsOver(marsOVer.getX() + 1, marsOVer.getY(), marsOVer.getDirection());
    static final Function<ThirdMarsOver, ThirdMarsOver> ADD_Y_FUNCTION = marsOVer -> new ThirdMarsOver(marsOVer.getX(), marsOVer.getY() + 1, marsOVer.getDirection());
  }
}
