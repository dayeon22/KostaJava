package mycom.mytest;

public class Main2 {
	public static void main(String[] args) {
		//�����
		//��ɹ�ȣ�� �� �� Ŭ���ϸ� breakpoint�� �����ȴ�.
		//debug ��ư�� Ŭ���ϸ� ù breakpoint ���� �������� �����.
		//F5: Step Into
		//F6: Step Over
		
		//���� ������ �ýø� Ÿ��, ���� ������ �ɾ�ٴѴ�.
		boolean money; //����
		money = false; //����
		
		if (money) { //==: �񱳿�����
			System.out.println("�ýø� Ÿ�� ����.");
		} else {
			System.out.println("�ɾ��.");			
		}
		
		//����� ��������
		//����1. ���� 3000�� �̻��� ���� ������ �ִٸ� �ýø� Ÿ�� ���� �׷��� ������ �ɾ��.
		int m = 3000;
		if (m >= 3000) { // >=�� ��ɻ���Ŭ�� 2�� �����. ��뷮�̳� Ŭ���忡���� ����ȭ ���鿡�� �Ⱦ��°� ����.
			System.out.println("�ýø� Ÿ�� ����.");
		} else {
			System.out.println("�ɾ��.");			
		}
		
		//����2. ���� 3000�� �̻� �ְų� ī�尡 �ִٸ� �ýø� Ÿ�� ���� �׷��� ������ �ɾ��.
		boolean card = true;
		if (m >= 3000 || card) {
			System.out.println("�ýø� Ÿ�� ����.");
		} else {
			System.out.println("�ɾ��.");			
		}
		
	} //main
}
