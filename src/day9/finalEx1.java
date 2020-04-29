package day9;

public class finalEx1 {
/* 변수 	: 상수
 * 메서드 	: 오버라이딩을 할 수 없다(오버로딩은 가능)
 * 클래스 	: 부모 클래스가 될 수 없지만 자식클래스가 될 수는 있다.
 * final 멤버 변수는 명시적 초기화를 하던지 생성자에서 초기화를 해야한다.
 * 
 */
	public static void main(String[] args) {
		final double PI;	/*지역변수는 자동 초기화가 되지 않는다.(객체변수는 자동초기화)*/
		PI = 3.141592;		//초기화를 함
/*		PI = 3.14;		 	   에러발생 : 초기화 된 final 상수를 수정하러 했기 때문에 */
		A a= new A();
		a.print();
		int arr[] = new int[10];
		System.out.println(arr.length);
//arr.length = 11; >에러발생 : final 변수이므로 수정할 수 없다.
		Array array= new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
//		System.out.println(array.get(3));
//		System.out.println(array.get(4));
		for(int i = 0 ; i<5; i++) {
			System.out.println(array.pop());
		}
/* 위의 array.push();값을 현재 1~4까지 밖에 입력하지 않아서 for문의 조건식 중 
 * 4,3,2,1은 정상적으로 출력되지만 아직 입력받지 않은 5번째는 값이 없기에 출력할 수 없다는
 * 의미의 0이 나온다.
 */

	}
}
class C{}	/*
 * final class A extends C{} >final 클래스는 자식이 될 수 있기 때문에
 * 현재 코드는 A는 C의 자식코드가 된다. 
 */

final class A{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class B{ 
//extends A{} > 클래스 A는 final 클래스이기 때문에 상속하려하면 에러 발생
}
class D{/* 
 * print 메서드에 final을 붙이면 아래 클래스 E에서 print 메서드를 오버라이드 할 수 없다.
 * final 사용할 경우에 에러 발생
*/
	public /*final*/ void print() {
		System.out.println("D클래스입니다.");
	}
}
class E extends D{
	@Override/*따로 사용하지 않아도 자동으로 생략설정되어 있기 때문에 입력하지 않아도 됨*/
	public void print() {
		System.out.println("E클래스입니다.");
	}
}


/*final응용*/
class Array{
	public final int length;/* 
 * public final int length; 이론적으로는 자동초기화 되서 에러가 발생하지않지만
 * final을 사용하므로 확인하라는 의미로 한번 더 초기화하는 의미
 */
	private int arr[];//int형 변수의 기능을 만들기위해 작성
	private int index=0;//현재 저장된 원소의 수를 알려주는 것
	public Array() {
		length = 10;
		arr=new int[length];
	}
	public Array(int length) {
		this.length = length;
		arr=new int[length];
	}
	public void push(int num) {
		if(index<length) {
			arr[index] = num;
			index++;	
		}
/* 
  	else{
  		1. 안내 메세지만 처리
  		2. 배열의 크기를 확장하여 추가하는 경우
  	}
 */
	}
	public int get(int index) {
		if(this.index > index) {
			return arr[index];
		}return 0; /* 
 * 잘못된 접근이기 때문에 예외처리 클래스를 이용하여 처리해야하지만 배우기 전이라 0으로 처리
 * throw를 사용하여 예외처리하는 것 */
	}
	public int pop() {
	 if(index==0) {
		 return 0; //throw를 이용하여 예외를 발생시켜야하는데 아직 안배워서 그냥 0으로 리턴
	 }return arr[--index];
	 /* 위의 return arr[index--];와 아래의 내용은 동일하다.
	  * index--;
	  * int res = arr[index];
	  * return res; 
	  */
	}
}