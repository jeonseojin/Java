package play;

import java.util.Scanner;

public class day_1 {

	public static void main(String[] args) {
		int num1=9,num2=11;
		System.out.println(num1+","+num2);
		System.out.printf("%2d,%2d\n",num1,num2);
/* 출력값
9,11
 9,11
*/
	double dnum = 1.234567;
		System.out.println(dnum);
		System.out.printf("%.4f\n",dnum);
		System.out.printf("%7.4f\n",dnum);
/* 출력값
1.234567
1.2346	%.4f\n의 의미는 4번째자리까지 출력하겠다(5번째자리에서 반올림한다.)
 1.2346	%7.4f\n에서 7의 의미는 7자리로 출력하겠다(공백과 . 포함)
*/
	}
	

	
}



