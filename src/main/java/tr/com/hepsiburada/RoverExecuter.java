package tr.com.hepsiburada;

import tr.com.hepsiburada.enums.Direction;
import tr.com.hepsiburada.model.Plateau;
import tr.com.hepsiburada.model.Position;
import tr.com.hepsiburada.model.Rover;

/**
 * @author maskin
 */
public class RoverExecuter {

    /**
     * @param plateau
     * @param position
     * @return
     */
    public static boolean isMoveAvailable(Plateau plateau, Position position) {
        return plateau.getMinWidth() <= position.getX() && position.getX() <= plateau.getWidth()
                && plateau.getMinHeight() <= position.getY() && position.getY() <= plateau.getHeight();
    }

    /**
     * @param rover
     * @return
     */
    public static String currentPosition(Rover rover) {
        return rover.getPosition().getX() + " " + rover.getPosition().getY() + " " + rover.getDirection();
    }

    /**
     * @param rover
     * @param movements
     */
    public static void explore(Rover rover, String movements) {
        for (int i = 0; i < movements.length(); i++) {
            executeCommand(rover, movements.charAt(i));
        }
    }

    /**
     * @param rover
     * @param movement
     */
    public static void executeCommand(Rover rover, char movement) {
        if ('L' == movement)
            turnLeft(rover);
        else if ('R' == movement)
            turnRight(rover);
        else if ('M' == movement) {
            if (!move(rover)) {
                System.out.println("Where are you trying to go?");
            }
        } else {
            System.out.println("Wrong parameters!..");
        }
    }

    /**
     * @param rover
     */
    public static void turnLeft(Rover rover) {
        Direction d = (rover.getDirection().getValue() - 1) < Direction.NORTH.getValue() ? Direction.WEST
                : Direction.valueOf(rover.getDirection().getValue() - 1);
        rover.setDirection(d);
    }

    /**
     * @param rover
     */
    public static void turnRight(Rover rover) {
        Direction d = (rover.getDirection().getValue() + 1) > Direction.WEST.getValue() ? Direction.NORTH
                : Direction.valueOf(rover.getDirection().getValue() + 1);
        rover.setDirection(d);
    }

    /**
     * @param rover
     * @return
     */
    public static boolean move(Rover rover) {
        if (!RoverExecuter.isMoveAvailable(rover.getPlateau(), rover.getPosition())) {
            return false;
        }
        switch (rover.getDirection()) {
            case NORTH:
                rover.getPosition().setY(rover.getPosition().getY() + 1);
                break;
            case EAST:
                rover.getPosition().setX(rover.getPosition().getX() + 1);
                break;
            case SOUTH:
                rover.getPosition().setY(rover.getPosition().getY() - 1);
                break;
            case WEST:
                rover.getPosition().setX(rover.getPosition().getX() - 1);
                break;
        }

        return true;
    }

    /**
     * @param rover
     * @param x
     * @param y
     * @param direction
     */
    public static void setRoverPosition(Rover rover, int x, int y, Direction direction) {
        if (rover.getPosition() == null) {
            rover.setPosition(new Position(x, y));
        } else {
            rover.getPosition().setX(x);
            rover.getPosition().setY(y);
        }

        rover.setDirection(direction);
    }

}
