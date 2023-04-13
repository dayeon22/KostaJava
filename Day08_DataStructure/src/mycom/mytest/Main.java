package mycom.mytest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		//Generic: 실행 중에 타입을 결정한다.
		
		ArrayList arr = new ArrayList(); //ArrayList<Object> arr = new ArrayList<Object>(); 와 같은 의미
		arr.add("Hello"); //String -> Object
		arr.add(20); //int -> (wrapping) -> Integer -> Object
		arr.add(56.8); //double -> (wrapping) -> Double -> Object
		arr.add(true); //boolean -> (wrapping) -> Boolean -> Object
		
		for (Object obj : arr) { //모든 요소가 Object로 업캐스팅되어있음
//			obj.toUppserCase() //.toUppserCase()같은 함수 사용불가. 업캐스팅했기 때문에
			// 타입이 여러개니까 사용하려면 if (obj instanceof String) else if (obj instanceof Integer)... 이런식으로 모두 검사해야 함
		}
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Hello");
		arr2.add("World");
		for (String obj : arr2) {
			obj.toUpperCase();
		}

		LinkedList<Integer> larr = new LinkedList<Integer>();
		larr.add(30);
		larr.add(50);
		
		//컬렉션 프레임워크
		//내부 작동방식은 전혀 다르지만 명령어는 모두 같도록 구현해놓음(일관된 사용방식을 제공함)
		//명령어가 같다고 아무거나 사용하면 안되고 자료구조의 특성을 파악해놓고 효율적인 자료구조를 선택해야 함
	}
}
