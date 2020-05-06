package day10;

public class PolymorphismEx2 {
/* 매개변수의 다형성을 알아보기위한 클래스2
 * 기아차와 현대차의 속성을 다르게해서 다형성을 확인
 */
	public static void main(String[] args) {
		/* 제조사의 종류와 상관없이 10개짜리 배열에 차량을 관리 할 수 있다.
		Car[] arr = new Car[10];//입고된 차량을 관리하기 위한 배열
		arr[0] = new KiaCar();
		arr[1] = new HyundaiCar();
		
		 * 부모타입을 사용하지않고 하는 경우
		 * 제조사가 추가되면 해당 제조사를 관리하기 위한 배열을 추가로 만들어서 관리해야한다.
		 
		  	KiaCar karr[] = new KiaCar[10];
			HyundaiCar harr[] = new HyundaiCar[10];
			karr[0] = new KiaCar();
			harr[0] = new HyundaiCar();
		
		*/
		Car arr[] = new Car[10];
		arr[0] = new KiaCar("모닝");
		arr[1] = new KiaCar("K3");
		arr[2] = new KiaCar("쏘울");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("쏘나타");
		arr[5] = new HyundaiCar("그랜저");
		showCar(arr);
	}
	public static void showCar(Car []arr) {
		for(int i =0; i< arr.length;i++) {
			if(arr[i] != null) {
				if(arr[i] instanceof/*형변환확인*/ KiaCar) {
//System.out.println(arr[i].manufacturer+" : " + arr[i].name + " : " + /*arr[i].h는 부모기준의 arr이기때문에 사용불가*/);}
					System.out.println(arr[i].manufacturer+" : " + arr[i].name + " : " + ((KiaCar)arr[i]).Kia);}
			}
			if(arr[i] instanceof/*형변환확인*/ HyundaiCar) {
				System.out.println(arr[i].manufacturer+" : " + arr[i].name + " : " + ((HyundaiCar)arr[i]).h);}
		}
		}
	}

class Car{
	int wheel;
	String type;
	String manufacturer;
	String name;
	public Car() {}
	public Car(String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
}
class KiaCar extends Car {
	String Kia = "기아차입니다.";
	public KiaCar() { manufacturer = "Kia";}
	public KiaCar( String name) {
		super("Kai", name);
	}
}
class HyundaiCar extends Car {
	String h = "현대차입니다.";
	public HyundaiCar() { manufacturer = "HyundaiCar";}
	public HyundaiCar( String name) {
		super("Hyundai", name);
	}
}