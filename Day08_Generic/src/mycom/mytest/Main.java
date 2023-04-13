package mycom.mytest;

public class Main {

	public static void main(String[] args) {
		//generic은 Object만 들어갈 수 있음 -> 기본형을 Object형으로 변환해야 함.
		//Wrapper 클래스 사용하면 변환 가능.
		//int -> Integer
		//double -> Double
		//char[] -> String
		
//		Integer iobj = new Integer(20); //비권장사항
		Integer iobj = 20; //기본형을 Object(참조형)로 자동 변환해줌
		int i = iobj.intValue(); //참조형을 기본형으로 변환
		
		Entry<String, Integer> e1 = new Entry<>("홍길동", 20); //실행도중에 String, Integer로 매핑
		System.out.println(e1.getKey() + ", " + e1.getValue());
		
		Entry<String, String> e2 = new Entry<>("홍길동", "컴퓨터공학"); //실행도중에 String, String으로 매핑
		System.out.println(e1.getKey() + ", " + e1.getValue());
		
	}

}
