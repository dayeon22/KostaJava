package mycom.mytest;

import java.util.regex.Pattern;

public class StudentInfo {
    private String haknum; //c1005
    private String sname;
    private int kor;
    private int eng;
    private int math;
    private int total;

    //�⺻ ������
    public StudentInfo(){
    }

    //������ �����ε�(������)
    public StudentInfo(String haknum, String sname, int kor, int eng, int math){
    	setHaknum(haknum);
    	this.sname = sname;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    	calTotal();
    }

    private void calTotal(){
    	this.total = this.kor + this.eng + this.math;
    }

    public void display(){
    	calTotal();
    	System.out.print(haknum + "\t");
    	System.out.print(sname + "\t");
    	System.out.print(kor + "\t");
    	System.out.print(eng + "\t");
    	System.out.print(math + "\t");
    	System.out.println(total);
    }


    //getter/setter �ڵ��ϼ�
	public String getHaknum() {
		return haknum;
	}

	//�й��� �������� �ƴ��� �˻���(����ǥ����)
	//���ĺ� �ҹ��� 1���ڷ� �����ϰ�, ���������� 4�ڸ�(�� 5�ڸ�)������ �˻�
	public void setHaknum(String haknum) {
		//����ǥ����(https://wikidocs.net/1669)
		String pattern = "^[a-z]{1}[0-9]{4}$";
		if (Pattern.matches(pattern, haknum)) //static �޼���� new ���� ��� ����.
			this.haknum = haknum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (0 <= kor && kor <= 100) {
			this.kor = kor;
			calTotal();
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (0 <= eng && eng <= 100) {
			this.eng = eng;
			calTotal();
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (0 <= math && math <= 100) {
			this.math = math;
			calTotal();
		}
	}

	public int getTotal() {
		return total;
	}
    
}
