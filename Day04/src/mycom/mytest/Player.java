package mycom.mytest;

//�ν��Ͻ� ������ ���� Ŭ���� ����. �𵨸��� ������ ���� Ŭ������ �ۼ��Ѵ�.
//�켱 ��ü�� �����ϰ� ������ �����Ѵ��� Ŭ������ �ۼ��ؾ� �Ѵ�!! �ڵ�� ���� �Ŀ�!
public class Player {
	//������ + ���(��ɾ��)
	private int x; // �ܺο��� �������� ���ϵ��� private�� ���Ƶ�.
	private int y; //heap ������ �Ҵ�Ǳ� ������ �ʱ�ȭ���� �ʾƵ� �ȴ�.
	private String myShape = "Player";
	
	public void display() {
		System.out.println("x=" + x + ", y=" + y + ": " + myShape);
	}
	
	public void moveLeft() {
		x = x - 1;
		display(); //����� �ٽ� �׷��� ����� ������ ������ ȿ���� ��
	}
	
	public void moveRight() {
		x = x + 1;
		display();
	}
}
