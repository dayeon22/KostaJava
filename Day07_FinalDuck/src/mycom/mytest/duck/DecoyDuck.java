package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(int x, int y) {
		super(x, y); //������ super() ȣ���ε� super(x, y)�� �Ϻη� ȣ����.
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

}
