package mycom.mytest;

import java.awt.Graphics;

public class MyStar extends MyShape {
	
	public MyStar() {
		
	}
	
	public MyStar(int mx, int my) {
		super(mx, my);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(color);
		int[] starX = {x + 20, x + 25, x + 40, x + 30, x + 35, x + 20, x + 5, x + 10, x + 0, x + 15};
        int[] starY = {y + 0, y + 15, y + 15, y + 25, y + 40, y + 30, y + 40, y + 25, y + 15, y + 15};
        g.fillPolygon(starX, starY, 10);
	}
	
}
