package mycom.mytest;

public class WStudent extends Woman implements Student { //implements Student, Woman {}처럼 다중상속 가능

	@Override
	public String toString() { //Object로부터 상속받은 toString() 메서드를 오버라이딩
		return "WStudent [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void greeting() {
		
	}
	
}
