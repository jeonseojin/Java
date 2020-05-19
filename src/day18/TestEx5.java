package day18;

import java.util.*;

public class TestEx5 {

	public static void main(String[] args) {
		/*	두 정수가 주어졌을 때 두 정수의 최대 공약수가 1이면 서로소라고 출력하고, 서로소가 아니면 서로소가 아님이라고 출력하는 코드를 작성하세요.
		 * 			단, 메소드를 생성하여 작업 	 */
		System.out.println(TestEx1.gcd(5, 10));
		Scanner scan= new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(isCoprime(num1, num2)) {
			System.out.printf("%d와 %d는 서로소 관계\n",num1,num2);
		}else {
			System.out.printf("%d와 %d는 서로소 관계아님\n",num1,num2);
		}
	}
	/* 두 정수가 주어졌을 때 두 정수의 최대 공약수가 1이면 서로소라고 출력하고, 서로소가 아니면 서로소가 아님이라고 출력하는 코드를 작성하세요.
	 * 기능 : 두 정수의 최대 공약수가 1이면 서로소라고 출력, 아니면 아님이라 출력
	 * 매개변수 : 두 정수 int n1 int n2
	 * 리턴타입 : void
	 * 메소드명 : suro  */

		public static void suro(int n1, int n2) {
			int cnt=0;
			for(int i=1;i<=n1;i++) {
				if(n1%i==0 && n2%i==0) {
					cnt++;
				}
			}if(cnt==1) {
				System.out.println("서로소");
			}else {		System.out.println("서로소가 아님");
			}
		}
		
	/* 기능 : 두 정수가 서로소 관계이면 true 아니면 false의 값을 알려주는 메소드
	 * 매개변수 : 두정수 => int n1, int n2
	 * 리턴타입 : 서로소관계여부 => boolean
	 * 메소드명 : isCoprime	 */
		public static boolean isCoprime(int n1, int n2) {
			if(n1 == n2) return false;// 두수가 같지 않고 최소공약수가 1인 경우를 서로소라함
/*			if(TestEx1.gcd(n1, n2)==1)
				return true;
			return false;	3줄을 아래의 한줄로 요약가능	*/
			return TestEx1.gcd(n1, n2)==1? true:false;
			/* ?의 의미는 입력한 문제가 맞으면 true 아니면 false*/
		}

}
