package mycom.mytest;

public class Main {

	public static void main(String[] args) {
		//generic�� Object�� �� �� ���� -> �⺻���� Object������ ��ȯ�ؾ� ��.
		//Wrapper Ŭ���� ����ϸ� ��ȯ ����.
		//int -> Integer
		//double -> Double
		//char[] -> String
		
//		Integer iobj = new Integer(20); //��������
		Integer iobj = 20; //�⺻���� Object(������)�� �ڵ� ��ȯ����
		int i = iobj.intValue(); //�������� �⺻������ ��ȯ
		
		Entry<String, Integer> e1 = new Entry<>("ȫ�浿", 20); //���൵�߿� String, Integer�� ����
		System.out.println(e1.getKey() + ", " + e1.getValue());
		
		Entry<String, String> e2 = new Entry<>("ȫ�浿", "��ǻ�Ͱ���"); //���൵�߿� String, String���� ����
		System.out.println(e1.getKey() + ", " + e1.getValue());
		
	}

}
