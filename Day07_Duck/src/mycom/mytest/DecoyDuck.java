package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, Duck.SHAPE_SIZE, Duck.SHAPE_SIZE);
	}

}
