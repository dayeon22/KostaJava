package mycom.mytest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

//������ �׷��� Frame
public class MyFrame extends Frame { //����� ����: ���� ¥���� �ڵ带 �Ϻκи� �ٲ㼭 �� ��ó�� ��� ����.
	
	public MyFrame() {
		super(); //�ܺ� Ŭ�������� ��� ��: Frame f = new Frame();
		this.setSize(800, 600); //f.setSize(800, 600);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) { //�ñ׳��� �߻��Ͽ� paint()�� �Ҹ� �� ����(���� �θ��� �Լ��� �ƴ�)
		for (int i = 0; i < 10; i++) {
			Player pobj = new Player();
			pobj.display(g);
		}
		
	}
	
};
