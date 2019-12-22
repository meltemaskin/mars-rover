package tr.com.hepsiburada;

import tr.com.hepsiburada.enums.Direction;
import tr.com.hepsiburada.model.Plateau;
import tr.com.hepsiburada.model.Position;
import tr.com.hepsiburada.model.Rover;

public class Main {

	private static final String FIRST_ROVER_INSTRUCTIONS = "LMLMLMLMM";
	private static final String SECOND_ROVER_INSTRUCTIONS = "MMRMMRMRRM";
	public static void main(String[] args) {

		/**
		 * Create Plateau
		 */
		Plateau plateau = new Plateau(5, 5);


		/**
		 * Initialize First Rover with Position
		 */
		Position position = new Position(1, 2);
		Rover rover = new Rover(plateau, position, Direction.NORTH);

		RoverExecuter.explore(rover, FIRST_ROVER_INSTRUCTIONS);
		System.out.println("Current Position for First Rover: " + RoverExecuter.currentPosition(rover));

		/**
		 * Change Position For Second Rover
		 */
		RoverExecuter.setRoverPosition(rover, 3, 3, Direction.EAST);

		RoverExecuter.explore(rover, SECOND_ROVER_INSTRUCTIONS);
		System.out.println("Current Position for Second Rover: " + RoverExecuter.currentPosition(rover));

	}
}
