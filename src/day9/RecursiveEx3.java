package day9;

public class RecursiveEx3 {

	public static void main(String[] args) {
		ClassB b= new ClassB();
		b.print(5);
		System.out.println(sum(100));
		System.out.println(sum(1, 5));
	}
/*1부터 10까지 합을 구하는 코드를 재귀메서드로 작성하세요
 * 10 + 9 + 8 ......+ 1
 * 10 + sum(9)
 * */

/*팩토리얼구하는 코드 활용*/	public static int sum(int num) {
		if(num < 0) return 0;//음수가 입력될 경우 0을로 인식
		if(num == 1)
			return 1;
		return num + sum(num-1);
	}

/**/	public static int sum(int min, int max) {//sum의 오버로딩
		if(min > max) {
			int tmp =min;
			min=max;
			max=tmp;
		}
/* 위의 공식처럼 작성할 경우에는 최소값과 최대값이 반대로 적혀 있을 경우 서로 값을 교환하여
 * 값을 구할 수 있게 바꾸어 주는 코드이며
 * if(min>max) return 0;을 입력할 경우는 최소값이 최대값보다 크게 입력될 경우 0으로 처리하겠다는 것 
 */
		if(max == min) {
			return min;
		}
		return max + sum(min,max-1);
	}
}

class ClassA{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class ClassB extends ClassA{

/*오버라이딩*/		public void print() {
/* printf(); 재귀호출이 되어 스택오버플로우 에러가 발생한다.
 * 목적에 맞는 부모클래스를 의미하는 super를 붙여줘야한다.*/
		super.print();
		System.out.println("B클래스입니다.");
	}

/*오버로딩*/		public void print(int num) {
		print();
		System.out.println("B클래스입니다.");
	}

}
