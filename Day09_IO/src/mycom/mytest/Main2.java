package mycom.mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException { //JVM�� main�� ȣ���߱� ������ ������ JVM�� throw�� -> JVM�� �����۾��� ����Ͽ� ����ó��
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("test.txt");
			//Decoration Pattern
			isr = new InputStreamReader(fis);
			//���ڿ������� ó��
			br = new BufferedReader(isr);
			
			String str = br.readLine();
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			System.out.println("�ش��ο� ������ �����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ������ �����ϴ�");
		} finally { //������ ���� �ȳ��� ������ ����
			//������ ���� �������� �ش� ��ü�� ������ �Ǿ �ٸ� ��ü�� ������ �� ����. -> ��� �� �ݾ���� �Ѵ�.
			if (br != null) br.close(); //���� ������ �ݴ�� �ݴ´�.
			if (isr != null) isr.close(); //���� ������ �𸣱� ������ null guard
			if (fis != null) fis.close(); //close()�� ������ throw�ϱ� ������ �츮�� ó���ؾ� ��(�츮�� ����)
		}
		
	}//main �� -> ������ ����

}
