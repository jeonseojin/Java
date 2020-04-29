package day9;

public class InheritanceEx2 {

	public static void main(String[] args) {
/* 같은 페키지 내에 있는 Shape클래스에서 내용을 불러옴*/
		System.out.println("부모클래스에서 바로 값을 입력하고 출력");
		Shape s1 = new Shape(5,5,10,10);
		s1.print();
		System.out.println("부모클래스의 move와 resize를 따로 값을 준 경우");
		s1.resize(4, 5);
		s1.move(10, 10);
		s1.print();
		System.out.println("자식클래스 사각형을 출력한 경우");
		Square sq1 = new Square(1,2,3,4);
/* Square클래스에 기본생성자가 입력되지 않을경우 public Square(){}이
 * 자동으로 설정되어 따로 객체가 존재하지 않아서 ()안에 수를 입력할 경우 에러가 발생한다.
 * 하지만 
 * public Square(int left,int up, double width, double height ) {
 * super(left,up,width,height);		}
 * 위의 내용을 Square클래스 생성자에 입력하여 super를 통해서 부모클래스의 생성자를 호출할 수 있게 되어
 * new Square(5,5,10,10)을 입력하면 입력한 값이 출력된다.
 */
		sq1.print();
		System.out.println("자식클래스 사각형의 move=0, resize=5,5로 따로 값을 준 경우");
		sq1.move(0, 0);
		sq1.resize(5, 5);
		sq1.print();
		System.out.println("부모클래스에 직접 값을 입력한 경우");
		Shape s2 = new Shape(3,4,5,6);
		s2.print();
/* 아무것도 입력하지 않고 그대로 출력할 경우는 상속이 필요하지 않아보이지만
 * 현재 코드에서는 move,resize 등을 따로 입력하여 다른값을 출력할 수 있는 
 * 재사용성이 높기 때문에 따로 사용하는 것이 편하다. 
 */
		System.out.println("새로운 자식클래스 원형을 입력한 경우");
		Circle c1 = new Circle(0,0,5);
		c1.print();
		System.out.println("자식클래스의  move를 0,5로 따로 값을 준 경우");
		c1.move(0, 5);
		c1.print();
		System.out.println("자식클래스의 resize를 2로 따로 값을 준 경우");
		c1.resize(2);
		c1.print();
		System.out.println("자식클래스 원형을 2개 추가하여 만듬");
		Circle c2 = new Circle();
		c2.print();
		Circle c3 = new Circle();
		c3.print();
		System.out.println("현재 부모클래스를 통해 생성된 총 갯수와 자식클래스에서 생성된 갯수");
		Shape.printCount();
		Square.printCount();
		Circle.printCount();
		
	}

}
