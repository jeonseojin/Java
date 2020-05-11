package day13;

import java.util.Scanner;

public class ExceptionTestEx1 {

	public static void main(String[] args) {
		/* 반복문을 통해 문자를 입력받고 압력받은 문자가 1이면 1입니다라는 예외를 발생시키는 코드를 작성하세요.
		 * 예) '무한루프'
		 * 문자를 입력하세요 : a
		 * 문자를 입력하세요 : b
		 * 문자를 입력하세요 : 1
		 * 예외가 발생했습니다. : 1
		 */
		Scanner scan= new Scanner(System.in);
		char a;
		try {
		for(; ;) {
			System.out.print("문자를 입력하세요 : ");
			a=scan.next().charAt(0);
		if(a=='1') { throw new Exception("예외가 발생했습니다. : "+a);	}	
		if(a=='a') { throw new Exception("알파벳 예외입니다.");}
		}
		}catch(Exception e){System.out.println(e.getMessage()/*new를 통해서 생성자를 생성할때 입력한 글을 출력하는 코드*/);
		e.printStackTrace();/*예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력해줌*/}
		finally { /*예외 발생과 상관없이 무조건 실행되어야 하는 코드*/}
		System.out.println("프로그램이 종료됩니다.");
		scan.close();
}
}