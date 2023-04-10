package mycom.mytest;

public class Main {

	public static void main(String[] args) {
		Player pobj = new Player();
		
		pobj.display(); //부모로부터 함수를 물려받았기 때문에 사용 가능함.
	}

}
