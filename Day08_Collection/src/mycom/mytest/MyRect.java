package mycom.mytest;

import java.awt.Graphics;

public class MyRect extends MyShape {
	
	public MyRect() {
		
	}
	
	public MyRect(int mx, int my) {
		super(mx, my);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, MyShape.SHAPE_SIZE, MyShape.SHAPE_SIZE);
	}
	
}
