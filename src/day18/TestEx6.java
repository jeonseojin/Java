package day18;

import java.util.*;


public class TestEx6 {

	public static void main(String[] args) {
	/* 정수 n개를 입력받아 저장하고, 저장된 n개의 정수를 거꾸로 출력하는 코드를 작성하세요.
	 * 예)
	 * 		입력받을 정수의 갯수 : 5
	 * 		정수 5개를 입력하세요. : 1 2 3 4 5
	 * 	  입력 받은 정수를 거꾸로 출력 : 5 4 3 2 1 
	 */
		Scanner scan = new Scanner(System.in);
		System.out.print("입력받을 정수의 갯수 : ");
		int size = scan.nextInt();
		int [] arr = new int[size];
		System.out.print("정수 "+ size + "개를 입력하세요 : ");
		for(int i=0;i<size;i++) {
			int n=scan.nextInt();
			arr[i] = n; //배열의 경우 
			//한줄로 arr[i] = scan.nextInt();

		//저장
		}System.out.println("그대로 입력한 값 : "+arr);
		
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		//거꾸로 출력하는 작업
		for(int i = size-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");

		}
		scan.close();
		
		
		
	}

}
