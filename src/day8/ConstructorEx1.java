package day8;

public class ConstructorEx1 {
//생성자에서 다른 생성자 호출 this
	public static void main(String[] args) {
		point p1 = new point();
		p1.print();
		point p2 = new point(1,2);
		p2.print();
		int num1;
		int num2 =10;
		num1 = num2;//값을 초기화했다는의미 =을 기준으로 왼쪽
		int num3 = num1;//값을 사용하는 의미 =을 기준으로 오른쪽
	}
}
class point{
	int x=1; int y=1;//명시적초기화
	{
		//객체초기화 불럭
		//x=10;
		//y=10;
	}
	static {
		//클래스 초기화 블럭
		//클래스 변수만 초기화 가능
	}
	void print() {
		System.out.printf("(%d,%d)",x,y);
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public point() {
		//this(0,0);	()를 사용하면 생성자가 됨
		this(100,100);//생성자
	}
	
//생성자이긴 하지만 매개변수로 생성자가 오는 경우를 복사 생성자라고 한다
	public point(point p) {
//다른 생성자 this()를 이용할 때에는 메서드의 첫번째줄에 넣어주어야한다.
		this(p.x,p.y);
		/* 위의 한줄과 동일한 내용
		 * 	this.x = p.x;
		 	this.y = p.y;  
		 */
	}
}