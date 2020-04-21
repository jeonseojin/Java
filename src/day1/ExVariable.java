
package day1;

import java.util.Scanner;

public class ExVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //main은 콘솔응용프로그램이 실행되기 위해 꼭 필요한 것(메소드, 기능)
		    System.out.println("Hello world!");
		    System.out.println(7+7);
		    System.out.println(""+7+7);
		    System.out.println();
		    System.out.print("안녕\n");
		    //System.out.print();//에러
		    System.out.println(""+(7+7));
		    System.out.println(""+7+7);
		    int num1 = 10, num2 = 20;
		    System.out.println(num1 +","+num2);
		    num1 = 9;
		    num2 = 11;
		    System.out.println(num1 +","+num2);
		    System.out.printf("%2d,%2d\n", num1,num2);
		    double dnum = 1.2353147;
		  System.out.println(dnum);
		  System.out.printf("%.4f\n",dnum);
		  System.out.printf("%7.4f\n",dnum);

		  Scanner scan = new Scanner(System.in);
		  int num = scan.nextInt();
		  System.out.println(num);
		  char ch = scan.next().charAt(0);
		  System.out.println(ch);
		  //문자열을 관리하는 String 클래스
		  String str = new String();
		  str = scan.next();
		  System.out.println(str);
		  scan.close();
	}

}
