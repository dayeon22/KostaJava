package mycom.mytest;

public class Main {
	public static void main(String[] args) {
		Member member = new Member(1, "ȫ�浿", "20120212", 3);
		member.display();

		Member member2 = new Member();
		member2.setId(3);
		member2.setName("�̱浿");
		member2.setJoinDate("20130112");
		member2.setPurchaseCnt(10);
		member2.display();
	}

}
