package mycom.mytest;

public class Main4 {

	public static void main(String[] args) {
		//for(;;): 무한루프
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}//for
		System.out.println();
		
		//초기값을 알 경우
		int[] korScore = {78, 57, 89, 88, 92};
		int[] mathScore = {88, 72, 75, 81, 94};
		//초기값을 모르는 경우
		int[] totalScore = new int[5];
		
		//for문을 이용해서 korScore의 5개값을 읽고 출력해보기
		for (int i = 0; i < 5; i++) {
			System.out.print(korScore[i] + " ");
		}
		System.out.println();
		
		//for-each문을 이용해서 mathScore의 5개 값을 읽고 출력하기
		for (int score : mathScore) {
			System.out.print(score + " ");
		}
	}

}
