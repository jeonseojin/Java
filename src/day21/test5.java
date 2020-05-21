package day21;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 9개짜리 배열을 만들어서 입력받은 정수의 약수를 저장하는 코드를 작성하세요.
/* 우선 구구단을 구하는 코드 생성
		int arr[] = new int[9];
		int a = scan.nextInt();
		for(int i = 1;i<=9;i++) {
			arr[i] = a*i;
			System.out.println(a*i);
			}
*/	int []arr = new int[9];
	for(int i =0;i<9;i++) {
		arr[i] = 2 * (i+1);
		System.out.print(arr[i]+" ");
	}
		
		
	}

}
