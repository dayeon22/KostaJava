package mycom.mytest;

import java.awt.Graphics;

public class MyTri extends MyShape {
	
	public MyTri() {
		
	}
	
	public MyTri(int mx, int my) {
		super(mx, my);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(color);
		int[] triX = {x, x + 25, x + 50};
        int[] triY = {y + 50, y, y + 50};
        g.fillPolygon(triX, triY, 3);
	}
	
}
