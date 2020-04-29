package day9;

public class OverLoadEx2 {

	public static void main(String[] args) {
/*OverLoadEx2 obj = new OverLoadEx2();
 static을 사용하지 않았을 때 에러가 발생하지 않게 하는방법*/
		System.out.println(sum(1,2));
		System.out.println(sum(1.1,2.1));
		System.out.println(sum(1,2,3));
		System.out.println("가변인자를 이용하여 1,2,3,4,5를 한 값 : "+sum(1,2,3,4,5));
		System.out.println("가변인자를 이용하여 값을 입력하지 않은 값 : "+sum());
		System.out.println("문자 '1'에 대한 유니코드값 49,2,3,4,5를 합한 값"+sum('1',2,3,4,5));
/* 문자 1에 대한 유니코드값(아스키코드값)인 49가 대신 들어가서 자동자료형변환이 되어 연산된다.
 * System.out.println(sum("1",2,3,4,5));
 * 문자열 1을 실수로 형변환 할 수 없어서 에러 발생
 * sum메서드를 오버로딩하여 문자열도 가능하도록 추가해야한다.
 */
	}
/*public int sum(int num1,int num2) {
	return num1 +num2;
}
	static을 사용하지 않았을 경우 객체를 만들지 않은 상태이기 때문에 에러발생
*/
	
	public static int sum(	int num1, int num2) {
		return num1+num2;
	}

/*오버로딩*/	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
/*정수는 자동으로 실수로 변경가능해서 굳이 두 버전을 사용하지않고 double을 사용해서 표현할 수 있다. */
	
	public static double sum(double num,double num1,double num2) {
		return num+num1+num2;
	}

/*가변인자*/	public static double sum(double...nums/*nums는 배열*/) {
		double res = 0.0;
		for(double tmp :nums) {
			res+=tmp;
		}return res;
	}/*가변인자를 이용한 합계 구하는 메서드*/
}