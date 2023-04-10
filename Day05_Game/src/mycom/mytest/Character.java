package mycom.mytest;

import java.util.Random;

public class Character {
	//private, public, protected
	protected int x; //�ٸ� �������� �������� ���ϰ� ����, �ڽ��� ������ �� �ֵ��� ���� ��.
	protected int y; //super�� �θ��� ���� ������ �� �ֱ� ������ ���Ȼ����δ� private�� ������. getter/setter�� ���� �����ϱ�
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
