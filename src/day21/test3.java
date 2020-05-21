package day21;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

/* 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 입력한 정수의 합과 평균을 구하세요.(반복문과 배열 사용)*/
		
		
		int sum=0;
		double res = 0.0;
		int a[] = new int[5];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}
		res = sum /a.length;
		System.out.println(sum);
		System.out.printf("%.2f",res);

		scan.close();

	}

}
