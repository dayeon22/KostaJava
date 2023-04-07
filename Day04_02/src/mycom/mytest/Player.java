package mycom.mytest;

import java.util.Random;

public class Player {
	private int x;
	private int y;
	private String myShape = new String(); //원래는 이렇게 해줘야하는데 String은 간편히 생성 가능.
	
	//생성자
	public Player() {
		Random rnd = new Random();
		x = rnd.nextInt(800); //0 ~ 799의 랜덤 값
		y = rnd.nextInt(600); //0 ~ 599의 랜덤 값
		myShape = "Player";
	}
	
	//메소드 오버로딩
	public Player(int mx, int my) {
		this.x = mx;
		this.y = my;
	}
	
	public void display() {}
	public void moveLeft() {}
	public void moveRight() {}
}
