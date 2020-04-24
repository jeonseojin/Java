package day6;

import java.util.Scanner;

public class testEx4 {

	public static void main(String[] args) {
		/* 학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * 100~90	: A
		 * 89~80	: B
		 * 79~70	: c
		 * 69~60	: D
		 * 59~0		: F
		 * 100점이상	: 잘못 된 점수 입니다.
		 * 점수입력받기
		 * 
		 * 5번 반복
		 * 성적을 입력하세요. : 100
		 * 100점은 A학점
		 * 성적을 입력하세요. : 56
		 * 56점은 F학점
		 * 
		 * 여러명 학생의 성적을 입력받ㅇ ㅏ해당 학생의 성적을 학점으로 출력하세요.
		 * 학생 성적이 음수가 입력되면 종료하도록 하세요.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
/*반복문	5번 반복하도록 설정하는 코드 for(int i = 0; i<5;i++){*/	
		for(int i=1;/*조건문을 지우면 무한루프*/;i++) {
			System.out.print("점수를 입력하세요. (종료하려면 음수를 입력하세요.) : ");
			int num = scan.nextInt();
			
/*성적확인용*/
			if(num>=90 && num<=100) {System.out.println(num +"점은 A학점");}
			else if(num>=80&&num<=89) {	System.out.println(num +"점은 B학점");	}
			else if(num>=70&&num<=79) {	System.out.println(num +"점은 C학점");	}
			else if(num>=60&&num<=69) {	System.out.println(num +"점은 D학점");	}
			else if(num>=0&&num<=59) { System.out.println(num +"점은 F학점");	}
			else if(num>100){System.out.println(num + "점은 잘못된 점수를 입력하셨습니다.");	}
			else {
				System.out.println("지금까지 입력확인한 학생의 수는 " + (i-1) + "명입니다");
				/*-1을 하는 이유는 입력한 학생의 수에 종료하기 위한 수가 입력되기 때문에*/
				System.out.println("종료합니다.");
				break;}
		}
/* 입력확인용		System.out.println("입력받은 점수 : "+num);*/

		
	}

}

