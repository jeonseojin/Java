package day2;

import java.util.Scanner;

public class switchEx2 {

	public static void main(String[] args) {
		/* 달(월)이 주어지면 해당하는 달의 마지막일을 출력하는 코드를
		 * switch문을 이용하여 작성하세요.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */
		int month;
		Scanner scan = new Scanner(System.in);
		System.out.print("달(월을 입력하세요. :");
		month = scan.nextInt();
		switch(month) {
		case 1:  case 3: case 5: case 7: case 8: case 10:
		case 12:
			System.out.println(month + "월은 31일까지입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지입니다.");
		}
		
			


	}
}
