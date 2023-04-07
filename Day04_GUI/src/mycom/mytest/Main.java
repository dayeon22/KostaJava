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
		
		//component ����, ����
		Label loginLabel = new Label("�α��� ȭ��");
		loginLabel.setBounds(10, 10, 190, 50);
		loginLabel.setAlignment(Label.CENTER);
		loginLabel.setBackground(c);
		loginLabel.setForeground(fc);
				
		Label idLabel = new Label("���̵�: ");
		TextField idTf = new TextField();
		idTf.setColumns(10);
		
		Label pwLabel = new Label("��й�ȣ: ");
		TextField pwTf = new TextField();
		pwTf.setColumns(10);
		
		Button loginBtn = new Button("�α���");
		loginBtn.setBackground(c);
		loginBtn.setForeground(fc);
		
		Button cancelBtn = new Button("���");
		cancelBtn.setBackground(c);
		cancelBtn.setForeground(fc);
		
		//Panel�� �����ϰ� component���� ����
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
		
		//frame�� panel�� ����
		f.add("Center", mainPanel);
		
		f.setVisible(true); //�ü������ ȭ���� ���ڴٴ� �ǻ縦 ����. �ٷ� ����Ϳ� �������� �ʰ� �ü���� ���� ��û�ؾ� ��.
	}

}
