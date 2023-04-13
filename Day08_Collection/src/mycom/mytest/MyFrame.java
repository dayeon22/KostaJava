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
		super("마우스 클릭하면 도형이 생성되는 윈도우");
		this.addMouseListener(new MyHandler()); //이벤트 리스너 연결
		setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		//도형그리기
		shapeMgr.drawShapes(g);
	}

//	inner class: outer에서 접근을 많이하거나 잠깐 쓰고 버릴 때 사용(?)
	//MyListener가 mouseListener를 상속받고, 여기서는 MyListener를 상속받아 원하는 함수만 override할 수 있음
	class MyHandler extends MyListener {
		
		@Override
		public void mousePressed(MouseEvent e) { //e에 이벤트정보(마우스 좌표 등 모든정보)들어있음
			int mx = e.getX() - (MyShape.SHAPE_SIZE / 2);
			int my = e.getY() - (MyShape.SHAPE_SIZE / 2);
//			MyFrame.this.arr.add(RandomShape(mx, my)); //그냥 arr.add() 해도 되지만, 충돌시에 outer class의 arr에 접근하는 문법
			shapeMgr.addShapes(mx, my);
			repaint(); //paint(Graphics g)는 우리가 호출하는 함수가 아님. g도 없음.
		}
		
	} //MyHandler
}
