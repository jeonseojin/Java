package day3;

import java.util.Scanner;

public class Ex0421 {

	public static void main(String[] args) {
		/* 두 정수와 문자 하나를 입력받아 출력하는 코드를 작성하세요 
		 * 정수형 변수 2개를 선언, 문자형 변수 1개 선언 후 스캐너를 통해 정수와 문자를 입력받을수 있다
		 * 출력하는 >System.out.println을 활용할 수 있다.
		 */
		int num1, num2;
		String str;
		//char OP;
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 문자를 입력하세요.(예 : 1 + 2):");
		
		num1 = scan.nextInt();
		//OP = scan.next().charAt(0);
		str = scan.next();
		num2 = scan.nextInt();
		
		//System.out.println("" + num1 + "" + OP + "" + num2);
		//System.out.printf( "%d %c %d\n", num1 , OP , num2 );
		System.out.println(" " + num1 + " " + str + " " + num2);
		System.out.printf( " %d %s %d/n ", num1 , str , num2 );
		// %d int %s는 String %c는 Char
		scan.close();
		//1+1로 하게 될 경우 1+를 num1에 입력받기 때문에 에러가 발생하고 
		//1 + 1로 띄어서 작성할 경우에 해당 코드의 입력이 정상적으로 이루어진다.
		
		/* 조건문을 사용할 수 있는지 확인하는 문제
		 * 
		 * 입력받은 문자가 +이면 두 수의 합을 출력하고 -이면 두 수의 차를 출력하고
		 * op가 /이면 두수의 나눈 결과를 출력하고 
		 * op가 *이면 두 수의 곱한 결과를 출력하고 
		 * op가 %이면 두 수의 나머지 결과를 출력하는 코드를 작성하세요. 
		 *  
		 *  str의 문자가 + / - * %의 경우이면 각 기능의 결과를 출력한다
		 *  
		 *  
		 */
		
		//d라는 값을 따로 설정하지 않고 하는방법

		int d;
		if(str.equals("+")) {
			d = num1+num2;
			System.out.println(num1 +" " + str+ " " + num2 +" = "+ " "+d);
			}
		else if(str.equals("-")) {
			d = num1-num2;
			System.out.println(num1 +" " + str+ " " + num2 +" = "+ " "+d);
		}
		else if(str.equals("*")) {
			d = num1*num2;
			System.out.println(num1 +" " + str+ " " + num2 +" = "+" "+d);
		}
		else if(str.equals("/")) {
			d = num1/num2;
			System.out.println(num1 +" " + str+ " " + num2 +" = "+" "+d);
		}
		else if(str.equals("%")) {
			d = num1%num2;
			System.out.println(num1 +" " + str+ " " + num2 +" ="+" "+d);
		}else {
			System.out.println(str+"출력될 수 없습니다.");
			
		}

		

	}

}
