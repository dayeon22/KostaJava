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
	ArrayList<MyShape> arr = new ArrayList<MyShape>();
	
	public MyFrame() {
		super("���콺 Ŭ���ϸ� ������ �����Ǵ� ������");
		this.addMouseListener(new MyHandler()); //�̺�Ʈ ������ ����
		setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		//�����׸���
		for (MyShape shape : arr) {
			shape.display(g);
		}
	}

//	inner class: outer���� ������ �����ϰų� ��� ���� ���� �� ���(?)
	//MyListener�� mouseListener�� ��ӹް�, ���⼭�� MyListener�� ��ӹ޾� ���ϴ� �Լ��� override�� �� ����
	class MyHandler extends MyListener {
		
		public MyShape RandomShape(int x, int y) {
			Random rnd = new Random();
			int type = rnd.nextInt(4);
			
			switch(type) {
			case 0:
				return new MyCircle(x, y);
			case 1:
				return new MyRect(x, y);
			case 2:
				return new MyStar(x, y);
			case 3:
				return new MyTri(x, y);
			default:
				return new MyCircle(x, y);
			}
		}
		
		@Override
		public void mousePressed(MouseEvent e) { //e�� �̺�Ʈ����(���콺 ��ǥ �� �������)�������
			int mx = e.getX() - (MyShape.SHAPE_SIZE / 2);
			int my = e.getY() - (MyShape.SHAPE_SIZE / 2);
			MyFrame.this.arr.add(RandomShape(mx, my)); //�׳� arr.add() �ص� ������, �浹�ÿ� outer class�� arr�� �����ϴ� ����
			repaint(); //paint(Graphics g)�� �츮�� ȣ���ϴ� �Լ��� �ƴ�. g�� ����.
		}
		
	} //MyHandler
}
