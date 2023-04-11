package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x,  y, DUCK_SIZE, DUCK_SIZE);
	}
	
}
