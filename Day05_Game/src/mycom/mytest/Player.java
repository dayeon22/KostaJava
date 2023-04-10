package mycom.mytest;

public class Player extends Character {
	public Player() {
		super(); //부모의 생성자. 호출하지 않아도 무조건 먼저 불린다. 생성자의 첫 줄에 써야한다.
		myShape = "Player";
	}
}
