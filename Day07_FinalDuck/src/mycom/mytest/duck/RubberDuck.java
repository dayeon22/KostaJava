package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable {
	
	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y); //������ super() ȣ���ε� super(x, y)�� �Ϻη� ȣ����.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.yellow);
		g.drawString("���", x + Duck.DUCK_SIZE, y);
	}
	
}
