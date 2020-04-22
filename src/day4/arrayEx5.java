package day4;

public class arrayEx5 {

	public static void main(String[] args) {
		/* 배열의 내용을 정렬하는 예제. 
		 */
		int arr[] = new int[10];
		//정수 10개 짜리 배열.
		int rMin = 1;
		int rMax = 100;

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1)) + rMin;
		}
		for(int tmp : arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
		// 83  20  24   9  65  68   8  82  88   2 
		// 맨 오른쪽에 제일 큰 수부터 정렬되도록 만들어보는 식
		// 20 24 9 65 68 8 82 83 2 88 <1회 실행한 경우 옆의 형태로 이루어진다 

		for(int i=0; i<arr.length-1; i++) {// 9 번만 확인하면 10자리 다 지정되서 -1이 붙는다.
			for(int j=0; j<arr.length-1-i; j++) {// 위에 i랑은 다른 개념
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int tmp : arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();

		}

	}