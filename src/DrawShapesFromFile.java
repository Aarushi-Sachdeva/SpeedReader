import java.awt.Color;
import java.io.*;
import java.util.*;

/*
 * This is a possible solution to the last part of Lab Activity #2.
 * 
 * Please contact the Instructor if you have any questions about it!
 */

public class DrawShapesFromFile {
	
	public static DrawableShape[] readFile(String filename) {

		// we need to have a try/catch block for creating the Scanner
		try (Scanner in = new Scanner(new File(filename))) {
			
			// the first line indicates the number of lines of data in the file
			int howMany = in.nextInt(); 
			
			// we use it to create an array
			DrawableShape[] shapes = new DrawableShape[howMany];

			// this will hold the array index as we populate it
			int index = 0;

			// keep reading until we hit the end of the file
			while (in.hasNext()) {
				
				// read the type of shape: "c" or "s"
				String type = in.next();
				
				// see if it's a circle; note that we need to use .equals to compare Strings
				if (type.equals("c")) {
					
					// read the x and y coordinates as doubles
					double x = in.nextDouble();
					double y = in.nextDouble();
					
					// read the color
					String c = in.next();
					
					// create a Color object
					Color color = null;
					if (c.equals("red")) color = StdDraw.RED;
					else if (c.equals("blue")) color = StdDraw.BLUE;
					else if (c.equals("green")) color = StdDraw.GREEN;
					else color = StdDraw.BLACK;

					// read the radius
					double radius = in.nextDouble();

					// create a DrawableCircle object with the info
					DrawableCircle s = new DrawableCircle(x, y, color, radius);
					
					// add it to the array
					shapes[index++] = s;
				}
				else { // it's a rectangle
					double x = in.nextDouble();
					double y = in.nextDouble();
					String c = in.next();
					Color color = null;
					if (c.equals("red")) color = StdDraw.RED;
					else if (c.equals("blue")) color = StdDraw.BLUE;
					else if (c.equals("green")) color = StdDraw.GREEN;
					else color = StdDraw.BLACK;

					// read the width and height
					double width = in.nextDouble();
					double height = in.nextDouble();

					// create a DrawableRectangle object with the info
					DrawableRectangle s = new DrawableRectangle(x, y, color, width, height);
					
					// add it to the array
					shapes[index++] = s;
				}
					
			}
			
			return shapes;
					
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		DrawableShape[] shapes = readFile(args[0]);
		
		for (DrawableShape shape : shapes) {
			shape.draw();
			System.out.println(shape);
		}
		

	}

}
