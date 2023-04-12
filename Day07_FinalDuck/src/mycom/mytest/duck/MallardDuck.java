package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Quackable, Flyable {
	
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y); //������ super() ȣ���ε� super(x, y)�� �Ϻη� ȣ����.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("����", x, y + Duck.DUCK_SIZE);
		
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("�в�", x + Duck.DUCK_SIZE, y);
	}
	
}
