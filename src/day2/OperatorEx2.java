package day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1/2);//정수/정수=정수
		System.out.println(1.0/2);//실수/정수=실수
		//자료형변환을 이용하여 정수/정수를 실수/정수로 변환
		int num1=1, num2=2;
		System.out.println((double) num1/num2);
		//System.out.println(3/0);//에러 발생
		System.out.println(3/0.0);
		char ch1 = 'A';
		char ch2 = 'A'+1;
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);//int(4)형으로 결과가 나오기 때문에 char(2)형으로 변환해줘야한다
		System.out.println(ch3);
		
	}

}
