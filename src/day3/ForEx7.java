package day3;

import java.util.Scanner;

public class ForEx7 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 공약수 중에서 가장 큰 수 
		 * 공약수 : 두수의 약수 중 공통으로 있는 수
		 * 약수 : 나누어 떨어지는 수
		 * 8의 약수 : 1 2 4 8
		 * 12의 약수 : 1 2 3 4 6 12
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대공약수 : 4
		 * 
		 * 1. 반복성 : i는 1부터 num1까지 1씩 증가
		 * 2. 규칙성 : i는 num1과 num2의 공약수이면 gcd에 i를 저장
		 * 			i가 num1의 약수이고 i가 num2의 약수이면 gcd에 i를 저장
		 * 3. 반복문종료후 : gcd를 출력
		 */
		int num1=0, num2=0, gcd=0;//num에 따로 숫자를 입력하지 않아도 상관없음
		Scanner scan = new Scanner(System.in);//scanner는 여러개를 한번에 사용가능
		System.out.println("1. 수를 입력하세요.");
		num1=scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("2. 수를 입력하세요.");
		num2=scan1.nextInt();
		
		for(int i=1;i<=num1;i++) {
			if(num1 % i == 0 && num2 % i==0) {
				gcd = i;
				/*else if(num2 % i==0){
				}
				else if는 ~하지않으면 ~한다의 의미로 현재 문제의 경우에 발생하지 않기에 사용하지 않는다
				*/
			}
		}
		System.out.println(num1+" 과(와) " + num2 +" 두 수의 최대공약수는 " + gcd + "입니다.");
		//반복문종료후에 gcd를 출력하라는 의미임으로 System을 for문 밖에 위치하도록 입력한다.
		//%d를 이용하면 위의 내용보다 편하게 아래처럼 표현할 수 있다.
		System.out.printf("%d와 %d의 최대 공약수 : %d\n", num1, num2, gcd);

		scan.close();
		scan1.close();
		
		

	}

}
