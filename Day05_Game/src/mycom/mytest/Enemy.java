package mycom.mytest;

//extends: Ȯ��(��Ӱźδ� �ȵ�, ����� �߰��� ����)
public class Enemy extends Character {

	public Enemy() {
		super();
		myShape = "Enemy"; //��Ӱ��� ����.
	}
	
	//�ڽ� Ŭ�������� �߰�
	public void moveUp() {
		y = y - 1;
		this.display();
	}
	
	public void moveDown() {
		y = y + 1;
		this.display();
	}

	@Override //������̼�(��Ÿ���� ǥ��)
	public void display() { //�������̵�. �θ𿡰Լ� �������� �Լ��� �ڽ��� ������
		super.display();
	}
}
