package day13;

import java.util.InputMismatchException;
import java.util.Scanner;



public class ExceptionTestEx2 {

	public static void main(String[] args) {
		/* 정수값을 반복적으로 받는 코드에서 실수로 정수 대신 문자를 입력했을 떄 예외를 처리하도록
		 * 코드를 작성하세요 
		 * 예)
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 2
		 * 정수를 입력하세요 : 100
		 * 정수를 입력하세요 : a
		 * 예외가 발생했습니다 : 문자를 입력했습니다. - a
		 내생각
		Scanner scan=new Scanner(System.in);
		int n;
		try {
			for(;;) {
				System.out.println("정수를 입력하세요 : ");
				n = scan.nextInt();
				if(n=='a' ) {throw new Exception("예외를 발생했습니다 : 문자를 입력했습니다. ");}
			}
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
		scan.close();
		 */
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.print("정수를 입력하세요 : ");
				int num = scan.nextInt();
			}/*while문은 정수를 입력하는 무한루프를 의미*/
		}catch(InputMismatchException e/*객체*/) {
			System.out.println("예외 발생 : 정수가 아닌 문자를 입력했습니다.");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}System.out.println("프로그램이 종료됩니다.");
		scan.close();
}
}
