package mycom.mytest;

public class Main {

	public static void main(String[] args) {
		int x = 0, y = 0;
		int result = 0;
		
		//������ �غ�
		x = 10; y = 20;
		//�ִ� ���ϱ� - �ݺ� �ڵ� => �Լ�
		result = getMax(x, y);
		System.out.println(result);
		
		//������ �غ�
		x = -30; y = 50;
		//�ִ� ���ϱ� - �ݺ� �ڵ� => �Լ�
		result = getMax(x, y);
		System.out.println(result);

		x = 5; y = 0;
		//�ִ� ���ϱ� - �ݺ� �ڵ� => �Լ�
		result = getMax(x, y);
		System.out.println(result);

	} //main
	
	static int getMax(int x, int y) { //�Ű�����, �Ķ����, �μ�
		int max = x; //��������
		
		if (max < y) {
			max = y;
		}
		
		return max;
	}

//	private static void getMax2(int max) { //�Լ� �ڵ� ����. �巡�� -> ��Ŭ�� -> Refactor -> Extract Method
//		int x;
//		int y;
//		x = 20;
//		y = 30;
//		if (max < y) {
//			max = y;
//		}
//		System.out.println("�ִ�: " + max);
//	}

}
