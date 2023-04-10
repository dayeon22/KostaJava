package mycom.mytest;

import java.util.regex.Pattern;

public class Member {
    private int id;
    private String name;
    private String joinDate;
    private int purchaseCnt;
    private int point;
    private String grade;

    public Member(){
    }

    public Member(int id, String name, String joinDate, int purchaseCnt){
    	this.id = id;
    	this.name = name;
    	setJoinDate(joinDate);
    	setPurchaseCnt(purchaseCnt);
    }

    private void calcPoint(){
    	if (purchaseCnt < 3) {
    		this.point = purchaseCnt * 20;
    	} else if (purchaseCnt < 5) {
    		this.point = purchaseCnt * 30;
    	} else if (purchaseCnt < 10) {
    		this.point = purchaseCnt * 50;
    	} else {
    		this.point = purchaseCnt * 100;
    	}
    }

    private void giveGrade(){
    	if (this.point < 100) {
    		this.grade = "Family";
    	} else if (this.point < 300) {
    		this.grade = "Gold";
    	} else if (this.point < 500) {
    		this.grade = "VIP";
    	} else {
    		this.grade = "VVIP";
    	}
    }
    
    public void display() {
    	System.out.print(id + "\t");
    	System.out.print(name + "\t");
    	System.out.print(joinDate + "\t");
    	System.out.print(purchaseCnt + "\t");
    	System.out.print(point + "\t");
    	System.out.println(grade);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		String pattern = "^[0-9]{8}$";
		
		if (Pattern.matches(pattern, joinDate))
			this.joinDate = joinDate;
	}

	public int getPurchaseCnt() {
		return purchaseCnt;
	}

	public void setPurchaseCnt(int purchaseCnt) {
		if (purchaseCnt >= 0) {
			this.purchaseCnt = purchaseCnt;
			calcPoint();
			giveGrade();
		}
		
	}

	public int getPoint() {
		return point;
	}

	public String getGrade() {
		return grade;
	}

}
