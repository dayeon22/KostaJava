package mycom.mytest;

public class Main3 {
	public static void main(String[] args) {
		int month = 2;
		String monthString = null; //�ּڰ� �ʱ�ȭ �� ���. �ƹ��͵� ����Ű�� �ʴ´�.
		monthString = ""; //�� ���ڿ��� �� ������ ����Ų��.
		
		//switch������ break�� ����ϴ� ����: �ѹ� �ɸ��� true��� ���� ����Ǳ� ������ �����͵鵵 �����.
		switch(month) { //switch-case���� ��ȣ���� �ݵ�� ������ �;� ��.
		case 1:
			monthString = "January";
			break; //switch, for, while���� Ż���ϴ� �ڵ�.
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		default:
			monthString = "Invalid Month";
		}
		System.out.println(monthString);
	}
}
