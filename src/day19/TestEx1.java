package day19;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요.
		 * 예 ) 정수를 입력하세요 : 12345
		 * 		결과 : 54321
		 * 
		 * 
		 * 
		 */
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		int tmp = num;
		String res= "";
		while (tmp != 0) {
			res += tmp%10;/*+=를 사용하여 res인 문자열에 값을 이어서 붙이는것*/
			tmp = tmp/10;
		}
		if(num!=0 )		System.out.println(res);
		else System.out.println(num);
		res = ""+num;//숫자를 문자열로 만들기
		String reverseRes = "";
		for(int i = res.length()-1;i>=0;i--) {//문자열의 길이에 -1한거 만큼의 값을 하나씩 reverseRes에 이어붙여주는 것
			reverseRes += res.charAt(i);
		}
		System.out.println(reverseRes);//문자열이라 0이 출력
		System.out.println(back(num));
		scan.close();
	}
	public static int back(int n) {//0이 안나옴..ㅠ
		int a=0;
		while(n != 0 ) {//n의 값이 0보다 작으면 종료
			a = a*10+n%10;
			/* n = 321
			 * (0*10=)0+(321%10=)1 a = 1
			 * (1*10=)10+(32%10=)2 a =12
			 * (12*10=)120+(3%10=)3 a = 123 
			 */
			n = n / 10;//맨뒤의 수를 소수로 만들어서 제거
			}return a;
		}
}
