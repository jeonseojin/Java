package day22;

import java.util.Scanner;

public class Test4 {
/* 배열이 주어지면 주어진 배열의 평균을 구하는 메소드
 * 배열이 주어지면 주어진 배열의 합을 구하는 메소드를 생성하여
 * 메인메소드에서 테스트해보세요.(어제한 예제 활용)  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("5개의 수를 입력하세요");
		System.out.println(sum(arr));
		System.out.println("5개의 수를 입력하세요");
		System.out.println(res(arr));
		
		System.out.println("================");
		System.out.println("5개의 수를 입력하세요");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("입력한 수의 합 : "+sum2(arr));
		System.out.println("입력한 수 평균 : "+average(arr));
		scan.close();
	}
/* 기능 : 배열이 주어지면 주어진 배열의 평균을 구하는 메소드
 * 매개변수 : 정수 주어진배열 => int arr[]
 * 리턴타입 : 배열의 평균 => double
 * 메소드명 : res	 */
	public static double res(int arr[]) {
		return (double)sum(arr)/(arr.length+1);
	}
	
/* 기능 : 배열이 주어지면 주어진 배열의 합을 구하는 메소드
 * 매개변수 : 정수 주어진 배열 => int arr[]
 * 리턴타입 : 배열의 합 => int
 * 메소드명 : sum
 */
	public static int sum(int arr[]) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		for(int i=1; i<=arr.length; i++) {
			sum += scan.nextInt();
		}
		return sum;
	}
/* 기능 : 배열이 주어지면 주어진 배열의 합을 구하는 메소드
 * 매개변수 : 정수 주어진 배열 => int arr[]
 * 리턴타입 : 배열의 합 => int
 * 메소드명 : sum2
 */
	public static int sum2(int []arr) {
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
		}return sum;
	}
/* 기능 : 배열이 주어지면 주어진 배열의 평균을 구하는 메소드
 * 매개변수 : 정수 주어진 배열 => int arr[]
 * 리턴타입 : 배열의 평균 => double
 * 메소드명 : sum	 */
	public static double average(int []arr) {
		return (double)sum2(arr)/arr.length;
	}
}
