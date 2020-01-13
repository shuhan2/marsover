package second;

public enum SecondDirection {
  NORTH("North"),
  EAST("East"),
  SOUTH("South"),
  WEST("West");
  private String direction;

  SecondDirection(String direction) {
    this.direction = direction;
  }
}
