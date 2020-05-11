package day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
/* 객체지향적도 절차지향적으로 진행됨
 * 
 * 실행 순서
 * 
 */
		try {//예외가 발생할 수 있는 코드입력
			//System.out.println(1/0);/* 산술 */	
			int arr[] = new int[4];
			//예외가 발생하면 그 이후 코드는 실행되지 않고 catch로 건너뛴다.
			arr[3] = 10;
			System.out.println("Hello");
		}			
		
		catch (ArithmeticException e) {	// 산수 예외 처리			
			System.out.println("0으로 나눌 수 없습니다.");		}		
		
		catch (IndexOutOfBoundsException e) {	// 배열 예외 처리
			System.out.println("배열 관련 예외가 발생");
		}
		catch (Exception/* < if문의 else같은 의미 항상 마지막에 와야함*/ e) {	// 예외 처리
			System.out.println("예외 발생");
		}/*문법적으로 없어도 상관없지만 만약을 위해 항상 넣어주는 것이 좋다.*/
		/*  아래 코드가 올 경우 에러가 발생하는 이유는 위에 Exception이 모든 예외처리를 하기 때문에 해당 예외 클래스까지 오는 경우가 절대 없다.
		 	catch (ArithmeticException e) {	// 산수 예외 처리			
			System.out.println("0으로 나눌 수 없습니다.");		}	
			
			
		 */
	}

}
