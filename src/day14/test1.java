package day14;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		char a = scan.next().charAt(0);
		print(a, 15);
		a = scan.next().charAt(0);
		System.out.println(print2(a, 10));
	}
	/* 다음과 같이 출력되도록 메소드를 생성하여 테스트해보세요
	 * 예) *****
	 */
	
	public static void print(char ch, int cnt) {
		for(int i=1;i<=cnt;i++) {
			System.out.print(ch);
		}System.out.println();
	}
	public static String print2(char ch, int cnt) {
		StringBuffer res= new StringBuffer(cnt);
		// res의 값이 자주 바뀌는 경우 String보다 StringBuffer을 사용하는 것이 좋다.
		for(int i=1;i<=cnt;i++) {
			res.append(ch);
		}return res.toString();
	}
	
/*	반복문
 * public static void star(int a) {

			for(int j=1;j<=a;j++) {
			System.out.print("*");
			}
		
	}*/
}
