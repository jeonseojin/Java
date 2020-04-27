package day7;

import java.util.Random;

public class MethodeEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=30,min=20;
		System.out.println("----------랜덤 메소드로 출력------------");
		int rn=random(max,min);
		System.out.println(rn);
	}
/* 기능 : 임의의 정수를 생성하여 알려주는 메서드
 * 매개변수 : 두정수 사이의 임의의 정수 max, min
 * 리턴타입 : 정수를 알림 int 임의의 정수 => int
 * 메서드명 : random
 * public static ( int) random(int num){}
*/
	public static int random(int max, int min) {
		//1,9로 알려줘야하는데 9,1로 알려준 경우 1,9로 처리하기 위해 두 수를 교환하는 코드
		if(min>max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
		
	
	
}
