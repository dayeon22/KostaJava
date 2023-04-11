package mycom.mytest;

import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	public static final int DUCK_SIZE = 50;
	
	public Duck() {
		Random rnd = new Random();
//		MyFrame f = new MyFrame(); //width, height�� ��� ���� ��ü�� �����ϸ� �����찡 ��
		//FRAME_WIDTH, FRAME_HEIGHT�� Ŭ���������� ����� ��ü�� �������� �ʰ� ���� ������ �� �ִ�.
		x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�߻�޼ҵ�
	public abstract void display(Graphics g); //�߻�޼ҵ�: ������ ���� ����θ� ����

	//�Ϲݸ޼ҵ�
	public void swim(Graphics g) { //override���ϰ� ���¹�: final
		g.drawString("����", x, y - 2);
	}
	
	public void quack(Graphics g) {
		g.drawString("�в�", x + Duck.DUCK_SIZE, y - 2);
	}
}
