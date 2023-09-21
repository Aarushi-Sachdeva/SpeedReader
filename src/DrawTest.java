/**
 * Creates instances of DrawableShapes to make sure the methods work correctly
 * 
 * @author Chris Murphy
 */

public class DrawTest {
	
	public static void main(String[] args) {
		
		DrawableCircle c = new DrawableCircle(0.5, 0.5, StdDraw.BLUE, 0.2);
		c.draw();
		
		// checks that DrawableRectangle class is correctly implemented
		DrawableRectangle r = new DrawableRectangle(0.6, 0.3, StdDraw.RED, 0.1, 0.2);
		r.draw();
		
		// checks that DrawableRectangle correctly extends DrawableShape
		DrawableShape s = new DrawableRectangle(0.2, 0.7, StdDraw.GREEN, 0.3, 0.3);
		s.draw();
	}

}
