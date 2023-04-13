package mycom.mytest;

import java.awt.Graphics;

public class MyCircle extends MyShape {
	
	public MyCircle() {
		
	}
	
	public MyCircle(int mx, int my) {
		super(mx, my);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, MyShape.SHAPE_SIZE, MyShape.SHAPE_SIZE);
	}
	
}
