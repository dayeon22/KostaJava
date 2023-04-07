package mycom.mytest;

public class Main {
	public static void main(String[] args) {
		// 형변환: 논리형을 제외한 7가지 데이터타입은 서로 변환 가능하다.
		// 암묵적 형변환: 상식적 형변환.
		// 명시적 형변환: 강제적 형변환. 데이터의 손실이 발생할 수 있으니 확인 후 변환하기

		int i = 10; //4byte
		double j = 10; //8byte에 4byte 데이터를 넣음(암묵적 형변환).
		int x = (int)20.5; //Type mismatch: cannot convert from double to int -> 명시적 형변환
		
		boolean k = true;
		char q = 'A'; //String str = "Hello"(문자열);
		
		int code = q; //정수형(4byte) = 문자(2byte);
		System.out.println(code);
		
		//int bcode = k; // 정수형(4bye) = 논리형(1byte); 논리형은 형변환을 할 수 없다.
	}
}; //옛날 자바에서는 세미콜론을 적었음. 선언문이기 때문에.
