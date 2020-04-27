package day7;

import java.util.Scanner;

public class MethodeEx5 {

	public static void main(String[] args) {
		int num=5;

		if(isPrime1(num)) {
			System.out.println(num+"는 소수");
		}else {
			System.out.println(num+"는 소수 아님");
		}
		
		if(isPrime2(num)) {
			System.out.println(num+"는 소수");
		}else {
			System.out.println(num+"는 소수 아님");
		}
	}

/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메서드 
 * 매개변수 : 주어진 정수 int num					* 의미 있는 정보 : 정수 => int num
 *  └ 일을 시킬때 최소한의 정보
 * 리턴타입 : 소수인지 아닌지 질문(예/아니요) => 참 또는 거짓 => boolean
 * 메서드명 : isPrime
 * public static (boolean ) isPrime (int num){}
*/

	public static boolean isPrime1(int num) {
		int cnt=0;
		if(num==1)
			return false;
		for(int i =2; i<num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
			if(cnt==0) {
				return true;
			}else {
				return false;
			}
		}

	
	public static boolean isPrime2(int num) {
		if(num==1)
			return true;
		for(int i =2; i<num; i++) {
			if(num%i==0) {
				return false;
				
			}
		}return true;
	}
}
