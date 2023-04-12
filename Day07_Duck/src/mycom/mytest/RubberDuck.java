package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements QuackDuck {
	
	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.red);
		g.drawString("»à»à", x + 20, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, Duck.SHAPE_SIZE, Duck.SHAPE_SIZE);
		quack(g);
	}

}
