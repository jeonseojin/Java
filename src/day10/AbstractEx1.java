package day10;

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
abstract class A{/*추상클래스*/
	int a;
	public void print() { System.out.println(a);}
	public abstract void test();/*최소한으로 있어야 하는 코드(해당줄은 추상메소드)*/
}
class B extends A{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
/*Add unimplemented methods클릭하여 오버라이드 생성*/
	
}