package mycom.mytest;

import java.util.Random;

public class Player {
	private int x;
	private int y;
	private String myShape = new String(); //������ �̷��� ������ϴµ� String�� ������ ���� ����.
	
	//������
	public Player() {
		Random rnd = new Random();
		x = rnd.nextInt(800); //0 ~ 799�� ���� ��
		y = rnd.nextInt(600); //0 ~ 599�� ���� ��
		myShape = "Player";
	}
	
	//�޼ҵ� �����ε�
	public Player(int mx, int my) {
		this.x = mx;
		this.y = my;
	}
	
	public void display() {}
	public void moveLeft() {}
	public void moveRight() {}
}
