package day7;

import java.util.Scanner;

public class MethodeEX4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단을 입력하세요 : ");
		int num = scan.nextInt();
		printMultiplTable(num);
// 입력한 수의 구구단 출력
		System.out.println("------------------");
		
		int start, end;
		System.out.print("시작단을 입력하세요 : ");
		start = scan.nextInt();
		System.out.print("끝단을 입력하세요 : ");
		end =scan.nextInt();
		
		if(printMultiplTable3(num, start, end)==0) {
			System.out.println("0단의 모든 값은 0입니다.");
		}else if(printMultiplTable3(num, start, end) == -1) {
			System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다.");
		}
			
		scan.close();
	}
/* 9단까지 출력하는 기본 메서드
 * 기능 : num가 주어지면 주어진 num단(구구단)을(구구단의 한 단을) 출력하는 메서드
 * 매개변수 : 주어진 num int num
 * 리턴타입 : 없음 void
 * 메서드명 : printMultiplTable
 * public static (리턴타입 : void ) 메서드명 : printMultiplTable(매개변수 : int num){}
*/
	public static void printMultiplTable(int num) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d = %2d\n",num,i,num*i);
		}
	}
	
/* 주어진 단의 시작과 끝을 설정하여 출력하는 메서드
 * 기능 : num가 주어지면 주어진 num단(구구단)을(구구단의 한 단을) 출력하는 메서드
 * 매개변수 : 주어진 num단, 단의 시작, 단의 끝 => int num, int start, int end
 * 리턴타입 : (기본)없음 void
 * 메서드명 : printMultiplTable2
 * public static (리턴타입 : void ) 메서드명 : printMultiplTable2(매개변수 : int num, int start, int end){}

	public static void printMultiplTable2(int num, int start, int end) {
		for(int i=start;i<=end;i++) {
			System.out.printf("%d x %d = %2d\n",num,i,num*i);
		}
	}
*/	
	
	
	
/* 주어진 단의 시작과 끝을 설정하여 출력하는 메서드
 * 기능 : num가 주어지면 주어진 num단(구구단)을(구구단의 한 단을) 출력하는 메서드
 * 		리턴값을 이용하여 예외처리까지 신경쓰는 예제
 * 매개변수 : 주어진 num단, 단의 시작, 단의 끝 => int num, int start, int end
 * 리턴타입 : 	0 => 0단이 입력됨 => 출력 안함
 *  		1 => 정상출력
 *  		-1 => start > end 경우 => 출력 안함
 *  	정수형 => int
 * 메서드명 : printMultiplTable2
 * public static (리턴타입 : void ) 메서드명 : printMultiplTable3(매개변수 : int num, int start, int end){}
*/
		public static int printMultiplTable3(int num, int start, int end) {
			if(num==0)
				return 0;
//0단을 출력할 경우만 입력된 단어가 출력됨
			if(start > end)
				return -1;
			for(int i=start;i<=end;i++) {
				System.out.printf("%d x %d = %2d\n",num,i,num*i);
			}
			return 1;
		}
}

