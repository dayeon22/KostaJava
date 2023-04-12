package mycom.mytest.duck;

import java.awt.Graphics;

//interface: 중간역할. MyFrame과 Duck의 중간점으로써 둘을 연결해준다. 날 수 있는 Duck에 접근할 때 Flyable 인터페이스를 통해야한다.
public interface Flyable {
	public void fly(Graphics g);
}
