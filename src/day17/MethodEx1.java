package day17;

import java.util.Scanner;

public class MethodEx1 {
	/* main 메소드부터 실행 순서를 줄수로 표현하세요. (단, 1 / 2를 입력했다고 가정)
	 * 10~18>49~56>38~40>56>18~23
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 (예. 1 + 2) : ");
		int a;		char op;	int b;
		try {
		a = scan.nextInt();
		op = scan.next().charAt(0);
		b = scan.nextInt();
		System.out.printf("%d %c %d = %.1f\n",a,op,b,arithmetic(a, op, b));	
		}catch(Exception e)
		{System.out.println(e.getMessage());
		}
		scan.close();
	}
/* 기능 : 두 정수의 합을 반환하는 메소드
 * 매개변수 : n1, n2 리턴타입 : int 메소드명 hap*/
	public static int Plus(int a, int b) {
		return a+b;
	}
/* 기능 : 두 정수의 차을 반환하는 메소드*/
	public static int Minus(int a, int b) {
		return a-b;
	}
/* 기능 : 두 정수의 곱을 반환하는 메소드*/
	public static int Multiplication(int a, int b) {
		return a*b;
	}
/* 기능 : 정수 a를 정수 b로 나눈 결과를 반환하는 메소드 */
	public static double divide(int a, int b) {
		return (double)a/b;
	}
/* 기능 : 정수 a를 정수 b로 나눈 나머지를 반환하는 메소드*/
	public static int rest(int a, int b) {
		return a%b;
	}
/* 기능 : 정수 a를 정수 b를 산술연산자 op의 결과를 반환하는 메소드
 * 매개변수 : int a, int b, char op
 * 리턴타입 : double
 * 메소드명 : arithmetic*/
	public static double arithmetic(int a,char op, int b ) {
		switch(op) {
		case '+':	return(Plus(a, b));
		case '-':	return(Minus(a, b));
		case '*':	return(Multiplication(a, b));
		case '/':	
			if(b==0) throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다.");
			return(divide(a, b));
		case '%':	return(rest(a, b));		
		default: throw new ArithmeticException("예외 발생 : "+ op+ "는 산술 연산자가 아닙니다.");
		}
	}
}
