package mycom.mytest;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new Map<String, Integer>(); //Map�� �߻�Ŭ������ �����ڷ� ���� �Ұ�
		Map<String, Integer> map = Map.of("���", 5, "�ٳ���", 3, "����", 10, "����", 1);
		HashMap<String, Integer> fruits = new HashMap<String, Integer>(map); //HashMap ������ ����. HashMap�� Ű���� �ߺ����� �ʵ��� ���ش�.
		
		fruits.put("����", 2);
		fruits.put("��", 10);
		fruits.remove("����"); //key�� ���� ��û�ؾ� �Ѵ�.
		
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());
		System.out.println(fruits.size());
		System.out.println(fruits.get("����"));
	}

}
