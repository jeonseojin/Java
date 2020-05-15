package day16;

import java.util.*;

import day8.inheritanceEx1;

public class test2 {
/*숫자야구 게임을 리스트를 이용해서 작성하세요.*/
	public static void main(String[] args) {
		List<Integer> com = new ArrayList<Integer>();	
		List<Integer> user = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
/*1~10사이의랜덤수*/	
		com = Ran(com);
		System.out.println(com);
/* 스트라이크, 볼, 아웃판정*/
		

		}
/*랜덤수 생성*/	
	public static int random(int min, int max) {
		if(max<min)throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}

	
	public static List<Integer> Ran(List<Integer> com){
		while(com.size()<3) {
			int r = new Random().nextInt(10)+1;
			if(!com.contains(r)) {
				com.add(r);
			}
		}return com;
	}
	
	
	public static int Strike(List<Integer> com,List<Integer>user) {
		int cnt=0;
		for(int i=0;i<com.size();i++) {
			if(com.get(i)==user.get(i)) {cnt++;	}
		}
		return cnt;
	}
	
}
