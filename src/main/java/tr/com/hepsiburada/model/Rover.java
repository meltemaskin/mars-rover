package tr.com.hepsiburada.model;

import tr.com.hepsiburada.enums.Direction;

/**
 * @author maskin
 *
 */
public class Rover {

	private Plateau plateau;
	private Position position;
	private Direction direction;

	public Rover(Plateau plateau, Position position, Direction direction) {
		this.plateau = plateau;
		this.position = position;
		this.direction = direction;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
