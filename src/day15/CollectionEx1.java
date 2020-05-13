package day15;

import java.util.*;




public class CollectionEx1 {
/* 컬렉션 프레임웍은 배열을 좀 더 쉽게 접근할 수 있게 해주는 것*/
	public static void main(String[] args) {
/*Num클래스의 객체만 저장 가능한 list를 ArrayList로 생성한 것*/
		ArrayList<Num> list = new ArrayList<Num>();
		list.add(new Num());
//		list.add(new Ch()); -> Ch클래스를 이용한 객체는 Num클래스를 이용한 객체가 아니여서 에러 발생 
//		list.add(new Num2()); ->자식클래스를 부모 클래솔 자동 형변환할 수 있기 때문에 에러가 발생하지 않음
		list.add(new Num());
		list.add(new Num(1));
		list.add(new Num(100));
		printList(list);
		list.remove(new Num());
//object의 equals는 같은 주소에 저장된 것을 확인하여 지우는것 Num의 같은 값을 지우기 위해서는 equals를 만들어야함
		System.out.println("Num가 0인 객체를 지운 후 list");
		printList(list);
		ArrayList<Num> list2 = new ArrayList<Num>(list/*생성자*/);
		System.out.println("복사 생성자를 이용한 list2");
		printList(list2);
		list.add(1,new Num(200));
		System.out.println("1번지에 200을 추가 후 list");
		printList(list);
		list2.clear();
		System.out.println("list2를 clear한 후 list2");
		printList(list2);
		list2.addAll(list);
		System.out.println("list를 list2에 추가 후 list2");
		printList(list2);
		System.out.println("향상된 for문을 이용하지 않은 반복문");
		for(int i=0;i<list.size/*저장된객체의수*/();i++) {
			System.out.print(list.get(i));
		}System.out.println();
		System.out.println("iterator를 이용한 출력문");
		Iterator<Num> it = list.iterator();
		while(it.hasNext()) {
		/* Num tmp = it.next();
		 * System.out.print(tmp+" ");
		 * 아래의 한줄과 동일한 결과를 만듬
		 */
			System.out.print(it.next()+"");}
/* 반복문이지만 증감연산자가 필요없기에 while문으로 사용
 * hasNext는 해당 위치에서 다음 값이 있는지 없는지만 확인
 * it.next()로 다음 값을 출력하는 과정임
 */
		System.out.println();
		list.ensureCapacity(100);
//최대로 저장할 수 있는 수
		List<Num> list3 = list.subList(0, 2);
		System.out.println("0번지에서 2번지 사이의 부분 리스트(2번지 제외)");
		printList(list3);
		list.sort(new Comparator<Num>() {
/* 익명 클래스는 주로 메소드에서 인터페이스를 구현한 클래스가 필요한데
 * 해당 메소드가 기능이 하나뿐이여서 따로 정의하기 귀찮은 경우 익명 클래스를 이용한다.
 */
			@Override
			public int compare(Num n0, Num n1) {//내림차순의 경우 >에선 -1 <에선 +를 사용
				if(n0.num>n1.num) return 1;
				if(n0.num<n1.num) return -1;
				return 0;}
		});
		System.out.println("정렬 후 list");
		printList(list);
		}

private static void printList(/*ArrayList와 LinkedList 모두 옴*/List<Num> list) {
	for(Num tmp : list) {//향상된 for문을 사용하여 값을 출력
		System.out.print(tmp+" ");			
	}System.out.println();
}

}
class Num{
	int num;

	@Override
	public String toString() {	return "[num=" + num + "]";	}
	
	public Num() {}
	public Num(int num) {this.num=num;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null)	return false;
		if (getClass() != obj.getClass())	return false;
		Num other = (Num) obj;
		if (num != other.num)	return false;
		return true;
	}
	
	
	
}

class Num2 extends Num{
	
}

class Ch{
	char ch;

	@Override
	public String toString() {	return "Ch [ch=" + ch + "]";	}
	
}