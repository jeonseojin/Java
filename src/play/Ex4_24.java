package play;

import java.util.Scanner;

public class Ex4_24 {

	public static void main(String[] args) {

		char ch;
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		for(; ; ) {
			if(ch=='q') {
				System.out.println("문자 출력을 종료합니다.");
				break;
			}
			System.out.print("문자를 입력하세요 : " );
			ch = scan.next().charAt(0);
			System.out.println("입력 받은 문자는 '"+ch+"' 입니다");

		}
	}

}


