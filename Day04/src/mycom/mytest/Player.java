package mycom.mytest;

//인스턴스 생성을 위한 클래스 정의. 모델링한 정보를 토대로 클래스를 작성한다.
//우선 객체를 설계하고 역할을 정의한다음 클래스를 작성해야 한다!! 코드는 설계 후에!
public class Player {
	//데이터 + 기능(명령어들)
	private int x; // 외부에서 접근하지 못하도록 private로 막아둠.
	private int y; //heap 영역에 할당되기 때문에 초기화하지 않아도 된다.
	private String myShape = "Player";
	
	public void display() {
		System.out.println("x=" + x + ", y=" + y + ": " + myShape);
	}
	
	public void moveLeft() {
		x = x - 1;
		display(); //지우고 다시 그려야 변경된 내용대로 움직인 효과를 냄
	}
	
	public void moveRight() {
		x = x + 1;
		display();
	}
}
