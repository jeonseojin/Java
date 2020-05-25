package day23;
/*샘과 같이 하는 test1*/
import java.util.*;

public class test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int size=5;
		Scanner scan = new Scanner(System.in);				
		for(int i=0;i<size;i++) {
			int tmp = scan.nextInt();
			/* 정수를 입력받아 tmp에 저장한 후 리스트에 add 메소드를 이용하여 추가하는데
			 * 이 때 정수 tmp를 Integer 클래스의 객체로 변환하여 저장환다.(오토박싱/언박싱) */
			list.add(tmp);
		}
		int sum = 0;
		double avg = 0.0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
/* Iterator를 생성할 때 Iterator의 <>안에 입력을 안하면 Object가 자동으로 들어가고 
 * 그렇게 되면 it.next()를 통해 가져오는 정보의 클래스도 Object가 되기 때문에 형변환이 필요하다.*/
			Integer tmp = it.next();
/* 		래퍼클래스를 사용할 때 주의할 사항
 * - int는 정수형을 저장하고, Integer 클래스는 정수형과 null을 저장한다.
 * - 따라서 Integer의 객체를 int로 저장하는 경우 Integer의 객체가 null인지 아닌지 판단할 필요가 있다.*/
			if(tmp!=null)
			sum += tmp;
		}
		avg = (double) sum / list.size();
		sum = sum(list);
		avg = avg(list);
		System.out.println(sum);
		System.out.println(avg);
	}
	
	
	public static int sum(List<Integer> list) {
		int sum=0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			if(tmp!=null)
			sum += tmp;
		}
		return sum;
	}
	
	public static double avg(List<Integer> list) {
		return (double)sum(list)/list.size();
	}
}
