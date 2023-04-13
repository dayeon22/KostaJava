package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public abstract class MyShape {
	protected int x;
	protected int y;
	protected Color color = Color.RED; //Color.RED: static º¯¼ö
	public static final int SHAPE_SIZE = 50;
	
	public MyShape() {
		
	}
	
	public MyShape(int mx, int my) {
		this.x = mx;
		this.y = my;
		Random rnd = new Random();
		int type = rnd.nextInt(4);
		
		switch(type) {
		case 0:
			color = Color.RED;
			break;
		case 1:
			color = Color.BLUE;
			break;
		case 2:
			color = Color.GREEN;
			break;
		case 3:
			color = Color.YELLOW;
			break;
		default:
			color = Color.RED;
		}
	}
	
	public abstract void display(Graphics g);

}
