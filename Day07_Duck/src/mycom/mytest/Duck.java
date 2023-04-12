package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	public static int SHAPE_SIZE = 50;
	
	public Duck() {
		this(0, 0);
	}
	
	public Duck(int x, int y) {
		if (50 < x && x < MyFrame.FRAME_WIDTH - 50 &&
			70 < y && y < MyFrame.FRAME_HEIGHT - 70) {
			this.x = x;
			this.y = y;
		} else {
			Random random = new Random();
			this.x = random.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
			this.y = random.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
		}
	}
	
	public abstract void display(Graphics g);
	
	public void swim(Graphics g) {
		g.setColor(Color.black);
		g.drawString("¼ö¿µ", x - 20, y);
	}
}
