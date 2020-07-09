package day53;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 두 실수와 산술 연산자가 주어지면 산술 연산 결과를 출력하는 코드를 작성하기 위한 메서드를 만드세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요 : (예: 1 + 2)");
		double num1 = scan.nextDouble();
		char ch = scan.next().charAt(0);
		double num2 = scan.nextDouble();
		System.out.printf("%.1f %c %.1f = %.1f\n",num1,ch,num2,calc(num1, ch, num2));
		
	}
	
//	두 실수와 산술 연산자가 주어지면 산술 연산 결과를 출력하는 코드를 작성하기 위한 메서드를 만드세요.
/* 매개변수 : double num1,char ch, double num2
 * 리턴타입 : double
 * 메소드명 : calc
*/
	public static double calc(double num1,char ch, double num2) {
		switch(ch) {
			case '+': 
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			case '%':
				return num1 % num2;
				default: return 0;
		}
	}

}
