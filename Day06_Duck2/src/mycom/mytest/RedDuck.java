package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
	
	public RedDuck() {
		
	}
	
	public RedDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x,  y, DUCK_SIZE, DUCK_SIZE);
	}
	
}
