package mycom.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Assignment15 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		
		try {
			fis = new FileInputStream("sample.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			String str = "";
			String result = "";
			while ((str = br.readLine()) != null) {
				result += str + "\n";
			}
			if (br != null)
				br.close();
			result = result.replaceAll("python", "java");
			result = result.substring(0, result.length() - 1);
			fw = new FileWriter("sample.txt");
			fw.write(result);
			fw.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("해당경로에 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("읽을 내용이 없습니다");
			if (fw != null) fw.close();
			if (br != null) br.close();
			if (isr != null) isr.close();
			if (fis != null) fis.close();
		}
	}

}
