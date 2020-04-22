package day4;

public class test2 {

	public static void main(String[] args) {
		/*1. 정수 10개를 저장할 수 있는 배열을 선언하고 생성하세요.
		 *2. 1부터 10까지 차례대로 배열에 저장하세요. ( 반복문을 이용하여 0번지에는 1, 1번지에는 2, ... 9번지에는 10을 저장하도록 한다.)
		 *3. 저장된 배열의 값을 출력하세요.
		 *4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요.
		 *	=> 반복문 안에서 조건문 사용, 작성 방법에 따라 continue를 사용 할 수 있다.
		 *5. 저장된 배열의 값을 다시 출력하세요.
		 *
		 *최종적으로 출력되는것은 배열의 값임.
		 */

//1. 정수 10개를 저장할 수 있는 배열을 선언하고 생성하세요.
		int[]arr = new int[10]; 
//2. 1부터 10까지 차례대로 배열에 저장하세요.
		for(int i=0; i<arr.length; i++) {// i는 0번지부터 9번지까지 1씩 증가
			arr[i] = i + 1; // 2.
		}// 밑줄에 출력하는것은 0번지부터 9번지까지 배열의 값을 출력하는 내용.
		//for(i는 0번지부터 9번지까지1씩 증가)
//4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요.
//	=> 반복문 안에서 조건문 사용, 작성 방법에 따라 continue를 사용 할 수 있다.
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%2d ",arr[i]); // 3.
		}
		System.out.println();

		for(int i=0; i<arr.length; i+=2) {
			arr[i] = arr[i] * 2;
			//arr[i] *= 2; // 4.
		}
//5. 저장된 배열의 값을 다시 출력하세요. tmp: 는 덮어씌우는 의미를 갖고있다.
		for(int tmp: arr) {
			System.out.printf("%2d ",tmp);
		}
		System.out.println(); // 5.




	}

}