package day54;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
// 두 실수와 산술 연산자가 주어지면 산술 연산 결과를 출력하는 코드를 메서드를 생성하여 작성하세요. (예외처리까지 진행)

		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요 : (예: 1 + 2)");
		double num1 = scan.nextDouble();
		char ch = scan.next().charAt(0);
		double num2 = scan.nextDouble();
		try {
			System.out.printf("%.1f %c %.1f = %.1f\n",num1,ch,num2,calc(num1, ch, num2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//산술연산 메소드
	public static double calc(double num1, char ch, double num2) throws Exception {
		switch(ch) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '/':
				if(num2 == 0) {
					return throwException();
				}
				return num1 / num2;
			case '*':
				return num1 * num2;
			case '%':
				return num1 % num2;
			default: return throwException();
				
		}
	}
	public static double throwException() throws Exception {
		throw new Exception("잘못 입력하셨습니다.");
	}
}
