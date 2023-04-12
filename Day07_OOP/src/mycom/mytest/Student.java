package mycom.mytest;

public interface Student {
	public static final String id = "학생"; //인터페이스 변수엔 무조건 static final이 붙음. 무조건 상수만 선언 가능함
	
	public abstract void greeting(); //추상메서드만 사용가능. abstract 키워드 생략 가능
}
