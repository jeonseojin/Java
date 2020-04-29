package day6;

import java.util.Scanner;

public class testEx5 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하는 코드를 작성하시오.
		 * 그리고 배열의 값을 출력하여 제대로 들어갔는지 확인하세요. */
		int []arr = new int[5];
// 배열의 값을 0번지부터 마지막까지 접근하는 반복문
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("└ arr[?]의 '?'에 각각 참조주소를 직접입력해서 그 위치의 값을 출력하는 방식");

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("└ for문으로 mian에서 정수형 배열 5개짜리를 생성");
		System.out.println();
		System.out.println("메서드를 통해서 확인");
		System.out.println();
		printArray(arr);
		System.out.println("└ 앞서 작성한 for문을 메서드에 활용하여 정수형 배열 5개짜리를 생성");
		
/* 0번지에는 0을 1번지에는 1을 ...4번지에는 4가 저장되도록 작성하세요
 */
		for(int i=0; i<arr.length;i++) {
			arr[i]=i;
		}
		printArray(arr);
		System.out.println("└ 메서드에 i의 값을 저장하여 출력되도록 코드 "
				+ "생성 ");
		System.out.println();
/* num1을 저장 후 num의 값이 arr에 있는 지 없는 지 확인하여 있으면 있습니다.
 * 없으면 없습니다라고 출력하는 코드를 작성하세요.
 */	
		
		System.out.print("임의의 수를 입력하세요 : ");
		int num1; 
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		if(isDuplicated(arr,num1)) {
			System.out.println(num1 + "는 있습니다.");
		}else {
			System.out.println(num1 + "는 없습니다.");
		}
		System.out.println("isDuplicated");
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]==num1) {
				System.out.println("입력하신 값 "+num1+ "는 저장되어 있습니다.");
				break;
 arr.lenth-1은 배열 arr의 마지막번지
  앞에서 중복검사를 하기 때문에 마지막번지이면서 여기까지 왔다는 것은
  마지막번지까지 중복된 내용이 없다는 뜻이다. 
			}if(i==arr.length-1) {
				System.out.println("입력하신 값 "+num1+"는 찾을 수 없습니다.");
			}
		}
		
		*/
		me(arr, 0);
		System.out.println("me");
			
		
	}
		
/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
 * 매개변수 : '배열' : 정수형 배열 int []arr
 * 리턴타입 : 없음.... : void
 * 메서드명 : printArray
 * public static (리턴 : 없음) (메서드명 : printArray)(매개변수 : int []arr){}
 */

		public static void printArray(int []arr) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
/* 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드//확인하는 것이 빠진코드
 * 		= arr에 num이 있다 또는 없다 
 * 매개변수 : 정수 배열 int []arr, int num
 * 리턴타입 : void
 * 메서드명 : isDuplicated
 * public static (리턴 : 없음) (메서드명 : me)(매개변수 : int []arr){}
 */
		public static void me(int []arr, int num) {
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			for(int i = 0;i<arr.length; i++) {
				
				if(arr[i]==num) {
					System.out.println(arr[i]==num);
					break;
				}
				if(i==arr.length-1) {
					System.out.println(arr[i]==num);
					break;
				}
				
			}
		}
/* 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드
 * 		= arr에 num이 있다 또는 없다 
 * 매개변수 : 정수 배열 int []arr, int num // 확인하려는 정수
 * 리턴타입 : 있는지 없는지 확인 : boolean
 * 메서드명 : is
 * public static (리턴 : boolean) (메서드명 : is)(매개변수 : int []arr){}
 */
		public static boolean isDuplicated(int []arr, int num) {
			for(int i = 0;i<arr.length; i++) {
				if(arr[i] == num) {
					return true;
				}
			}
			return false;	
		}
	}

		

/* ★★★★★가장 쉽게 틀리는 부분은 {}의 위치와 갯수 */