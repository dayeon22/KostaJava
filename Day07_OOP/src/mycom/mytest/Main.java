package mycom.mytest;

/*
public class Main extends Object { //��� Ŭ������ Object Ŭ������ ��ӹ޴´�.

	public static void main(String[] args) {
		Main mobj = new Main(); //Ŭ���� �ڱ������� �����ϴ�.
		Main mobj2 = mobj;
	
		System.out.println(mobj.toString()); //toString: Object Ŭ�����κ��� ��ӹ��� �޼���
		System.out.println(mobj2); //�ڵ����� toString()�� ȣ��ȴ�.
	}

}
*/

public class Main {
	public static void main(String[] args) {
		WStudent w1 = new WStudent();
		System.out.println(w1); //�ڵ����� toString()ȣ��(WStudent���� �������̵���)
	}
}
