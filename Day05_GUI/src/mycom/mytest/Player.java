package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
/*
//�� �ڵ�
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
		this.r = random.nextInt(256);
		this.g = random.nextInt(256);
		this.b = random.nextInt(256);
		this.width = width;
		this.height= height;
	}
	
	public void display(Graphics graphics) {
		Color c = new Color(r, g, b);
		graphics.setColor(c);
		
		//�� �׸���
//		graphics.fillOval(x,  y, width, height);
		
		//�� �׸���
		int[] starX = {x + 20, x + 25, x + 40, x + 30, x + 35, x + 20, x + 5, x + 10, x + 0, x + 15};
        int[] starY = {y + 0, y + 15, y + 15, y + 25, y + 40, y + 30, y + 40, y + 25, y + 15, y + 15};
        graphics.fillPolygon(starX, starY, 10);
	}

}
*/

//����� �ڵ�
public class Player {
	private int x; //�ν��Ͻ� ����(�ν��Ͻ����� ������ ����)
	private int y;
	public static final int shapeSize = 50; //Ŭ���� ����(��� �ν��Ͻ��� �����ϴ� ����). ���� ���𹮿��� ����� �ʱ�ȭ�� �Ѵ�.
	//static������ �޸��Ҵ��� ���� ���� �̷������ ������, New�����ڷ� ��ü���� ���ο� ������� ���ٰ���.
	//Player.shapeSize�� �����Ѵ�.
	//������ final�̴ϱ� public���� ���� ��.
	
	public Player() {
		Random rnd = new Random();
		//ȭ�� �ʺ� 800�̶�� �ϸ� �� �� 50�ȼ������� �������ִ�. ������ �߸��� �ʰ� �ϱ� ���� �� �� 50�ȼ�(�� 100�ȼ�) ������ ������ ���ܵ�.
		x = rnd.nextInt(800 - 100) + 50; //0 ~ (�ִ� - 1)
		y = rnd.nextInt(600 - 140) + 70; // 70 ~ 529 �ȼ�
	}
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void display(Graphics g) {
		g.setColor(new Color(255, 0, 0));
		g.fillOval(x, y, Player.shapeSize, Player.shapeSize);
	}
}
