package mycom.mytest;

public class Main {
	public static void main(String[] args) {
		StudentInfo student = new StudentInfo("342434", "박다연", 70, 86, 53);
		StudentInfo student2 = new StudentInfo();
		
		student2.setHaknum("a1232");
		student2.setSname("홍길동");
		student2.setKor(89);
		student2.setEng(44);
		student2.setMath(99);
		
		student.display();
		student2.display();
	}

}
