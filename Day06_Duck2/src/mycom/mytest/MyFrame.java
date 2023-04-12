package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {
	public final static int FRAME_WIDTH = 800; //상수는 전체를 소문자 또는 대문자로 나타낸다.
	public final static int FRAME_HEIGHT = 600;
	Duck[] arr = new Duck[10];
	

	public MyFrame() {
//		super(); //어떤 생성자든지 가장 먼저 부모의 default constructor를 부른다.
		super("Duck Game"); //다른 생성자를 호출하고 싶다면 직접 호출해줘야 한다.
		this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
		this.setVisible(true);
		makeDucks();
	}
	
	private void makeDucks() {
		Random rnd = new Random();
		int type = 0; //0 or 1
		
		for (int i = 0; i < arr.length; i++) {
			type = rnd.nextInt(2); //0 ~ 1
			
			switch(type) {
			case 0:
				//부모 = 자식; 업캐스팅
				arr[i] = new MallardDuck();
				break;
			case 1:
				arr[i] = new RedDuck();
				break;
			default:
				arr[i] = new MallardDuck();
			}
		}//for
		
	}//makeDucks()
	
	@Override
	public void paint(Graphics g) {
		for(Duck d : arr) { //업캐스팅된 상태: 자식이 확장한 것은 안보인다.
			d.display(g); //업캐스팅을 했더라도 자식의 함수에 접근 가능하다. 모든 자식을 한꺼번에 제어 가능.
			d.swim(g);
			d.quack(g);
		}
	}
	
}
