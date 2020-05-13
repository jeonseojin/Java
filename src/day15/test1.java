package day15;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in); 
		while(true) {
		System.out.print("오늘의 할일을 추가하시겠습니까?(y/n) : ");
		char ch = scan.next().charAt(0);
		scan.nextLine();
		if(ch =='y'||ch =='Y') {
			System.out.print("오늘의 할일을 입력하세요 : ");
			String toDo = scan.nextLine();
			list.add(toDo);
		}else if(ch =='n'|| ch =='N') {
			System.out.println("오늘의 할일");
			for(int i=0;i<list.size();i++) {
				System.out.println(i+1+". "+list.get(i));
			}
			break;
		}

	}System.out.println("프로그램을 종료합니다.");
	scan.close();
	}
	}
