package day6;

import java.util.Scanner;

public class testEx2 {

	public static void main(String[] args) {
		/* 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 의 형태
		 * 한 줄에 5개의 숫자가 존재하고 옆으로 하나씩 증가하며 3줄 완성
		 * 
		 * 3 3
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 의 형태
		 * 
		 * 
		 */
		int row, col;
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt();//행표현
		col = scan.nextInt();//열표현
/* 우선 열과 행을 증가시킬 수 있는 형태의 코드를 작성
 */
		for(int i=0; i<row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.printf("1");
			}
			System.out.println();
		}
		System.out.println();
/* j의 값이 1씩 증가하는 경우이기 때문에
 * 코드에 출력값을 j를 입력하면 숫자가 하나씩 증가하는 형태가 된다.
 */
		for(int i=0; i<row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
/* 코드에 cnt를 추가하여 for문이 끝날때 cnt++을 통해 1씩증가하는 값을 저장하여
 * 출력할 경우 자릿수를 맞춰주는 %2d를 사용 후 cnt를 해주면 j를 입력했을 때와 동일하게
 * 증가하는 것을 알수있다
 */
		for(int i=0, cnt=1; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("%2d ",cnt/*현재위치에서 ++을 붙여도 증감연산자를 사용한것으로 결과는 동일하다*/);
				cnt++;

			}
			System.out.println();
		}
		System.out.println();
/* j=1이라고 설정하였을 경우
 * System.out.printf("%2d ",col * (i-1) + j + 1);
 * 로 출력하면 동일한 결과가 출력된다.
 */
		for(int i=0, cnt=1; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.printf("%2d ",col * i + j + 1);
				cnt++;

			}
			System.out.println();
		}
	}

}
