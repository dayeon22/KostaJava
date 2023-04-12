package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.mytest.gui.MyFrame;

public abstract class Duck {
	protected int x;
	protected int y;
	public static final int DUCK_SIZE = 50;

	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
	}
	
	//메소드 오버로딩
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void display(Graphics g);

	public final void swim(Graphics g) { //자식클래스에서 overide할 수 없도록 final로 막아둠
		g.setColor(Color.black);
		g.drawString("수영", x, y - 2);
	}
}
