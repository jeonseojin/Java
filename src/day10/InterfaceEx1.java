package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface RemoteController{/*멤버변수가 없기 때문에 기능을 메소드로 정리할 때 헝성 이 부분을 염두해두고 작성해야된다.*/
	int num = 10;
	/*public final이 자동으로 생략되어 있어 위의 num이 가리키는 10은 상수이다.*/
	public int chUp(int ch);
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
	/*추상메소드로 구성되어 있는 추상클래스*/
	public default void test() {}
	/* 인터페이스에 새로운 추상메소드를 추가하면 해당 인터페이스를 구현한 모든 클래스에 에러가발생(오버라이딩하지않아서발생)
	 * 이러한 번거로움을 해결하고자 디폴트 메소드를 이용한다.
	 * 디폴드 메소드는 구현된 내용이 없는 메소드로 추상메소드와의 차이는 추상메소드는
	 * 구현클래스에서 꼭 오버라이딩을 해야하지만 디폴트는 안해도 된다.
	 */
}
class TvRemoteController implements RemoteController{/*추상메소드이기에 오버라이드*/

	@Override
	public int chUp(int ch) { 	return ++ch;	}

	@Override
	public int chDown(int ch) { return --ch;	}

	@Override
	public int volUp(int vol) {return ++vol;	}

	@Override
	public int volDown(int vol) { return --vol;	}
	
}