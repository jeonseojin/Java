package day9;

public class Square extends Shape {
	private static int SquareCount;
	public void print() {
/* 사용하는 것이 메서드면 ()를 사용 get,set으로 변경시 getLeft로 대문자로 변경된다*/
		System.out.println("-------사각형의 정보--------");
		System.out.printf("시작점은 (%d , %d)\n",getLeft(),getUp());
		System.out.printf("가로 : %.2f\n",getWidth());
		System.out.printf("세로 : %.2f\n",getHeight());
		System.out.println("------------------------");
	}
	public Square() {}
	public Square(int left,int up, double width, double height ) {
		//부모 생성자 호출 : 자식 클래스의 생정자에서만 호출할 수 있다.
	super(left,up,width,height);
	SquareCount++;
	}
	public static void printCount() {//오버라이딩
		System.out.println("현재까지 만들어진 사각형의 갯수 : "+ SquareCount);
	}

}
