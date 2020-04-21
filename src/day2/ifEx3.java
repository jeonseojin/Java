package day2;

import java.util.Scanner;

public class ifEx3 {

	public static void main(String[] args) {
		/* 정수형 변수 num를 선언하고, num의 값을 초기화하여
		 * num가 2의 배수이면 2의 배수라고 출력하고,
		 * 3의 배수이면 3의 배수라고 출력하고,
		 * 6의 배수이면 6의 배수라고 출력하고,
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다라고 출력하는
		 * 코드를 작성하세요
		 * 예 : 6 => 6의 배수입니다.
		 */

		int num1;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		num1 = scan.nextInt();
		if(num1 %2==0 && num1 % 3 !=0) {
			System.out.println(num1+"는 2의 배수입니다.");
		}
		else if(num1 %3==0 && num1 % 6 !=0){
			System.out.println(num1+"는 3의 배수입니다.");
		}
		else if(num1 %6==0){
			System.out.println(num1+"는 6의 배수입니다.");
			
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		scan.close();
		
		//중첩if문으로표현
		if(num1 %2==0){
			if(num1 %3==0) {
				//이실행문까지 왔다는것은 num은 기본 2의배수이다.
				//그중에서 3의 배수이기까지한 num은 6의 배수이다.
				System.out.println("2,3,6의 배수가 아닙니다.");
			}else {
				System.out.println(num1 + "는2의배수입니다.");
			}
		}
	}

}
