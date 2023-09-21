import java.awt.Color;

/**
 * Represents a circle with a method that uses the StdDraw library to draw
 * itself.
 * 
 * @author Chris Murphy
 */
public class DrawableCircle extends DrawableShape {

	protected double radius;

	public DrawableCircle(double x, double y, Color c, double radius) {
		super(x, y, c);
		this.radius = radius;
	}

	@Override
	public void draw() {

		StdDraw.setPenColor(color); // so that the circle is drawn in the specified color

		StdDraw.filledCircle(x, y, radius); // draws the circle

	}

}
