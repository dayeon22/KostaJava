package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements QuackDuck, FlyDuck {

	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.black);
		g.drawString("²Ð²Ð", x + 20, y);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.black);
		g.drawString("³¯´Ù", x - 20, y + 40);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, Duck.SHAPE_SIZE, Duck.SHAPE_SIZE);
		quack(g);
		fly(g);
	}

}
