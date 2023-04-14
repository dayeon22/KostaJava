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
				System.out.println("파일이 열렸습니다.");
				int ch;
				while ((ch = fr.read()) != -1) {
					fw.write((char)ch);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당경로에 파일이 없습니다. 확인해주세요");
		} catch (IOException e) {
			System.out.println("파일에 내용이 없습니다.");
		}
		System.out.println("정상수행 후 종료입니다.");
	}
}
