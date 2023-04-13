package mycom.mytest;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new Map<String, Integer>(); //Map은 추상클래스라서 생성자로 생성 불가
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
		HashMap<String, Integer> fruits = new HashMap<String, Integer>(map); //HashMap 구조로 변경. HashMap은 키값이 중복되지 않도록 해준다.
		
		fruits.put("망고", 2);
		fruits.put("귤", 10);
		fruits.remove("딸기"); //key를 통해 요청해야 한다.
		
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());
		System.out.println(fruits.size());
		System.out.println(fruits.get("포도"));
	}

}
