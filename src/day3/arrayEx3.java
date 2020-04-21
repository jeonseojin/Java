package day3;

public class arrayEx3 {

	public static void main(String[] args) {
		// 연습
		
		char[] asd= {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1','2','3','4','5','6','7','8','9'};
		System.out.println(asd);
		System.out.println(num);
		//배열 asd와 num을 붙여서 하나의 배열 (result)로 만든다.
		char[] result =new char[asd.length+num.length];//ABCD
		System.arraycopy(asd, 0, result, 0, asd.length);//0123456789
		System.arraycopy(num, 0, result, asd.length, num.length);//ABCD0123456789
		System.out.println(result);
		//배열 asd을 num의 첫 번째 위치부터 배열 asd의 길이만큼 복사
		System.arraycopy(asd, 0, num, 0, asd.length);//ABCD456789
		System.out.println(num);
		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(asd, 0, num, 6, 3);//ABCD45ABC9
		System.out.println(num);
		
		System.arraycopy(asd, 0, num, 5, 4);//ABCD4ABCD9
		System.out.println(num);
		
		
	}

}
