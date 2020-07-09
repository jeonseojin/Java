package day53;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// y,Y 종료

		Scanner scan = new Scanner(System.in);
		char ch='N';
		while(ch !='y' && ch != 'Y') {
			ch = scan.next().charAt(0);
		}
		System.out.println("프로그램종료");
		scan.close();
	}

}
