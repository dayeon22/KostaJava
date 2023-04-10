package mycom.mytest;

//extends: 확장(상속거부는 안됨, 변경과 추가는 가능)
public class Enemy extends Character {

	public Enemy() {
		super();
		myShape = "Enemy"; //상속값을 변경.
	}
	
	//자식 클래스에서 추가
	public void moveUp() {
		y = y - 1;
		this.display();
	}
	
	public void moveDown() {
		y = y + 1;
		this.display();
	}

	@Override //어노테이션(메타정보 표기)
	public void display() { //오버라이딩. 부모에게서 물려받은 함수를 자식이 재정의
		super.display();
	}
}
