package mycom.mytest;

public class Main4 {

	public static void main(String[] args) {
		//for(;;): ���ѷ���
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}//for
		System.out.println();
		
		//�ʱⰪ�� �� ���
		int[] korScore = {78, 57, 89, 88, 92};
		int[] mathScore = {88, 72, 75, 81, 94};
		//�ʱⰪ�� �𸣴� ���
		int[] totalScore = new int[5];
		
		//for���� �̿��ؼ� korScore�� 5������ �а� ����غ���
		for (int i = 0; i < 5; i++) {
			System.out.print(korScore[i] + " ");
		}
		System.out.println();
		
		//for-each���� �̿��ؼ� mathScore�� 5�� ���� �а� ����ϱ�
		for (int score : mathScore) {
			System.out.print(score + " ");
		}
	}

}
