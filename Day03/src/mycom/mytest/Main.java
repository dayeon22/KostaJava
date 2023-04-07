package mycom.mytest;

public class Main {

	public static void main(String[] args) {
		int x = 0, y = 0;
		int result = 0;
		
		//데이터 준비
		x = 10; y = 20;
		//최댓값 구하기 - 반복 코드 => 함수
		result = getMax(x, y);
		System.out.println(result);
		
		//데이터 준비
		x = -30; y = 50;
		//최댓값 구하기 - 반복 코드 => 함수
		result = getMax(x, y);
		System.out.println(result);

		x = 5; y = 0;
		//최댓값 구하기 - 반복 코드 => 함수
		result = getMax(x, y);
		System.out.println(result);

	} //main
	
	static int getMax(int x, int y) { //매개변수, 파라미터, 인수
		int max = x; //지역변수
		
		if (max < y) {
			max = y;
		}
		
		return max;
	}

//	private static void getMax2(int max) { //함수 자동 생성. 드래그 -> 우클릭 -> Refactor -> Extract Method
//		int x;
//		int y;
//		x = 20;
//		y = 30;
//		if (max < y) {
//			max = y;
//		}
//		System.out.println("최댓값: " + max);
//	}

}
