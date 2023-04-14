package mycom.mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		//������ �߻��ϸ� �ڿ������� ������ �����, ����ġ ���� �ߴ����� ���ø����̼��� �ŷڵ��� ������
		//����(���Ͼ��� ��)�� �����ϴ� �ڵ尡 �־�� ��.
		//if������ �ذ��� �� ���� -> ��� �õ��� �ϰ� ����ó���� ��
		try {
			FileInputStream fis = new FileInputStream("test.txt"); //������Ʈ ���� �ٷ� �ؿ� �ֱ� ������ ���ϸ� �ۼ���
			if (fis != null) {
				System.out.println("������ ���Ƚ��ϴ�.");
				int ch;
				while ((ch = fis.read()) != -1) { //���� �������� �ʱ� ������ for�� ��� while���� ��
//					System.out.print((char)ch); //����
					System.out.write((char)ch); //write: UTF-8 ó�����༭ �ȱ���
				}
			}
		} catch (FileNotFoundException e) { //JVM�� ���������� ��üȭ �ؼ� ������
			//�������� ������� �ʰ� �Ʒ� �ڵ尡 �����.
			System.out.println("�ش��ο� ������ �����ϴ�. Ȯ�����ּ���");
		} catch (IOException e) {
			System.out.println("���Ͽ� ������ �����ϴ�.");
		}
		//if������ ó���ϴ� ������ ��ó��
		//try-catch ������ ó���ϴ� ���� ��ó��
		//������ try-catch�� ó���ϴ� ���� ���� �ʴ�.
		//����ó���� �󸶳� ���ϴ��İ� ������Ʈ�� �ϼ����� �¿��Ѵ�.
		System.out.println("������� �� �����Դϴ�.");
		
	}
}
