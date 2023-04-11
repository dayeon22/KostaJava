package mycom.mytest;

import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	public static final int DUCK_SIZE = 50;
	
	public Duck() {
		Random rnd = new Random();
//		MyFrame f = new MyFrame(); //width, height를 얻기 위해 객체를 생성하면 윈도우가 뜸
		//FRAME_WIDTH, FRAME_HEIGHT를 클래스변수로 만들어 객체를 생성하지 않고도 값을 가져올 수 있다.
		x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상메소드
	public abstract void display(Graphics g); //추상메소드: 구현부 없이 선언부만 존재

	//일반메소드
	public void swim(Graphics g) { //override못하게 막는법: final
		g.drawString("수영", x, y - 2);
	}
	
	public void quack(Graphics g) {
		g.drawString("꽥꽥", x + Duck.DUCK_SIZE, y - 2);
	}
}
