package mycom.mytest;

import java.util.Random;

public class Character {
	//private, public, protected
	protected int x; //다른 곳에서는 접근하지 못하게 막고, 자식은 접근할 수 있도록 열어 둠.
	protected int y; //super로 부모의 값을 변경할 수 있기 때문에 보안상으로는 private을 권장함. getter/setter를 통해 접근하기
	protected String myShape;

	//constructor
	public Character() {
		Random rnd = new Random();
		x = rnd.nextInt(800);
		y = rnd.nextInt(600);
		myShape = "Character";
	}
	
	public void display() {
		System.out.println("x=" + x + ", y=" + y + ": " + myShape);
	}
	
	public void moveLeft() {
		this.x = this.x - 1;
		display();
	}
	
	public void moveRight() {
		this.x = this.x + 1;
		display();
	}
}
