package day6;

public class testEx1 {

	public static void main(String[] args) {
		/* a		0		*
		 * ab		01		**
		 * abc		012		***
		 * abcd		0123	****
		 * abcde	01234	*****
		 * 로 출력하는방법(쉬운예와 해봤던예)
		 */
		//왼쪽으로 붙는 별 예제
		int num=5;
		 for(int i = 1; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* for(int j=0; j<=i; j++)가 의미 하는것이
		 * 0
		 * 01
		 * 012
		 * 0123
		 * 01234
		 * 이기 때문에 System.out.print(j);를 할 경우 위와 같이 나온다
		 */
		 for(int i = 0 ; i<5 ; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		 /* char ch = 'a'+1;라는 문자값을 주고
		  * a
		  * ab
		  * abc
		  * abcd
		  * abcde
		  * 의 형태로 출력하기 위해서는 System.out.print((char)('a'+j));
		  * 를 입력해야한다.
		  */
		 for(int i = 0 ; i<5 ; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print((char)('a'+j));
				}
				System.out.println();
			}
		 /* 문자 상수 a + 상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에
		  * 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다
		  */
		 char ch = 'a'+1;
		 /* ch = (char)(ch + 1);//
		  
		  * 문자 변수 ch + 상수를 하면 문자 변수 ch가 정수형 int로 형변환되어 더해지기 때문에
		  * 결과가 정수가 된다.
		  
		  */
		 
		 System.out.println((char)(ch+1)); //출력할경우 c가 나온다
		 
		
	}

}
