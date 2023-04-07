package mycom.mytest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Main {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200, 200);
		Color c = new Color(100, 100, 200);
		Color fc = new Color(255, 255, 255);
		
		//component 생성, 설정
		Label loginLabel = new Label("로그인 화면");
		loginLabel.setBounds(10, 10, 190, 50);
		loginLabel.setAlignment(Label.CENTER);
		loginLabel.setBackground(c);
		loginLabel.setForeground(fc);
				
		Label idLabel = new Label("아이디: ");
		TextField idTf = new TextField();
		idTf.setColumns(10);
		
		Label pwLabel = new Label("비밀번호: ");
		TextField pwTf = new TextField();
		pwTf.setColumns(10);
		
		Button loginBtn = new Button("로그인");
		loginBtn.setBackground(c);
		loginBtn.setForeground(fc);
		
		Button cancelBtn = new Button("취소");
		cancelBtn.setBackground(c);
		cancelBtn.setForeground(fc);
		
		//Panel을 생성하고 component들을 넣음
		Panel mainPanel = new Panel();
		mainPanel.setLayout(new GridLayout(4, 4));
		Panel panel1 = new Panel();
		panel1.setLayout(null);
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		Panel panel4 = new Panel();
		
		panel1.add(loginLabel);
		panel2.add("West", idLabel);
		panel2.add("Center", idTf);
		panel3.add("West", pwLabel);
		panel3.add("Center", pwTf);
		panel4.add("West", loginBtn);
		panel4.add("Center", cancelBtn);
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		
		//frame에 panel을 넣음
		f.add("Center", mainPanel);
		
		f.setVisible(true); //운영체제에게 화면을 띄우겠다는 의사를 밝힘. 바로 모니터에 접근하지 않고 운영체제를 통해 요청해야 함.
	}

}
