package mycom.mytest;

/*
public class Main extends Object { //모든 클래스는 Object 클래스를 상속받는다.

	public static void main(String[] args) {
		Main mobj = new Main(); //클래스 자기참조가 가능하다.
		Main mobj2 = mobj;
	
		System.out.println(mobj.toString()); //toString: Object 클래스로부터 상속받은 메서드
		System.out.println(mobj2); //자동으로 toString()이 호출된다.
	}

}
*/

public class Main {
	public static void main(String[] args) {
		WStudent w1 = new WStudent();
		System.out.println(w1); //자동으로 toString()호출(WStudent에서 오버라이딩함)
	}
}
