package mycom.mytest;

public class Main {
	public static void main(String[] args) {
		// ����ȯ: ������ ������ 7���� ������Ÿ���� ���� ��ȯ �����ϴ�.
		// �Ϲ��� ����ȯ: ����� ����ȯ.
		// ����� ����ȯ: ������ ����ȯ. �������� �ս��� �߻��� �� ������ Ȯ�� �� ��ȯ�ϱ�

		int i = 10; //4byte
		double j = 10; //8byte�� 4byte �����͸� ����(�Ϲ��� ����ȯ).
		int x = (int)20.5; //Type mismatch: cannot convert from double to int -> ����� ����ȯ
		
		boolean k = true;
		char q = 'A'; //String str = "Hello"(���ڿ�);
		
		int code = q; //������(4byte) = ����(2byte);
		System.out.println(code);
		
		//int bcode = k; // ������(4bye) = ����(1byte); ������ ����ȯ�� �� �� ����.
	}
}; //���� �ڹٿ����� �����ݷ��� ������. �����̱� ������.
