package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Quackable, Flyable {
	
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y); //원래는 super() 호출인데 super(x, y)를 일부러 호출함.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("날다", x, y + Duck.DUCK_SIZE);
		
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("꽥꽥", x + Duck.DUCK_SIZE, y);
	}
	
}
