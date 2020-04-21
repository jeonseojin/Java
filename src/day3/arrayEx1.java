package day3;

import java.util.Scanner;

public class arrayEx1 {

	public static void main(String[] args) {
		/* 배열이 없으면 아래와 같이 5개의 정보를 입력받아 저장하려면 5개의 변수를 선언하고
		 * Scanner를 통해 5번 직접 입력받는 코드를 작성해야한다.
		 * 하지만 배열을 이용하면 효율적으로 입력받는 코드를 작성할 수 있다.
		 */
//		int n1, n2, n3, n4, n5;
//		
//		n1 = scan.nextInt();
//		n2 = scan.nextInt();
//		n3 = scan.nextInt();
//		n4 = scan.nextInt();
//		n5 = scan.nextInt();
		//변수명이 다르기 때문에 반복문을 만들어서 사용할 수 없다.
		//그렇기 때문에 배열을 사용한다.
		Scanner scan = new Scanner(System.in);
		
		int [] arr1, arr2; //arr1와 arr2는 둘다 배열
		int arr3[], arr4;  //arr3는 배열, arr4는 일반 변수
		arr1 = new int [5];//배열의 생성
		int []arr5 = new int[5];//배열선언과 동시에 생성
		//arr1[0]=1;
		//arr1[2]=3; ex) 이런식으로도 사용가능하다.
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = scan.nextInt();
			
		}
		for(int i=0; i <arr1.length;i++) {
			System.out.println(arr1[i]);
			
		}
		/*
		for(int i=0; i <=arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		<=의 표현은 arr1에 주어진 값보다 더 큰값임으로 실행될 수 없다. 
		*/
		scan.close();
	}

}
