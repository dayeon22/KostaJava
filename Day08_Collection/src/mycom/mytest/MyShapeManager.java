package mycom.mytest;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class MyShapeManager {
	ArrayList<MyShape> arr = new ArrayList<MyShape>();
	private static MyShapeManager shapeMgr = new MyShapeManager();
	
	private MyShapeManager() {
		
	}

	public static MyShapeManager getInstance() {
		return shapeMgr;
	}
	
	public void addShapes(int x, int y) {
		Random rnd = new Random();
		int type = rnd.nextInt(4);
		
		if (arr != null) {
			switch(type) {
			case 0:
				arr.add(new MyCircle(x, y));
				break;
			case 1:
				arr.add(new MyRect(x, y));
				break;
			case 2:
				arr.add(new MyStar(x, y));
				break;
			case 3:
				arr.add(new MyTri(x, y));
				break;
			default:
				arr.add(new MyCircle(x, y));
			}
		}
	}
	
	public void drawShapes(Graphics g) {
		if (arr != null) {
			for (MyShape shape : arr) {
				if (shape != null) {
					shape.display(g);
				}
			}
		}
	}
}
