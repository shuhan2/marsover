package fourth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static fourth.Command.L;
import static fourth.Command.M;
import static fourth.Command.R;
import static fourth.FourthDirection.EAST;
import static fourth.FourthDirection.NORTH;
import static fourth.FourthDirection.SOUTH;
import static fourth.FourthDirection.WEST;
import static fourth.FourthDirection.values;

public class FourthMarsRover {

  private RoverState state;

  private final Function<FourthMarsRover, FourthMarsRover> SUB_Y_FUNCTION =
      marsRover -> {marsRover.state = new RoverState(marsRover.state.getX(), marsRover.state.getY() - 1, marsRover.state.getDirection());return marsRover;};
  private final Function<FourthMarsRover, FourthMarsRover> SUB_X_FUNCTION =
      marsRover -> {marsRover.state = new RoverState(marsRover.state.getX() - 1, marsRover.state.getY(), marsRover.state.getDirection());return marsRover;};
  private final Function<FourthMarsRover, FourthMarsRover> ADD_X_FUNCTION =
      marsRover -> {marsRover.state = new RoverState(marsRover.state.getX() + 1, marsRover.state.getY(), marsRover.state.getDirection());return marsRover;};
  private final Function<FourthMarsRover, FourthMarsRover> ADD_Y_FUNCTION =
      marsRover -> {marsRover.state = new RoverState(marsRover.state.getX(), marsRover.state.getY() + 1, marsRover.state.getDirection());return marsRover;};

  private Map<FourthDirection, Function<FourthMarsRover, FourthMarsRover>> functionMap = new HashMap<FourthDirection, Function<FourthMarsRover, FourthMarsRover>>() {{
    put(NORTH, ADD_Y_FUNCTION);
    put(EAST, ADD_X_FUNCTION);
    put(SOUTH, SUB_Y_FUNCTION);
    put(WEST, SUB_X_FUNCTION);

  }};

  public FourthMarsRover(int x, int y, FourthDirection direction) {

    this.state = new RoverState(x, y, direction);
  }

  public RoverState getState() {
    return state;
  }

  public FourthMarsRover command(Command command) {
    if (command == M) {
      return functionMap.get(state.getDirection()).apply(this);
    }
    if (command == L) {
      int originalIndex = Arrays.asList(values()).indexOf(this.state.getDirection());
      int indexOfLeft = originalIndex == 0 ? 3 : originalIndex - 1;
      this.state = new RoverState(this.state.getX(), this.state.getY(), values()[indexOfLeft]);
      return this;
    }
    if (command == R) {
      int originalIndex = Arrays.asList(values()).indexOf(this.state.getDirection());
      int indexOfRight = originalIndex == 3 ? 0 : originalIndex + 1;
      this.state = new RoverState(this.state.getX(), this.state.getY(), values()[indexOfRight]);
      return this;
    }
    return this;
  }

}
