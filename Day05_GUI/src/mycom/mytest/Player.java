package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private int r;
	private int g;
	private int b;
	
	public Player() {
		this(50, 50);
	}
	
	public Player(int width, int height) {
		Random random = new Random();
		this.x = random.nextInt(800);
		this.y = random.nextInt(600);
		this.r = random.nextInt(255);
		this.g = random.nextInt(255);
		this.b = random.nextInt(255);
		this.width = width;
		this.height= height;
	}
	
	public void display(Graphics graphics) {
		Color c = new Color(r, g, b);
		graphics.setColor(c);
		
		//원 그리기
//		graphics.fillOval(x,  y, width, height);
		
		//별 그리기
		int[] starX = {x + 20, x + 25, x + 40, x + 30, x + 35, x + 20, x + 5, x + 10, x + 0, x + 15};
        int[] starY = {y + 0, y + 15, y + 15, y + 25, y + 40, y + 30, y + 40, y + 25, y + 15, y + 15};
        graphics.fillPolygon(starX, starY, 10);
	}

}
