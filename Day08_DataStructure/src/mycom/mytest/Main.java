package mycom.mytest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		//Generic: ���� �߿� Ÿ���� �����Ѵ�.
		
		ArrayList arr = new ArrayList(); //ArrayList<Object> arr = new ArrayList<Object>(); �� ���� �ǹ�
		arr.add("Hello"); //String -> Object
		arr.add(20); //int -> (wrapping) -> Integer -> Object
		arr.add(56.8); //double -> (wrapping) -> Double -> Object
		arr.add(true); //boolean -> (wrapping) -> Boolean -> Object
		
		for (Object obj : arr) { //��� ��Ұ� Object�� ��ĳ���õǾ�����
//			obj.toUppserCase() //.toUppserCase()���� �Լ� ���Ұ�. ��ĳ�����߱� ������
			// Ÿ���� �������ϱ� ����Ϸ��� if (obj instanceof String) else if (obj instanceof Integer)... �̷������� ��� �˻��ؾ� ��
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
		
		//�÷��� �����ӿ�ũ
		//���� �۵������ ���� �ٸ����� ��ɾ�� ��� ������ �����س���(�ϰ��� ������� ������)
		//��ɾ ���ٰ� �ƹ��ų� ����ϸ� �ȵǰ� �ڷᱸ���� Ư���� �ľ��س��� ȿ������ �ڷᱸ���� �����ؾ� ��
	}
}
