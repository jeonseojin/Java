package day18;

import java.util.*;

public class TestEx4 {

	public static void main(String[] args) {
/* - 정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요.
 * 		단 메소드를 생성하여 작업
 * 
 * 
 * - 두 정수가 주어졌을 때 두 정수의 최대 공약수가 1이면 서로소라고 출력하고, 서로소가 아니면 서로소가 아님이라고 출력하는 코드를 작성하세요.
 * 		단, 메소드를 생성하여 작업
 */

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = scan.nextInt();
		System.out.println(num(n));
		int n1 = scan.nextInt();
		int n2 =  scan.nextInt();
		
		n=scan.nextInt();
		try {
			if(isPrime(n)) {
				System.out.println(n+"은 소수");
			}else {System.out.println(n+"은 합성수");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}scan.close();
	}
/* 내가품
 * 기능 : 입력 된 정수가 소수인지 아닌지 확인
 * 매개변수 : 정수 int n
 * 리턴타입 : ~인지 아닌지 boolean
 * 메소드명 : num  */
	public static boolean num(int n) {
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n % i ==0) {	cnt++;}	
		}
		if(cnt==2 || cnt==1) {
			return true; 
		}
		return false;	
	}
	
/* 샘이품
 * 기능 : 정수가 소수이면 true 소수가 아니면 false를 반환하는 메소드
 * 매개변수 : 정수 => int num1
 * 리턴타입 : boolean
 * 메소드명 : iPrime  */

	public static boolean isPrime(int num) {
		if(num==1) { throw new ArithmeticException("예외 : 1은 소수도 합성수도 아닙니다.");
		}
		if(num < 1) {
			throw new ArithmeticException("예외 : 음수와 0은 소수 판별을 할 수 없습니다.");
		}
		for(int i =2;/*i<num*/ i*i<=num;i++) {
			//i가 num의 약수이면, num가 i의 배수이면
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	





}



