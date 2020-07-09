package day53;

public class Ex1 {

	public static void main(String[] args) {

		int num1 = 10;
// = 을 기준으로 왼쪽은 int(정수)이고, 오른쪽은 double(실수)이어서 자동 자료형 변화이 되지 않아 에러가 발생
		int num2 =(int)1.23;	//명시적 자료형변환을 통해 에러 제거
//	int = char 이기 때문에 자동 자료형 변환이 되어서 에러가 발생하지 않음
		int num3 = 'A';
		// 123456789이라는 숫자가 커서 2바이트로 표현할 수 없기 때문에 에러발생
		char ch1 = (char)1234567890;
//		1.23은 double형 실수이기 때문에 float으로 자동형 변환이 되지 않아 에러 발생
		float num4 = (float)1.23;
//		float num5

	}

}
