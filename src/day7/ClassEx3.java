package day7;

public class ClassEx3 {

	public static void main(String[] args) {
/* 메서드 : 하나의 기능을 하도록 모아놓은 코드
 * 클래스 : 어떠한 정보를 나타내기 위해 모아놓은 코드
  	- 변수 : 정보를 관리
  	- 메서드 : 기능을 관리 (메서드를 쓰는 이유는 편하게 쓰기 위함)
  	- 생성자 : 변수 초기화
 * 메소드와 생성자의 호출 하는 시기
   - 메소드는 메소드를 호출할 때 실행
   - 생성자는 객체를 생성할 때 실행, 생성자는 중간에 직접 호출할 수 없다.

 * 오버로딩 : 동일한 이름을 가진 생성자나 메소드가 2개 이상인 경우
 * 아래를 만족하면 오버로딩, 만족하지 않으면 에러 발생
  	- 매개변수가 달라야한다
	1. 갯수
	2. 자료형
 * Scanner scan;//클래스 메서드와 변수가 생성
 * scan.nextInt();//를 사용하면 에러
 * scan = new Scanner(System.in);//객체 메서드와 변수가 생성
	- 클래스 변수는 객체 메서드에서 사용 가능하다
	- 객체 변수는 클래스 메서드에서 사용 가능하다ㄴ
	- 클래스 메서드는 객체 메서드에서 사용 가능하다
	- 객체 메서드는 클래스 메서드에서 사용 가능하다ㄴ
*/
		
		System.out.println("클래스 메서드 호출은 클래스명.클래스메서드명");
		KiaCar.printInfo();
		KiaCar c1 = new KiaCar();
		// c1.printInfo(); => 객체.클래스메서드명 둘다 가능//가능은 하지만 권장하지않음
		c1.printCarInfo();
		KiaCar.printInfo();
		System.out.println();
		KiaCar c2= new KiaCar("뉴그랜버드",6);
		c2.printCarInfo();
		KiaCar.printInfo();
		System.out.println();
		for(int i=0;i<10;i++) {
			c2.speedUp();
			c2.printSpeed();
		}
		for(int i =0; i<20;i++) {
			c2.speedDown();
			c2.printSpeed();
		}
	}
}
//ex)모닝, K3, 쏘렌토
class KiaCar{
// 클래스 변수
	private/*수정불가*/ static String manufacturer = "KIA";
	private static int salesNumber = 0;
	
//객체 변수 
	int wheel;//눈에보이는상태
	boolean power;//눈에보이지않는상태
	int speed;
	String carName;
	String carNum;

//클래스 메소드
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	
	public static void printInfo() {
		System.out.println("제조사 : " + manufacturer);
		System.out.println("판매량 : " + salesNumber + "대");
	}
	
//객체 메소드
	public void turnOn() {
		System.out.println("시동이 꺼졌습니다.");
		power = true;
	}
	public void turnOff() {
		if(speed == 0) {
			System.out.println("시동이 꺼집니다.");
			power = false;
		}else {
			System.out.println("속도가 0이 아니어서 시동을 끌 수 없습니다.");
		}
	}
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		if(speed > 0)
		speed--;
	}
	public void printSpeed() {
		System.out.println("현재 주행 속도는 "+speed+"Km/h입니다.");
	}
	public void printCarInfo() {
		System.out.println("차종 : "+carName);
		System.out.println("바퀴수 : "+ wheel);
		printSpeed();
	}
//생성자
	public KiaCar() {
		wheel = 4;
		carName = "미정";
		salesNumber++;
	}
	public KiaCar(String carName, int wheel) {
/* 멤버 변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
 * 이러한 경우 멤버 변수를 의미하기 위해 변수명 앞에 this와 .을 써서
 * this.멤버변수명으로 사용한다. this는 자기자신을 의미하는 객체이다.
		carName = carName;
		wheel = wheel;
*/
		this.carName = carName;
		this.wheel = wheel;
		salesNumber++;
	}
 }
