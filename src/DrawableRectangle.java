import java.awt.Color;

public class DrawableRectangle extends DrawableShape {
	protected double width;
	protected double height;
	protected double halfWidth;
	protected double halfHeight;
	
	public DrawableRectangle(double x,double y, Color c, double w, double h) {
		super(x,y,c);
		this.width = w;
		this.height = h;
	}
	

	@Override
	public void draw() {
		StdDraw.setPenColor(color); 
		StdDraw.filledRectangle(x,  y, this.width/2 , this.height/2);

	}

}
