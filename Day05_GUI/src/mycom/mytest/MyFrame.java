package mycom.mytest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

//도형이 그려진 Frame
public class MyFrame extends Frame { //상속의 장점: 남이 짜놓은 코드를 일부분만 바꿔서 내 것처럼 사용 가능.
	
	public MyFrame() {
		super(); //외부 클래스에서 사용 시: Frame f = new Frame();
		this.setSize(800, 600); //f.setSize(800, 600);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) { //시그널이 발생하여 paint()가 불릴 때 수행(내가 부르는 함수가 아님)
		for (int i = 0; i < 10; i++) {
			Player pobj = new Player();
			pobj.display(g);
		}
		
	}
	
};
