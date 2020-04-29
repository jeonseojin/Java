package play;

import java.util.Scanner;

public class day_6 {

	public static void main(String[] args) {
/* q를 입력할 때까지 입력한 문자를 출력하는 무한루프*/
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


