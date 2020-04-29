package day9;
/*클래스생성할때 superclass에 부모클래스를 입력하면 자동으로 extends 부모명이 입력된다*/
public class Circle extends Shape {
	private double centerX,centerY;
	private static int CircleCount;
	public static void printCount() {
// static메서드는 다형성이 적용되자않아 오버라이딩이 안되지만 오버라이딩처럼 보이는 하이딩이 적용된다.
		System.out.println("현재까지 만들어진 원형의 갯수 : "+ CircleCount);
	}
	public void print() {
	System.out.println("--------원형의 정보--------");
	System.out.printf("중심점 : (%.1f , %.1f)\n",centerX,centerY);
	System.out.printf("반지름 : %.2f\n",getRadius());
	/* getWidth는 더블이기때문에 /2만해도 가능하며 int였으면 2.f
	 * getWidth()/2 반지름정보 코드를 추가한 후에는 getRadous()로 처리가능*/
	System.out.println("------------------------");
	}
	public Circle() {	CircleCount++;}
/* 아래의 내용이 없을 경우에는 public Circle(){super();}(=부모클래스의 기본생성자 호출) 생략가능하지만
 * 기본생성자를 통해서 만들 경우에는 필요하기에 작성한다
 */
	
	public Circle(int left,int up, double radius) {
		super(left, up, radius*2,radius*2);
		centerX = left + radius; centerY = up - radius;
/*	super()의 내용과 같은 결과
  	setLeft(left);
	setUp(up);
	setWidth(radius*2);
	setWidth(radius*2);
*/
		CircleCount++;
	}

/*오버라이딩*/	public void move(int left, int up) { 
		super.move(left, up);//매개변수가 존재
		centerX = left + getRadius();
		centerY = up - getRadius();
	}
/*오버로딩*/	public void resize(double radius) {
		resize(2*radius, 2*radius);
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}
/*반지름 정보를 가져오는 코드↓ */
	public double getRadius() {	return getWidth()/2; }
}
