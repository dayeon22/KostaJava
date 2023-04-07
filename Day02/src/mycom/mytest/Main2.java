package mycom.mytest;

public class Main2 {
	public static void main(String[] args) {
		//디버깅
		//명령번호를 두 번 클릭하면 breakpoint가 설정된다.
		//debug 버튼을 클릭하면 첫 breakpoint 실행 직전에서 멈춘다.
		//F5: Step Into
		//F6: Step Over
		
		//돈이 있으면 택시를 타고, 돈이 없으면 걸어다닌다.
		boolean money; //선언
		money = false; //실행
		
		if (money) { //==: 비교연산자
			System.out.println("택시를 타고 간다.");
		} else {
			System.out.println("걸어간다.");			
		}
		
		//디버깅 연습문제
		//문제1. 만약 3000원 이상의 돈을 가지고 있다면 택시를 타고 가고 그렇지 않으면 걸어가라.
		int m = 3000;
		if (m >= 3000) { // >=는 명령사이클이 2번 실행됨. 대용량이나 클라우드에서는 최적화 측면에서 안쓰는게 좋음.
			System.out.println("택시를 타고 간다.");
		} else {
			System.out.println("걸어간다.");			
		}
		
		//문제2. 돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 가고 그렇지 않으면 걸어가라.
		boolean card = true;
		if (m >= 3000 || card) {
			System.out.println("택시를 타고 간다.");
		} else {
			System.out.println("걸어간다.");			
		}
		
	} //main
}
