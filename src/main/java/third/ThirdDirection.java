package third;

import java.util.function.Function;

public enum ThirdDirection {
  NORTH(getAddYFunction()),
  EAST(getAddXFunction()),
  SOUTH(getSubYFunction()),
  WEST(getSubXFunction());
  private Function<ThirdMarsOver, ThirdMarsOver> goForward;

  public Function<ThirdMarsOver, ThirdMarsOver> getGoForward() {
    return goForward;
  }

  ThirdDirection(Function<ThirdMarsOver, ThirdMarsOver> goForward) {
    this.goForward = goForward;
  }

  private static Function<ThirdMarsOver, ThirdMarsOver> getAddXFunction() {
    return marsOVer -> new ThirdMarsOver(marsOVer.getX() + 1, marsOVer.getY(), marsOVer.getDirection());
  }

  private static Function<ThirdMarsOver, ThirdMarsOver> getSubXFunction() {
    return marsOVer -> new ThirdMarsOver(marsOVer.getX() - 1, marsOVer.getY(), marsOVer.getDirection());
  }

  private static Function<ThirdMarsOver, ThirdMarsOver> getAddYFunction() {
    return marsOVer -> new ThirdMarsOver(marsOVer.getX(), marsOVer.getY() + 1, marsOVer.getDirection());
  }

  private static Function<ThirdMarsOver, ThirdMarsOver> getSubYFunction() {
    return marsOVer -> new ThirdMarsOver(marsOVer.getX(), marsOVer.getY() - 1, marsOVer.getDirection());
  }
}
