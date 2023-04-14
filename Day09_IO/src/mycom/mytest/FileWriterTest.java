package mycom.mytest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			FileWriter fw = new FileWriter("test2.txt");
			
			if (fr != null && fw != null) {
				System.out.println("������ ���Ƚ��ϴ�.");
				int ch;
				while ((ch = fr.read()) != -1) {
					fw.write((char)ch);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ش��ο� ������ �����ϴ�. Ȯ�����ּ���");
		} catch (IOException e) {
			System.out.println("���Ͽ� ������ �����ϴ�.");
		}
		System.out.println("������� �� �����Դϴ�.");
	}
}
