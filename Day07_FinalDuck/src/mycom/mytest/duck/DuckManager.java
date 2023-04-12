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
		//�θ����忡�� quack�� Ȯ��� �ڵ��̴�.
		for (Duck d : arr) { //�ڽ� -> ��ĳ����(quack�� �Ⱥ���) -> �ٿ�ĳ�������� �����Ͽ� ������ �͵��� �ٽ� ���̰� ��.
			if (d != null && d instanceof Quackable) {
				((Quackable)d).quack(g); //Quackable�� ����� ���������� ������ �ȳ�. �����ڵ�� �����ϸ� ���� �� 
			}
		}
	}
	
	public void flyAllDucks(Graphics g) {
//		d.fly(); //��ĳ������ �ϸ� �ڽĿ��� Ȯ���� ������ �Լ��� not visible ó���Ǳ� ������ ����� �� ����.
		
//		�̷��� ¥�� �ȵ�. �θ� �ڽĿ��� �����ϰ� ��. �θ�� �ڽ��� Ÿ���� ����, �����ִ��� ����� �˸� �ȵ�!
//		if (d instanceof MallardDuck) {
//			((MallardDuck)d).fly(g); //�ٽ� �ڽ�Ÿ������ �ٿ�ĳ�����Ͽ� �Լ��� ����Ѵ�.(�ڽ� -> �θ� -> �ڽ�)
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
