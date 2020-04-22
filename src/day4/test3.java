package day4;

public class test3 {
	public static void main(String[] args) {
		/* 정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장하고 (중복o)\
		 * 저장된 배열 값 중에서 가장 큰 값과 가장 작은 값을 출력하는 코드를 작성하세요.
		 * 
		 * 
		 */
//정수 10개 짜리 배열을 생성
		int arr[] = new int[10];
		int rMin = 1;
		int rMax = 100;
		int min, max;
//랜덤 생성하는 코드 생성
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1)) + rMin;
		}
//값을 저장하여 출력
		for(int tmp : arr) {
			System.out.printf("%d ",tmp);
		}
		System.out.println();
//저장된 배열 값 중에서 가장 큰 값과 작은값을 출력하는 코드 생성
		min = max = arr[0];
		for(int i = 1; i<arr.length; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
//결과를 출력하는 코드 생성
		System.out.printf("배열의 최대값 : %d, 최소값 : %d\n",max,min);




	}

}