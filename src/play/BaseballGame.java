package play;

import java.util.Scanner;

public class BaseballGame {
/* day7 test예제참고
 * 기존 구성 : createArray, random, printArray, isDuplicated
 * 야구게임 과제구성 : Scanner 추가, while문 추가,strike, ball +기존 구성
 * 
 */
	public static void main(String[] args) {
		int size =3;
		int com[] = new int[size];
		int user[]=new int[size];
		int min =1, max = 9;
		int s = 0 ,  b = 0;
		Scanner scan = new Scanner(System.in);
		createArray(min,max,size,com);
		printArray(com);
		
		while(s !=3) {
			int cnt =0 ;
			/*3수를 입력받는 코드*/
			while(cnt<3) {
				user[cnt] =scan.nextInt();
						cnt++;
			}
			/*스트라이크 판별*/
			s = strike(com, user);
			if(s != 0 ) System.out.print(s + "S");
			
			b = ball(com,user);
			if(b != 0) System.out.print(b+"B");
			if(s==0 && b==0) System.out.print("30");
			System.out.println();
		}
		System.out.println("종료!");
		scan.close();
	}
	public static int strike(int []com, int[] user) {
		int cnt = 0;
		for(int i = 0;i<com.length;i++) {
			if(com[i]==user[i]) { cnt++;}
		}return cnt;
	}
	
	public static int ball(int []com, int[] user) {
		int cnt = 0;
		for(int tmp:com) {
			if(isDuplicated(user,tmp)) { cnt++;}
		}return cnt- strike(com,user);
	}
	
	public static boolean createArray(int min, int max, int n, int []arr ) {
		if(arr==null) return false;
		if(max-min+1<n) return false;
		int cnt = 0;
		while(cnt<n) {
			int r = random(min, max);
			if( !isDuplicated(arr,r)) {
				arr[cnt] =r;
				cnt++;
			}
		}return true;
	}
	
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;	min = max;	max = tmp;
		}return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		} System.out.println();
	}
	
	public static boolean isDuplicated(int []arr, int num) {
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == num) { return true;}
		}return false;
	}
}