package mycom.mytest;

public class WStudent extends Woman implements Student { //implements Student, Woman {}ó�� ���߻�� ����

	@Override
	public String toString() { //Object�κ��� ��ӹ��� toString() �޼��带 �������̵�
		return "WStudent [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void greeting() {
		
	}
	
}
