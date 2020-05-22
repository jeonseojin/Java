package day22;

import java.util.Scanner;

public class Test2 {
//구구단을 2단에서 9단까지 출력하는 코드를 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		System.out.println("================");
		danprint();
		System.out.println("================");
		System.out.print("시작할 단을 입력하세요 : ");
		int start = scan.nextInt();
		System.out.print("마지막 단을 입력하세요 : ");
		int end = scan.nextInt();
		multiTable(start, end);
	}
/* 기능 : 구구단을 2단에서 9단까지 출력하는 메소드
 * 매개변수 : x 없어도딤
 * 리턴타입 : x 출력용이라 없어도됨
 * 메소드명 : danprint
 */
	public static void danprint() {
		for(int i = 2; i<=9;i++) {
			System.out.println("  "+i+" 단");
			for(int j = 1; j<=9;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
	}
/* 활용도를 높이기 위해서 단의 시작과 끝단을 정하여 출력하는 메소드 생성
 * 기능 : 구구단을 start단에서 end단까지 출력하는 메소드
 * 매개변수 : start단, end단 => int start, int end
 * 리턴타입 : 없음 => void
 * 메소드명 : multi
 */
	public static void multiTable(int start, int end){
		for(int i = start; i<=end;i++) {
			System.out.println(i+" 단");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
	}
	
}
