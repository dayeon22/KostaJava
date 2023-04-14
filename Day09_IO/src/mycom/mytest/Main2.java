package mycom.mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException { //JVM이 main을 호출했기 때문에 에러를 JVM에 throw함 -> JVM은 빨간글씨로 출력하여 에러처리
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("test.txt");
			//Decoration Pattern
			isr = new InputStreamReader(fis);
			//문자열단위의 처리
			br = new BufferedReader(isr);
			
			String str = br.readLine();
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			System.out.println("해당경로에 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("읽을 내용이 없습니다");
		} finally { //오류가 나든 안나든 무조건 실행
			//파일을 열면 독점권을 해당 객체가 가지게 되어서 다른 객체가 수정할 수 없다. -> 사용 후 닫아줘야 한다.
			if (br != null) br.close(); //열은 순서의 반대로 닫는다.
			if (isr != null) isr.close(); //언제 터진지 모르기 때문에 null guard
			if (fis != null) fis.close(); //close()는 에러를 throw하기 때문에 우리가 처리해야 함(우리도 던짐)
		}
		
	}//main 끝 -> 독점권 정리

}
