package tr.com.hepsiburada.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maskin
 *
 */
public enum Direction {

	NORTH(0), EAST(1), SOUTH(2), WEST(3);

	private int value;
	private static Map<Integer, Direction> map = new HashMap<Integer, Direction>();

	private Direction(int value) {
		this.value = value;
	}

	static {
		for (Direction direction : Direction.values()) {
			map.put(direction.value, direction);
		}
	}

	public static Direction valueOf(int pageType) {
		return (Direction) map.get(pageType);
	}

	public int getValue() {
		return value;
	}

}
