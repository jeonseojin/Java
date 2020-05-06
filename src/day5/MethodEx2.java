package day5;

import java.util.Scanner;

public class MethodEx2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double res=cal(8,'-',3);
//		System.out.println(res);
		int n1, n2;
		char o;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요(예:1 + 2) :");
		n1 = scan.nextInt();
		o=scan.next().charAt(0);
		n2=scan.nextInt();
		System.out.printf("%d %c %d = %.2f\n",n1,o,n2,cal2(n1,o,n2));
	
	}
	/* 기능 : 두 정수와 산술연산자가 주어지면 연산 결과를 알려주는 메서드 
	 * 		단, 예외 상황은 없다고 가정한다.
	 * 		잘못된 연산자가 들어오거나, 0으로 나누는 경우
	 */
	
	/* 기능 : 두 정수의 합을 알려주는 메서드
	 * 매개변수 : 두 정수와 산술연산자 => int num1, int num2, char op
	 * 리턴타입 : 산술연산결과 => 실수 => double
	 * 메서드명 : cal
	 */
	public static double  cal2(int num1, char op, int num2){
		/*double res = 0.0;
		switch(op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = (double)num1 / num2; break;
		case '%' : res = num1 % num2; break;
		}
		return res;*/
		switch(op) {
		case '+':	return num1 + num2;	
		case '-':	return num1 - num2;
		case '*':	return num1 * num2;
		case '%':	return num1 % num2;
		case '/':	return (double)num1 / num2;
		default:	return 0;
		}
	}

}
