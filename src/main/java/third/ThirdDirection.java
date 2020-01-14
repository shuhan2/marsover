package third;

public enum ThirdDirection {
  NORTH("North"),
  EAST("East"),
  SOUTH("South"),
  WEST("West");
  private String direction;

  ThirdDirection(String direction) {
    this.direction = direction;
  }
}
