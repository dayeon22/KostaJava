package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {
	public final static int FRAME_WIDTH = 800;
	public final static int FRAME_HEIGHT = 600;
	Duck[] ducks = new Duck[20];
	
	public MyFrame() {
		this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
		this.setVisible(true);
		makeDucks();
	}
	
	private void makeDucks() {
		Random random = new Random();

		if (ducks != null) {
			for (int i = 0; i < ducks.length; i++) {
				int randNum = random.nextInt(4);
				switch(randNum) {
				case 0:
					ducks[i] = new MallardDuck();
					break;
				case 1:
					ducks[i] = new RedDuck();
					break;
				case 2:
					ducks[i] = new RubberDuck();
					break;
				case 3:
					ducks[i] = new DecoyDuck();
					break;
				default:
					ducks[i] = new MallardDuck();
				}
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if (ducks != null) {
			for (int i = 0; i < ducks.length; i++) {
				if (ducks[i] != null) {
					ducks[i].display(g);
					ducks[i].swim(g);
				}
			}
		}
	}
}
