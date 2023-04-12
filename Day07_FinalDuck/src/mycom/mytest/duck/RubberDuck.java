package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable {
	
	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y); //원래는 super() 호출인데 super(x, y)를 일부러 호출함.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.yellow);
		g.drawString("삑삑", x + Duck.DUCK_SIZE, y);
	}
	
}
