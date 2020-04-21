package day3;

import java.util.Scanner;

public class dowhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		 do{
			System.out.println("1. 김치 볶음밥");
			System.out.println("2. 새우 볶음밥");
			System.out.println("3. 알밥");
			System.out.println("4. 샌드위치");
			System.out.println("메뉴를 입력하세요:");
			menu=scan.nextInt();
		 }while(menu !=4);
		scan.close();
		
		
		
		
		

	}

}
