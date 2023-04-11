package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame {
	public final static int FRAME_WIDTH = 800;
	public final static int FRAME_HEIGHT = 600;
	private Duck[] ducks = new Duck[10];
	
	public MyFrame() {
		makeDucks();
		this.setSize(FRAME_WIDTH, FRAME_WIDTH);
		this.setVisible(true);
	}
	
	public void makeDucks() {
		int i = 0;
		
		if (ducks != null) {
			while (i < 5) {
				ducks[i] = new MallardDuck();
				i++;
			}
			while (i < 10) {
				ducks[i] = new RedDuck();
				i++;
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if (ducks != null) {
			for (Duck duck : ducks) {
				if (duck != null) {
					duck.display(g);
					duck.swim(g);
					duck.quack(g);
				}
			}
		}
	}

}
