package mycom.mytest;

public class Main {

	//단일책임 = 단일역할: 다수의 기능 + 다수의 데이터
	public static void main(String[] args) { //진입점 역할
		//실체를 만들어서 실행시키기
		//클래스 = 사용자 정의 타입
		Player pobj = new Player(); //pobj: 참조변수, new Player(): 객체 생성하여 heap 영역에 저장
		pobj.display();
		
		//클래스를 한번만 정의해 놓으면 인스턴를 무한정 생성할 수 있다.
		Player pobj2 = new Player();
		pobj2.display();
		
		Enemy enemy1 = new Enemy();
		enemy1.display();
		enemy1.moveRight();
		enemy1.display();
	}

}
