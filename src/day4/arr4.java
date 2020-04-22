package day4;

public class arr4 {

	public static void main(String[] args) {
		// 향상된 for문 예제
		int [] arr = new int[] {1,3,5,7,2,4,6,8};
		/* 향상된 for문을 주로 사용하는 경우
		 * 1. 배열의 모든 값을 탐색하는 경우
		 * 2. 배열의 값을 수정하지 않는 경우 
		 */
		for(int tmp : arr) { //자료형은 동일하게 맞춰주어야한다
			System.out.println(tmp);
		} 
		
		for(int tmp : arr) { 
			System.out.print(tmp+ " ");
		}//배열의 값을 표현하고자 할 경우(print를 사용한 이유는 옆으로 나란히 출력하기 위함)
		
		
		/* 아래의 형태처럼은 대부분 사용하지않는다.
		int i=0;
		for(int tmp : arr) {
			System.out.println(tmp);
			i++;
		}
		*/
	}

}
