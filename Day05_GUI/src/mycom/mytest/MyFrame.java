package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;

//������ �׷��� Frame
public class MyFrame extends Frame { //����� ����: ���� ¥���� �ڵ带 �Ϻκи� �ٲ㼭 �� ��ó�� ��� ����.
	
	Player[] arr = new Player[10]; //�迭����. arr�� player 10��¥�� �ּҸ� ����Ű��, arr[i]�� null�� ����Ŵ.
	
	public MyFrame() {
		super(); //�ܺ� Ŭ�������� ��� ��: Frame f = new Frame();
		makePlayers();
		this.setSize(800, 600); //f.setSize(800, 600);
		this.setVisible(true);		
	}

	//�ϴ� �� ���ư��� ȿ������ ���� �Լ��� �и��ϴ� �� �ڵ带 ������(�����丵)
	private void makePlayers() {
		if (arr != null) { //�������� �ڵ带 ���ؼ��� null guard�� �ʿ���.(null�� exception���� ó���ϴ� �� �ƴ�! if�� ó���ϱ�)
			for (int i = 0; i < arr.length; i++) { //�ڹٿ����� �迭�� ��üȭ�ؼ� �ٷ�� ������ length��� �Ӽ��� ��� ����.
				arr[i] = new Player();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) { //�ñ׳��� �߻��Ͽ� paint()�� �Ҹ� �� ����(���� �θ��� �Լ��� �ƴ�)
		if (arr != null) {
			for (Player item : arr) {
				//��ü�� �ڽ��� ��� ���� �ؾ� ��(player�� ��ü������ �׸��� �׸� �� �ְ� �ؾ� ��)
				if (item != null) {
					item.display(g); //�׸��� �׸� �� �ִ� Graphics ��ü�� ������ �� -> display �Լ����� g�� ����� �� �����Ƿ� �׸� �׸��� ����
				}
			} //for
		} //if
		
	}
	
};
