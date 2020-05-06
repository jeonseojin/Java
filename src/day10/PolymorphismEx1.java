package day10;

public class PolymorphismEx1 {
// 매개변수의 다형성을 알아보기위한 클래스1
	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		/* 자식 객체를 생성하여 부모가 참조하는 경우에는 자식클래스에 멤머변수
		 * power, ch, text가 만들어진 후 부모가 power,ch만 사용하기 때문에 이 경우는 가능
		 */
		Tv t1 = new CaptionTv();
		/* CaptionTv ct1 = new Tv();
		 * 부모객체를 생성하여 자식이 참조하는 경우에는 부모클래스의 멤버변수 power, ch만 만들어진
		 * 상태에서 자식이 text를 사용하려면 문제가 되기 때문에 이 경우는 불가능
		 * (부모클래스에 자식클래스의 필요한 멤버변수를 추가할 수는 있지만 다른 자식클래스에도
		 * 불필요하게 사용되기 때문에 효율성이 떨어짐) 
		 */
		t = ct;/*자손타입 -> 조상타입(항상가능)*/
		/* t = new Tv();  > 문법자체로는 상관이 없지만 입력할 경우 형변환불가로 에러발생
		 * 조상타입 -> 자손타입은 항상 가능한것이 아니라 조건부로 가능하다. 상황에 따라서
		 * ClassCastException이 발생한다. 
		 * 되는 경우는 부모객체 t가 부모클래스를 통해 생성된 객체가 아니라 자식클래스를 통해 생성된
		 * 객체와 연결이 된 경우는 가능
		 */
		
		ct = (CaptionTv)t;/*조상타입 -> 자손타입(항상x)*/
		SmartTv st = new SmartTv();
		ct =new CaptionTv();
		Tv.display(st);
		Tv.display(ct);
	}
}
class Tv{
	boolean power = false;
	int ch;
	void power() { power = !power; }
	void chUp() { ch++; }
	void chDown() { ch--;}
	public static void display(Tv t) {
		if(t instanceof CaptionTv) { System.out.println("캡션TV"); }
		else if(t instanceof SmartTv) {System.out.println("스마트TV");}
		}
	/* 메서드에서 매개변수가 형변환가능한지 여부를 확인하는코드에  사용 : instanceof < 조건문에 자주 사용됨
	 * 매개변수의 다형성을 사용한 코드로 작성시
	 * 	public static void display(Tv t) {
		if(t instanceof CaptionTv) { System.out.println("캡션TV"); }
		else if(t instanceof SmartTv) {System.out.println("스마트TV");}
		}
	 * 입력과 출력이 간단하게 사용가능하지만
	 * 매개변수의 다형성을 사용하지 않을 경우 오버로딩을 통해서 반복적으로 작업하여 코드작성
	 * public static void display(CaptionTv t) {System.out.println("캡션TV");}
	 * public static void display(CaptionTv t) {System.out.println("스마트TV");}
	 */
	}

class CaptionTv extends Tv{
	String text;
	void cation() { System.out.println("캡션 : " + text);}
}
class SmartTv extends Tv{ String ip;}