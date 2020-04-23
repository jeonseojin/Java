package day5;

import day4.*;
import day5_1.DefaultClassEx1;

public class ClassEx1 {
//class test3이 public으로 작성되어서 다른곳에서도 사용가능
	public static void main(String[] args) {
/* 접근제한자 
	- public : 누구나 사용 가능
	- private : 나만 사용 가능, 일반적으로 클래스에 붙이지는 않는다.(해당 class 안에서만 사용 가능)
	- protected : '나 + 패키지 + 자식클래스'를 의미
	- default : '나 + 패키지' (아무것도 입력하지 않을 경우에 해당함)
 */ 
		//public 사용 예시
		test3.main(null);
		DefaultClassEx1.main(null);
		
/* DefaultClassEx2는 다른 패키지에 있는 클래스인데 접근제한자가 default이므로
 * 사용할 수 없기 때문에 에러 발생 */
		//DefaultClassEx2.main(null);
		point p1 = new point();
		// point p1;으로만 작성할 경우 객체를 선언만한 상태를 의미하며 new point로 작성해야 새로운 생성자가 입력된다.
		p1.x1 = 10;//default로 입력된 x1은 세모의 형태로 뜨며 public으로 입력된 x3는 원형태로 뜬다.
		// p1.x2 = 10;에서 x2는 point클래스에서 private이기 때문에 다른 클래스에서 사용할 수 없다.
		p1 = new point(1,2);
		/*  p1 = new point(3,4,5);
			p1 = new point(1);
			위의 생성자는 작성할때 길이만큼 만들지 않아서 에러 발생
		*/
	}

}
//point : 2차원 좌표평면에서 점 1개를 나타내는 클래스
class point{
	int x1; // x축의 좌표
	int y1; // y축의 좌표
	//default : '나 + 패키지' (아무것도 입력하지 않을 경우에 해당함)
	//따로 수식을 사용하지 않아도 default로 인식되며 페키지내에서 제한없이 사용 가능하다
	private int x2;
	private int y2;
	//private : 나만 사용 가능, 일반적으로 클래스에 붙이지는 않는다.(해당 class 안에서만 사용 가능)
	//private은 해당 class에서만 사용이 가능한 형태이므로 다른클래스에서는 사용할 수 없다.(24번째 줄 참고)
	public int x3;
	public int y3;
	//public : 누구나 사용 가능
	public point() {//0,0으로 항상 초기화가 되어 생략가능
		x1= x2 = x3 = 0;
		y1= y2 = y3 = 0;
		System.out.println("point의 기본 생성자 호출");
	}
//생성자 오버로딩
//초기값이 외부에서 알려주는  x 또는 y로 설정하는것
	public point(int x, int y) {
		x1= x2 = x3 = x;
		y1= y2 = y3 = y;
		System.out.println("point의 생성자 오버로딩 호출");
	}
}
