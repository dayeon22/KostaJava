package mycom.mytest;

public class Enemy {
	private int x;
	private int y;
	private String myShape = "Enemy";
	
	public void display() {
		System.out.println("x=" + x + ", y=" + y + ": " + myShape);
	}
	
	public void moveLeft() { x--; }
	
	public void moveRight() { x++; }
	
	public void moveUp() { y--; }
	
	public void moveDown() { y++; }

}
