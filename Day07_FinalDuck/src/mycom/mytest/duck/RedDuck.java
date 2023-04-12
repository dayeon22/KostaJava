package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Quackable, Flyable {
	
	public RedDuck() {
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x, y); //������ super() ȣ���ε� super(x, y)�� �Ϻη� ȣ����.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.red);
		g.drawString("����", x, y + Duck.DUCK_SIZE);
		
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.red);
		g.drawString("�в�", x + Duck.DUCK_SIZE, y);
	}
	
}
