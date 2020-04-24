package day6;

import java.util.Scanner;

public class testEx3 {

	public static void main(String[] args) {
		/* 문자를 입력받아 입력받은 문자를 출력하세요.
		 * 5번 반복하세요.
		 * 예시
		 * 입력하세요 : a
		 * 출력 : a
		 * 입력하세요 : 1
		 * 출력 : 1
		 * 
		 * ,단 소문자 q를 입력하면 문자 출력 대신 종료합니니다가 출력되도록 수정하세요.
		 * 
		 * 
		 * 
		 */
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 문제");
		System.out.print("문자를 입력하세요 : ");
		System.out.println();
		ch = scan.next().charAt(0);
		System.out.println("입력 받은 문자는 '"+ch+"' 입니다");
		System.out.println();
//scan.close를 사용 후에는 scan을 사용할 수 없기에 끝에 있는것이 좋다.
		int num = 5;
//굳이 따로 설정하지 않고 num자리에 바로 입력가능
		for(int i =0; i<num;i++) {
			System.out.print("문자를 입력하세요 : " );
			ch = scan.next().charAt(0);
			System.out.println("입력 받은 문자는 '"+ch+"' 입니다");
		}
		System.out.println();
		
// 5번 출력되도록 하지만 q가 입력되면 멈추는 코드
		for(int i =0; i<5;i++) {
			if(ch=='q') {
				System.out.println("문자 출력을 종료합니다.");
				break;
			}
			System.out.print("문자를 입력하세요 : " );
			ch = scan.next().charAt(0);
			System.out.println("입력 받은 문자는 '"+ch+"' 입니다");

		}
		System.out.println();
/*무한루프를 이용한 반복문를 
 * 문자를 입력받아 출력하는 과정을 q가 입력될때까지 반복하세요.
 */
		for(; ; ) {
			if(ch=='q') {
				System.out.println("문자 출력을 종료합니다.");
				break;
			}
			System.out.print("문자를 입력하세요 : " );
			ch = scan.next().charAt(0);
			System.out.println("입력 받은 문자는 '"+ch+"' 입니다");

		}
		
		scan.close();
/* 쌤과 함께
 * System.out.print("문자를 입력하세요 : ");
 * ch = scan.next().CharAt(0);
 * System.out.println("입력 받은 문자 : " + ch);
 * for(int i = 1; i<=5; i++){
 * 		System.out.print("문자를 입력하세요 : " );
		ch = scan.next().charAt(0);
		if(ch !='q')//실행문이 한줄일 경우에 { }(중가로)가 생략가능하다
			System.out.println("입력 받은 문자는 '"+ch+"' 입니다");
		else{
			System.out.println("종료합니다.");
			break;}
 * }
 * scan.close();
		 */

		

	}

}
