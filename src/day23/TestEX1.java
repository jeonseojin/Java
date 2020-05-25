package day23;

import java.util.*;

public class TestEX1 {

	public static void main(String[] args) {
/* 정수 5개를 입력받아 리스트에 저장하고, 저장된 값들의 합과 평균을 구하는 코드를 작성하세요. 
 * - 합과 평균을 메소드를 이용하여 확인하도록 코드를 작성하세요.
 * - Iterator를 이용하여 작성하세요.*/
	Scanner scan = new Scanner(System.in);

	List<Integer> list = new ArrayList<Integer>();
	for(int i=1;i<=5;i++) {
/* 	int a =scan.nextInt();
	list.add(a);	
	아래의 스캔을 통해서 바로 입력받기도 가능*/
		list.add(scan.nextInt());
	}
	System.out.println(sum(list));
	System.out.println(res(list));
		
	Iterator<Integer> it = list.iterator();
	int s= 0;
	while(it.hasNext()) {
		s=it.next()+s;
	}
	System.out.println(s);
	System.out.println((double)s/list.size());
	}
/* 기능 : 리스트에 저장된 값들의 합을 구하세요.
 * 매개변수 : 리스트
 * 리턴타입 : int
 * 메소드명 : sum		 */
	public static int sum(List<Integer> list) {
		int sum=0;
		for(int i = 0;i<list.size();i++) {
			sum = list.get(i)+sum;
		}
		return sum;
	}
	public static double res(List<Integer> list) {
		return (double)sum(list)/list.size();
	}
}
	/* List는 지네릭스 클래스이기 떄문에 <>안에 클래스 명을 넣어주어야하고,
	 * int는 클래스가 아니기 때문에 int의 래퍼클래스인 Integer를 넣어줌
	 * 인터페이스인 List는 List 인터페이스를 구현한 ArrayList 클래스의 객체를 저장할 수 있다.
	 * 인터페이스는 객체를 생성할 수 없다. <= List<Integer> list = new List<Integer>();
	 * 추상메소드와 상수로만 이루어진 것을 인터페이스라 한다.
	 * 추상메소드란 메소드의 선언부만 있고, 구현부가 없는 메소드를 의미한다. 
	 * new ArrayList<Integer>(5) => 생성자에 추가한 5는 리스트의 size()가 아닌 용량을 의미한다.
	 * 리스트의 size() 메소드는 현재 저장된 객체의 갯수를 의미한다.
	 * 리스트 안에서는 배열로 되어 있는데, 이때 만들어진 배열의 크기가 용량이다.*/