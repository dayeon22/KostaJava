package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
	public RedDuck() {
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void display(Graphics g) {
		Color c = new Color(255, 0, 0);
		g.setColor(c);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}
}
