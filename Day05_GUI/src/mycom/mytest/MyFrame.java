package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;

//도형이 그려진 Frame
public class MyFrame extends Frame { //상속의 장점: 남이 짜놓은 코드를 일부분만 바꿔서 내 것처럼 사용 가능.
	
	Player[] arr = new Player[10]; //배열선언문. arr은 player 10개짜리 주소를 가리키고, arr[i]는 null을 가리킴.
	
	public MyFrame() {
		super(); //외부 클래스에서 사용 시: Frame f = new Frame();
		makePlayers();
		this.setSize(800, 600); //f.setSize(800, 600);
		this.setVisible(true);		
	}

	//일단 잘 돌아가면 효율성을 위해 함수를 분리하는 등 코드를 변경함(리펙토링)
	private void makePlayers() {
		if (arr != null) { //안정적인 코드를 위해서는 null guard가 필요함.(null은 exception으로 처리하는 것 아님! if로 처리하기)
			for (int i = 0; i < arr.length; i++) { //자바에서는 배열을 객체화해서 다루기 때문에 length라는 속성을 사용 가능.
				arr[i] = new Player();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) { //시그널이 발생하여 paint()가 불릴 때 수행(내가 부르는 함수가 아님)
		if (arr != null) {
			for (Player item : arr) {
				//객체는 자신이 모든 일을 해야 함(player가 자체적으로 그림을 그릴 수 있게 해야 함)
				if (item != null) {
					item.display(g); //그림을 그릴 수 있는 Graphics 객체를 전달해 줌 -> display 함수에서 g를 사용할 수 있으므로 그림 그리기 가능
				}
			} //for
		} //if
		
	}
	
};
