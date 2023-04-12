package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {
	public final static int FRAME_WIDTH = 800; //����� ��ü�� �ҹ��� �Ǵ� �빮�ڷ� ��Ÿ����.
	public final static int FRAME_HEIGHT = 600;
	Duck[] arr = new Duck[10];
	

	public MyFrame() {
//		super(); //� �����ڵ��� ���� ���� �θ��� default constructor�� �θ���.
		super("Duck Game"); //�ٸ� �����ڸ� ȣ���ϰ� �ʹٸ� ���� ȣ������� �Ѵ�.
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
				//�θ� = �ڽ�; ��ĳ����
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
		for(Duck d : arr) { //��ĳ���õ� ����: �ڽ��� Ȯ���� ���� �Ⱥ��δ�.
			d.display(g); //��ĳ������ �ߴ��� �ڽ��� �Լ��� ���� �����ϴ�. ��� �ڽ��� �Ѳ����� ���� ����.
			d.swim(g);
			d.quack(g);
		}
	}
	
}
