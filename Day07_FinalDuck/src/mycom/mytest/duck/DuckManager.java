package mycom.mytest.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {

	Duck[] arr = new Duck[20];
	
	public DuckManager() {
		makeDucks();
	}
	
	public void makeDucks() {
		Random rnd = new Random();
		int type = 0;
		
		for (int i = 0; i < arr.length; i++) {
			type = rnd.nextInt(4);
			switch(type) {
			case 0:
				arr[i] = new MallardDuck();
				break;
			case 1:
				arr[i] = new RedDuck();
				break;
			case 2:
				arr[i] = new RubberDuck();
				break;
			case 3:
				arr[i] = new DecoyDuck();
				break;
			default:
			}
		}
	}
	
	public void displayAllDucks(Graphics g) {
		for (Duck d : arr) {
			d.display(g);
		}
	}
	
	public void swimAllDucks(Graphics g) {
		for (Duck d : arr) {
			d.swim(g);
		}
	}
		
	public void quackAllDucks(Graphics g) {
		//부모입장에선 quack은 확장된 코드이다.
		for (Duck d : arr) { //자식 -> 업캐스팅(quack이 안보임) -> 다운캐스팅으로 복귀하여 가려진 것들이 다시 보이게 함.
			if (d != null && d instanceof Quackable) {
				((Quackable)d).quack(g); //Quackable과 상속이 끊어지더라도 오류가 안남. 상위코드로 의존하면 좋은 점 
			}
		}
	}
	
	public void flyAllDucks(Graphics g) {
//		d.fly(); //업캐스팅을 하면 자식에서 확장한 변수나 함수는 not visible 처리되기 때문에 사용할 수 없다.
		
//		이렇게 짜면 안됨. 부모가 자식에게 의존하게 됨. 부모는 자식이 타입이 뭔지, 날수있는지 등등을 알면 안됨!
//		if (d instanceof MallardDuck) {
//			((MallardDuck)d).fly(g); //다시 자식타입으로 다운캐스팅하여 함수를 사용한다.(자식 -> 부모 -> 자식)
//		} else if (d instanceof RedDuck) {
//			((RedDuck)d).fly(g);
//		} else if (d instanceof RubberDuck) {
//			((RubberDuck)d).fly(g);
//		}
		
		for (Duck d : arr) {
			if (d != null && d instanceof Flyable) {
				((Flyable)d).fly(g);
			}
		}
	}
}
