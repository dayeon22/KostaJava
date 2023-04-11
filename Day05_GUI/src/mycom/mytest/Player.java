package mycom.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
/*
//내 코드
public class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private int r;
	private int g;
	private int b;
	
	public Player() {
		this(50, 50);
	}
	
	public Player(int width, int height) {
		Random random = new Random();
		this.x = random.nextInt(800);
		this.y = random.nextInt(600);
		this.r = random.nextInt(256);
		this.g = random.nextInt(256);
		this.b = random.nextInt(256);
		this.width = width;
		this.height= height;
	}
	
	public void display(Graphics graphics) {
		Color c = new Color(r, g, b);
		graphics.setColor(c);
		
		//원 그리기
//		graphics.fillOval(x,  y, width, height);
		
		//별 그리기
		int[] starX = {x + 20, x + 25, x + 40, x + 30, x + 35, x + 20, x + 5, x + 10, x + 0, x + 15};
        int[] starY = {y + 0, y + 15, y + 15, y + 25, y + 40, y + 30, y + 40, y + 25, y + 15, y + 15};
        graphics.fillPolygon(starX, starY, 10);
	}

}
*/

//강사님 코드
public class Player {
	private int x; //인스턴스 변수(인스턴스마다 가지는 변수)
	private int y;
	public static final int shapeSize = 50; //클래스 변수(모든 인스턴스가 공유하는 변수). 보통 선언문에서 명시적 초기화를 한다.
	//static변수는 메모리할당이 가장 먼저 이루어지기 때문에, New연산자로 객체생성 여부와 관계없이 접근가능.
	//Player.shapeSize로 접근한다.
	//어차피 final이니까 public으로 열어 둠.
	
	public Player() {
		Random rnd = new Random();
		//화면 너비가 800이라고 하면 양 옆 50픽셀정도는 가려져있다. 도형이 잘리지 않게 하기 위해 양 옆 50픽셀(총 100픽셀) 정도는 여유로 남겨둠.
		x = rnd.nextInt(800 - 100) + 50; //0 ~ (최댓값 - 1)
		y = rnd.nextInt(600 - 140) + 70; // 70 ~ 529 픽셀
	}
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void display(Graphics g) {
		g.setColor(new Color(255, 0, 0));
		g.fillOval(x, y, Player.shapeSize, Player.shapeSize);
	}
}
