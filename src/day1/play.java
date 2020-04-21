package day1;

import java.util.Scanner;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println("수고하세요");
		
		
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("태어난 년도를 입력하시오 :");
		n = scan.nextInt();
		System.out.println("나이(만) : " + (2020-n) );
		scan.close();

	}

}
