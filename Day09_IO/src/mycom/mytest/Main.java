package mycom.mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		//오류가 발생하면 자원수거의 문제가 생기고, 예기치 않은 중단으로 어플리케이션의 신뢰도가 떨어짐
		//오류(파일없음 등)를 예방하는 코드가 있어야 함.
		//if문으로 해결할 수 없음 -> 열어서 시도를 하고 예외처리를 함
		try {
			FileInputStream fis = new FileInputStream("test.txt"); //프로젝트 폴더 바로 밑에 있기 때문에 파일명만 작성함
			if (fis != null) {
				System.out.println("파일이 열렸습니다.");
				int ch;
				while ((ch = fis.read()) != -1) { //끝이 예측되지 않기 때문에 for문 대신 while문을 씀
//					System.out.print((char)ch); //깨짐
					System.out.write((char)ch); //write: UTF-8 처리해줘서 안깨짐
				}
			}
		} catch (FileNotFoundException e) { //JVM이 에러정보를 객체화 해서 던져줌
			//에러나도 종료되지 않고 아래 코드가 수행됨.
			System.out.println("해당경로에 파일이 없습니다. 확인해주세요");
		} catch (IOException e) {
			System.out.println("파일에 내용이 없습니다.");
		}
		//if문으로 처리하는 오류는 선처리
		//try-catch 문으로 처리하는 것은 후처리
		//무조건 try-catch로 처리하는 것은 옳지 않다.
		//에러처리를 얼마나 잘하느냐가 프로젝트의 완성도를 좌우한다.
		System.out.println("정상수행 후 종료입니다.");
		
	}
}
