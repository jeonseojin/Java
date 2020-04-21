package day1;

public class Excasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*정수형 변수 num에 실 수 1.23을 저장하면 0.23이 사라지기 때문에
		 * 이를 해결하기 위해 명시적 자료형변환을 이용하여 1.23을
		 * 1로 바꾸어 저장
		 */
		int num = (int)1.23;
		/* 실수형 변수 dnum에 정수 1을 저장하면 자동자료형변환으로
		 * 인해 1.00으로 저장된다.
		 */
		double dnum = 1;
		float fnum = 1.23f;
		//float fnum = 1.23f;
		/* 자동 자료형 변환이 되는 경우
		 * 정수 -> 실수
		 * byte가 작은 것 > 큰 것
		 * float > double
		 * byte > short(char) > int > long
		 */
		

	}

}
