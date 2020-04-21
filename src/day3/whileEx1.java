package day3;

import java.util.Scanner;

public class whileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while에서  무한루프예제
		/*
		while(true) {
			System.out.println("hi");
		}
		 */
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		while(menu !=4) {
			System.out.println("1. 김치 볶음밥");
			System.out.println("2. 새우 볶음밥");
			System.out.println("3. 알밥");
			System.out.println("4. 샌드위치");
			System.out.println("메뉴를 입력하세요:");
			menu=scan.nextInt();
					
			}
		scan.close();
		
		}

}
