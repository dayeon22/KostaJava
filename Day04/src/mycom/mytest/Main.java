package mycom.mytest;

public class Main {

	//����å�� = ���Ͽ���: �ټ��� ��� + �ټ��� ������
	public static void main(String[] args) { //������ ����
		//��ü�� ���� �����Ű��
		//Ŭ���� = ����� ���� Ÿ��
		Player pobj = new Player(); //pobj: ��������, new Player(): ��ü �����Ͽ� heap ������ ����
		pobj.display();
		
		//Ŭ������ �ѹ��� ������ ������ �ν��ϸ� ������ ������ �� �ִ�.
		Player pobj2 = new Player();
		pobj2.display();
		
		Enemy enemy1 = new Enemy();
		enemy1.display();
		enemy1.moveRight();
		enemy1.display();
	}

}
