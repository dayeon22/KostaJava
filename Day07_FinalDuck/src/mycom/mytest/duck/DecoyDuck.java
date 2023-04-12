package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(int x, int y) {
		super(x, y); //원래는 super() 호출인데 super(x, y)를 일부러 호출함.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

}
