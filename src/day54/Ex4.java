package day54;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
// 컬렉션프레임워크를 이용하여 1부터 10까지 저장하는 코드를 작성하세요.
		/* ArrayList,HashSet으로 생성가능 -> 자주 사용하는 ArrayList를 통해서 작성
		HashSet<Integer> arr2 = new HashSet<Integer>();
		HashMap<Integer, Integer> arr3 = new HashMap<Integer, Integer>();
		-> hashmap을 사용해서는 만들 수 없음 */
		
		// int => 일반변수
		// Integer => 참조변수 => Null
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			arr.add(i);
		}
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
