package day17;

import java.util.*;

public class testEx1 {
/* 두 정수를 입력받아 두 정수를 더하여 출력하는 코드를 자유롭게 작성하세요.*/
	/* static Scanner scan = new Scanner(System.in); => 클래스 변수 (가능은 하지만 일반적으로 사용하지 않음)
	 * testEx1에서 스캐너는 의미 있는 정보가 아니므로 사용하지 않는 것이 좋다.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);				//=> 지역변수, 참조 변수
		System.out.print("더할 두 정수를 입력하세요 : ");			
		Integer n1 = scan.nextInt();						//=> 지역변수, 참조변수 
		int n2 = scan.nextInt();							//=> 지역변수, 일반 변수
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
		System.out.printf("%d + %d = %d\n",n1,n2,sum(n1, n2, 0));
		System.out.printf("%d + %d = %d\n",n1,n2,sum(n1, n2));

	}
/*예제1*/
	public static int sum(int n1, int n2, int res) {/*int res(멤버변수, 일반변수) 를 굳이 만들지 않고 예제 2처럼 활용하는 것이 더 좋음*/
		res = n1+n2;
		return res;
	}
/*예제2*/
	public static int sum(int n1,int n2) {
		int res = n1+n2;							//res 지역변수, 일반변수
		return res;
	}
}
