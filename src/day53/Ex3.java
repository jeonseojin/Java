package day53;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// for문을 이용하여 구구단 9단을 출력하는 코드를 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
		
	}

}
