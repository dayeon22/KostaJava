package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void display(Graphics g) {
		Color c = new Color(0, 0, 255);
		g.setColor(c);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}
}
