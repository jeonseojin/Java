package day22;

import java.util.Scanner;

public class Test1 {
/* - 정수 start와 정수 end가 주어지면 start부터 end까지의 합을 반환하는 메소드를 생성하고, main메소드에서 테스트해보세요. */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = 0;
		int end=0 ;
		// System.out.println(sum(start, end)); 내꺼
		start = scan.nextInt();
		end = scan.nextInt();
		System.out.println(add(start, end));
	}
/* 내가품
 * 기능 : 정수 start와 정수 end가 주어지면 start부터 end까지의 합을 반환하는 메소드
 * 매개변수 : start, end
 * 리턴타입 : 합 int
 * 메소드명 : sum	 

	public static int sum(int start, int end) {
		Scanner scan = new Scanner(System.in);
		start = scan.nextInt();
		end = scan.nextInt();
		int sum=0;
		for(int i = start;i<=end ;i++) {
			sum = sum+i;
		}
		return sum;
	}
	
*/
	
	/* 기능 : 정수 start와 정수 end가 주어지면 start부터 end까지의 합을 반환하는 메소드
	 * 매개변수 : 정수 start, 정수 end
	 * 리턴타입 : 합 => int
	 * 메소드명 : add
	 */
	public static int add(int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		return sum;
	}
}
