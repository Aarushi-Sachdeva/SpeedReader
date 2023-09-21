import java.awt.Color;

/**
 * Abstract class representing a shape that knows how to draw itself.
 * 
 * @author Chris Murphy
 *
 */

public abstract class DrawableShape {
	
	protected double x, y; // coordinates of center of shape
	protected Color color; // color of shape
	
	public DrawableShape(double x, double y, Color c) {
		this.x = x;
		this.y = y;
		color = c;
	}
	
	public abstract void draw(); // implemented by subclasses
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": (" + x + ", " + y + "): " + color;
	}

}
