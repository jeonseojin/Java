package day3;

public class forEx5 {

	public static void main(String[] args) {
		int i;
		/* 우리가 실수하기 쉬운 부분
		 * 의도적인 무한루프 코드
		 * 
		for(,,) {
		for(; ; ) {  // () 의 끝에 ;을 입력할 경우 실행문을 진행하지 않기때문에 결과가 달라진다
			System.out.println("hello");
		} // }의 갯수
		 * 반복문에서 발생할 수 있는 
		 */
		//int sum=0;
		
		/*for( i=1; i<=5; sum++) {
			System.out.println("ME");
		}
		*/
		/*i가 계속 감소하여 언더플로우로 인해 정수 최대값이 되는 순간까지 반복
		 * for(i=1;i<=5;i--) {
			System.out.println("You");
		}
		*/
		for(i=10;i<=5;i++) {
			System.out.println("No");
			
		}
		//변수는 선언한 위치부터 변수가 선언되{}안에서 유효하다
		//j는 for문의 초기화 위치에서 선언되었기 때문에 반복문 안에서 유효하다
		for(int j=1; j<=5; j++){
			System.out.println(j);
			char ch = 'A';
			System.out.println((char)(ch+j));
		}
		//System.out.println(j);
		//에러발생, j의 사용범위 밖에서 j를 사용했기 때문에
		
	
	}
}
