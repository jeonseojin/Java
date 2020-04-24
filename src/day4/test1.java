package day4;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// 두 정수와 문자하나를 입력 받아 출력하는 코드를 작성하세요.
				// 두 정수와 문자 하나를 입력받아 = > 정수형 변수 2개를 선선하고, 문자형 변수 1개를 선언 후
				// Scanner를 통해 정수와 문자를 입력 받을 수 있다. 그 다음 출력하는 코드! (출력=> System.out.println을 활용할 수 있다.

				/*Scanner scan = new Scanner(System.in);
				
				int num1;
				int num2;
				char ch;
				
				System.out.printf("num1" + " ");
				System.out.printf("ch" + " ");
				System.out.printf("num2" + " ");
				scan.close();
				*/

				//선생님이 풀어주신것!
				int num1, num2;
				char op;
				//String str;
				Scanner scan = new Scanner(System.in);
				System.out.println("두 정수와 문자를 입력하세요.(예 : 1 + 2) : ");
				num1 = scan.nextInt();
				op = scan.next().charAt(0); // 여러 문자를 출력 가능하긴 하지만, 가져 오는 건 하나! 가져온다. 첫글자만
				//next는 공백 전까지. nextLine은 공백까지!
				//str = scan.next();
				num2 = scan.nextInt();
				//System.out.println("" + num1 +" "+ op +" "+ num2 );//"" 앞에 따옴표를 붙여서 문자열을 나타내면 뒤에도 문자열로 인식
				System.out.printf("%d %c %d\n", num1, op, num2);
				//System.out.println("" + num1 +" "+ str +" "+ num2 );
				//System.out.printf("%d %s %d\n", num1, str, num2);
				//					지시자가 다름 
				scan.close();

				// string은 문자열로 받는 방법임
				// 위에 주석으로 처리된 건 바꿔써도 된다는 뜻! 
				// string, char 두 가지 방법으로도 출력 가능함.


				/* 입력받은 문자 op가 +이면 두 수의 합을 출력하고
				 * 문자 op가 - 이면 두 수의 차를  출력하고 
				 * 문자 op가 / 이면 두 수의 나눈 결과를 출력하고
				 * 문자 op가 * 이면 두 수의 곱한 결과를 출력하고
				 * 문자 op가 % 이면 두 수의 나머지 결과를 출력하는 코드를 작성하세요.
				 */

				if(op == '+') {
					System.out.printf("두수의 합 : %d " , num1+num2 ); // 지시자 하나면 콤마도 하나! 
					System.out.println();
					//System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2); // 지시자가 네 개라 콤마도 네 개. 
				}else if(op == '-') {
					System.out.printf("두수의 차 : %d ", num1-num2);
					System.out.println();
				}else if(op == '/') {
					System.out.printf("두수의 나눈 값 : %d ", num1/num2 );
					System.out.println();
				}else if(op == '*') {
					System.out.printf("두수의 곱 : %d ", num1*num2);
					System.out.println();
				}else if(op == '%'){ 
					System.out.printf("두수의 나머지 : %d ", num1%num2 );
					System.out.println();
				}else { // else는 조건식 붙지 않음! 그래서 바로 밑에처럼 출력되게 해주면 좋다.
					System.out.println(" op + 산술 연산자가 아닙니다. ");
					System.out.println();
				}

				/* 선생님 풀이!! 
				 * 먼저 문제 풀 때, 이런식으로 최소한의 식을 한글로 적어본다!
				 * 다음으로 더 정확한 값이 무엇인지 바꿔주기. 다 if인 것을 > else if 로 그리고 나머지는 else로.
				 * 조건문을 생각 후 더 간결한 표현이 무엇인지 생각해보자.
				 * 
				if(op가 +와 같다) {
					두수의 합 출력;
				}
				if(op가 -와 같다) {
					두수의 차 출력;
				}
				if(op가 /와 같다) {
					두수의 합 출력;
					System.out.printf("%d %c %d = %d\n", num1, op, num2, (double)num1/num2);
					나누기 값은 제대로 안나오기 때문에 앞에 실수에 해당하는 형변환을 해줘야 제대로 된 값이 출력된다.
				}
				if(op가 *와 같다) {
					두수의 합 출력;
				}if(op가 %와 같다) {
					두수의 합 출력;
				}
				*/


				switch(op) {
				case '+' : 
					System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2);
					break;
				case '-' :	
					System.out.printf("%d %c %d = %d\n", num1, op, num2, num1-num2);
					break;
				case '/' :	
					System.out.printf("%d %c %d = %d\n", num1, op, num2, (double)num1/num2); //형변환은 다른 경우에서처럼 똑같이!
					break;
				case '*' :	
					System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2);
					break;
				case '%' :	
					System.out.printf("%d %c %d = %d\n", num1, op, num2, num1%num2);
					break;
				default : // 마지막에서는 break가 없는 이유는 있어도 그만 없어도 그만이라 그냥 밑의 출력만 되게끔 해줌.
					System.out.printf(op + "는 산술 연산자가 아닙니다.");

				}




			}

		}