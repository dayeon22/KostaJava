package mycom.mytest;

public class Main3 {
	public static void main(String[] args) {
		int month = 2;
		String monthString = null; //주솟값 초기화 시 사용. 아무것도 가리키지 않는다.
		monthString = ""; //빈 문자열이 들어간 공간을 가리킨다.
		
		//switch문에서 break를 써야하는 이유: 한번 걸리면 true라는 값이 내장되기 때문에 다음것들도 수행됨.
		switch(month) { //switch-case문의 괄호에는 반드시 정수가 와야 함.
		case 1:
			monthString = "January";
			break; //switch, for, while문을 탈출하는 코드.
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
