package day2;

public class forEx2 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		 * 1. 반복횟수 : i는 1부터 9까지 1씩증가
		 *            i는 7부터 63까지 7씩 증가
		 * 2. 규칙성 :
		 */
		int i, num=7;
		for(i=1 ; i<=9 ; i+=1) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
		for(i=1 ; i<=9 ; i+=1) {
			System.out.println(num +" x "+i+" = "+num*i);
		}
		for(i=1 ; i<=9 ; i+=1) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}

	}

}
