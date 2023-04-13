package mycom.mytest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class MyFrame extends Frame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	public MyShapeManager shapeMgr = MyShapeManager.getInstance();
	
	public MyFrame() {
		super("���콺 Ŭ���ϸ� ������ �����Ǵ� ������");
		this.addMouseListener(new MyHandler()); //�̺�Ʈ ������ ����
		setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		//�����׸���
		shapeMgr.drawShapes(g);
	}

//	inner class: outer���� ������ �����ϰų� ��� ���� ���� �� ���(?)
	//MyListener�� mouseListener�� ��ӹް�, ���⼭�� MyListener�� ��ӹ޾� ���ϴ� �Լ��� override�� �� ����
	class MyHandler extends MyListener {
		
		@Override
		public void mousePressed(MouseEvent e) { //e�� �̺�Ʈ����(���콺 ��ǥ �� �������)�������
			int mx = e.getX() - (MyShape.SHAPE_SIZE / 2);
			int my = e.getY() - (MyShape.SHAPE_SIZE / 2);
//			MyFrame.this.arr.add(RandomShape(mx, my)); //�׳� arr.add() �ص� ������, �浹�ÿ� outer class�� arr�� �����ϴ� ����
			shapeMgr.addShapes(mx, my);
			repaint(); //paint(Graphics g)�� �츮�� ȣ���ϴ� �Լ��� �ƴ�. g�� ����.
		}
		
	} //MyHandler
}
