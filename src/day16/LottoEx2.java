package day16;

import java.util.*;

public class LottoEx2 {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		HashSet<Integer> auto = new HashSet<Integer>();
		int min = 1,max = 15;

		int bonus = 0;
/*예외처리*/
	try {
		auto = createRandomSet(min, max, 6);
		createRandomSet(min, max, lotto, 6);
/*보너스생성*/
		bonus = min-1;
		while(true) {
			bonus = random(min,max);
			if(!lotto.contains(bonus)) {
				break;
			}
		}
/*로또번호*/
		printSet(lotto);
		System.out.println("보너스 : "+bonus);
/*자동생성*/
		printSet(auto);
		System.out.println();

/*맞은갯수*/
		int rank =rank(lotto, bonus, auto);
		if(rank!=-1) {
			System.out.println(rank + "등 당첨!");
		}else {
			System.out.println("꽝!");
		}
		
		
/*등수 출력하는 코드*/
		
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());

		}
}
		

/* 기능 : min과 max가 주어지면 min보다 크거나 같고 max보다 작거나 같은 랜덤한 수를 반환하는 메소드 
 * 매겨변수 : 최소값과 최댓값 => int min, int max
 * 리턴타입 : 랜덤한 수 => 정수 => int 
 * 메소드명 : random */
	public static/*main에서 테스트를 할때 객체가 없어도 실행할 수 있도록 사용*/ int random(int min, int max)/*runtimeException은 생략가능*/ {
		if(max<min)
			throw new ArithmeticException("최소값과 최대값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
/* 기능 : 배열에 정수 num의 값이 있는지 없는지 알려주는 메소드
 * 매개변수 : 배열, 정수 num => int[]arr, int num
 * 리턴타입 : 있는지 없는지 => boolean
 * 메소드명 : contatins */
	public static boolean contatins(int[]arr,int num) {
		for(int tmp : arr) {
			if(tmp==num) return true;
		}return false;
	}
	
	
/* 기능 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 만들어서 배열의 갯수만큼 저장하는 메소드
 * 매개변수 :  int min, int max, int []arr
 * 리턴타입 : 없음
 * 메소브명 : createRandomArray
 */
	public static void createRandomSet(int min, int max, HashSet<Integer>lotto, int cnt)throws Exception,  NullPointerException{
		
		if(lotto == null) throw new NullPointerException("예외 : 빈 배열입니다.");
		if(cnt > max- min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		while(lotto.size()<cnt) {
			lotto.add(random(min, max));
			}
		}
	
	
/* 기능2 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 cnt개 만들어서 배열에 저장하여 배열을 반환하는 메소드
 * 매개변수2 : 최소, 최대, 갯수 => int min, int max, int cnt
 * 리턴타입2 : 배열 => int[]
 * 메소브명 : createRandomArray
 */
	public static HashSet<Integer> createRandomSet(int min, int max, int cnt) throws Exception{
		if(cnt>max-min+1) throw new Exception("랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		HashSet<Integer> set = new HashSet<Integer>(/*cnt를 넣어도 되고 안넣어도 됨*/);
		while(set.size() < cnt) {
			//int r = random(min, max);
			//if(!set.contains(r)){
				set.add(random(min,max));
			}
		return set;
	}
/*출력하는메소드*/
	public static void printSet(HashSet<Integer> lotto) {
		for(Integer tmp : lotto) {//class test exception?
			System.out.printf("%2d ",tmp);
		}
	}
/* 기능 : 당첨번호를 기준으로 자동생성된 번호가 몇등인지 알려주는 메소드(꽝 : -1)
 * 매개변수 : 당첨번호, 자동생성 번호 => int []lotto, int bonus, int []auto
 * 리턴타입 : 등수 => 정수 
 * 메소드명 : rank */
	public static int rank(HashSet<Integer> lotto,int bonus, HashSet<Integer> auto) {
		int sameCnt = 0;//같은 수가 몇개 있는지
		for(int tmp : lotto) {
			if(auto.contains(tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6: return 1;
		case 5:	return auto.contains(bonus)? 2 : 3;/*2(참):3(거짓)*/
		case 4: return 4;
		case 3: return 5;
		}		return -1;
	}
}


