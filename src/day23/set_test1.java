package day23;

import java.util.*;


public class set_test1 {

	public static void main(String[] args) {
/* 중복되지 않는 정수 5개를 Set에 저장하고, 저장된 값의 합과 평균을 구하세요. */
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int size = 5;
/* 문제에서 정수 5개를 입력받는게 아니라 중복되지 않은 정수 5개를 받아야 하기 때문에 
 * 반복횟수는 5번으로 고정된 것이 아니라 set에 5개가 저장될때 까지 반복되어야한다.*/
		for(; set.size()<size ;) {
			set.add(scan.nextInt());
		}
		int sum = sum(set);
		System.out.println(sum);
		double avg = (double)sum / set.size();
		System.out.println(avg);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2);
		System.out.println(sum(list));
	
	}
	/* 아래 sum 메소드는 매개변수가 Collection 인터페이스를 구현한 모든 객체이기 떄문에 
	 * Set이 와도 가능하고, List가 와도 가능하다. 즉, 재사용성이 높아진다.	 */
	public static int sum(Collection<Integer> c) {
		Iterator<Integer> it = c.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer tmp = it.next();
			if(tmp != null) sum +=tmp;
		}
		return sum;
	}
}
