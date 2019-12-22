package tr.com.hepsiburada.model;

/**
 * @author maskin
 *
 */
public class Plateau {

	private int minWidth;
	private int minHeight;
	private int width;
	private int height;

	public Plateau(int width, int height) {
		this.minWidth = 0;
		this.minHeight = 0;
		this.width = width;
		this.height = height;
	}

	public int getMinWidth() {
		return minWidth;
	}

	public void setMinWidth(int minWidth) {
		this.minWidth = minWidth;
	}

	public int getMinHeight() {
		return minHeight;
	}

	public void setMinHeight(int minHeight) {
		this.minHeight = minHeight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
