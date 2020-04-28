package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
			Duck d = new Duck();//Duck클래스의 기본 생성자를 찾으러감
			d.cry();
			
			Sparrow s = new Sparrow();
			s.cry();	//Sparrow에 int num이 있기 때문에 부모클래스로 이동하여 출력
			s.cry(0);	//Sparrow의 int num에 반응하여 자식클래스로 출력
			Sparrow s2 = new Sparrow(1);
			System.out.println(s.getWing());
			System.out.println(s2.getWing());
			
	}
}
class Bird{
	protected int wing;
	public void cry() {
		System.out.println("새가 웁니다.");
	}
	public Bird() { wing =2;	}
	public Bird(int wing) { this.wing=wing; }
//get,set 만들기
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
}

class Duck extends Bird{
// 메소드 오버라이딩
	@Override
	public void cry() {
//메서드 오버라이딩을 하는데 작업하는 메서드 명과 같은 부모클래스의 메서드를 super
//없이 호출하면 부모클래스가 아닌 내 클래스의 메서드로 호출되어 재퀴호출이 된다.
//부모클래스의 메서드를 의미하기 위해 앞에 super를 붙인다.
//cry(); Duck클래스의 cry로 호출되어 재귀호출이 된다. 에러발생
		super.cry();
		System.out.println("오리 : 꽥꽥");
	}
/* public Duck (){ super(); }
 * 위의 코드가 생략되어 있는 상태 / 생성자가 하나도 없으면 기본 생성자가 자동으로 생성이 된다.
 * 부모클래스의 기본생성자로 이동할 수 있는 코드가 생략되어 있는 상태
*/
}

class Sparrow extends Bird{
	/*@Override	 
	 * public void cry(int num)의 형태로 사용시
	 * 에러가 나는 이유는 부모클래스의 cry이와 동일해야해서 오류가뜸 */
	
	/*이상태로 사용할 때는 오버로딩이 발생*/
	public void cry(int num) { /*protected void cry(int num)으로 작성시 에러발생*/
		super.cry();
		cry();
		System.out.println("참새 : 짹쨱");
	}
	
// ↓ 부모클래스의 기본생성자
	public Sparrow() {
		super();
	}

	public Sparrow(int wing) {
		super(wing);
	}
	
	
}