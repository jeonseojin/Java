package day3;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		/* 정수 num가 정수인지 아닌지 판별하는 코드를 for문을 이용하여 작성하세요.
		 * 소수 : 약수가 2개인 수
		 * 1 or num
		 * 1. 반복성 : i가 1부터 num까지 1씩 증가
		 * 2. 규칙성 : i가 num의 약수이면 약수의 갯수(cnt)를 1증가
		 * 3. 반복문종료후 : 약수의 갯수(cnt)가 2이면 소수라고 출력하고 아니면 소수가 아님이라고 출력 
		 */
		//실패
//		int i, num=3, cnt=0;
//		for(i=1;i<=num; i++) {
//			if(cnt= 1 && num)
//			System.out.println();
//		}
		int num = 0, cnt = 0;
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		for(int i=1; i<=num;i++) {
			//2
			//if(i가 num의 약수이다){ cnt 1증가
			if(num %i==0) {
				cnt += 1 ;
			}
		}
			//3
		//if(cnt가 2이다){소수라고 출력
		//}else {
		//	소수가 아님이라고 출력;
		//}
		if(cnt==2) {
			System.out.println(num+"는 소수");
		}else {
			System.out.println(num+"소수가 아님");
		}
		scan.close();
		
	}
}
