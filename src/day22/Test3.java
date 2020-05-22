package day22;

import java.util.Scanner;

public class Test3 {
/* - 배열에서 가장 큰 값을 출력하는 예제를 이용하여 
 * - 배열에서 가장 큰 값을 반환하는 메소드를 생성하고, main 메소드에서 테스트해보세요.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("크기를 비교할 수를 입력하세요.");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(max(arr));
		
	}


/* 기능 : 배열에서 가장 큰 값을 반환하는 메소드
 * 매개변수 : 정수 배열 => int arr[]
 * 리턴타입 : 큰값 => int 
 * 메소드명 : max
 */
	public static int max(int arr[]) {
		Scanner scan = new Scanner(System.in);	
		int max = arr[0];
/*최대값검색*/		
		for(int i = 1;i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	
	}
}
