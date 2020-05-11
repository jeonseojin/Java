package day13;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//throw new MyException(100, "예외 상황입니다."); 				직구로 사용하는 코드
			MyException e= new MyException(100, "예외 상황입니다.");			//e라는 다른객체를 통해서 돌려서 사용하는 코드
			throw e;
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception 입니다.");
		}
	}

}

/* 이름에 예외가 들어간  MyException이라는 클래스를 만드는 것이 아니라
 * 예외 처리에서 사용할 수 있는  MyException 클래스를 생성
 */
class MyException extends Exception{
	private final int ERR_CODE;
	public MyException(int err_code, String msg) {
		super(msg);
		ERR_CODE = err_code;
	}
	public MyException() {
		ERR_CODE = -1;
	}
	public MyException(int err_code) {
		ERR_CODE = err_code;
	}
	public MyException(String msg) {
		super(msg);
		ERR_CODE = -1;
	}
	public int getERR_CODE() {	return ERR_CODE;	}/*상수는 값을 변경할 수 없기에 setter를 만들지못함 */
	
	@Override
	public String getMessage() {
		return "ERR_CODE : "+ ERR_CODE +super.getMessage();
	}
	
}