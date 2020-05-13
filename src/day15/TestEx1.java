package day15;

import java.util.*;


public class TestEx1 {

	public static void main(String[] args) {
/* 오늘의 할일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요.
	예)
	오늘의 할일을 추가하시겠습니까?(y/n) : y
	오늘의 할일을 입력하세요 : 수업
	오늘의 할일을 추가하시겠습니까?(y/n) : y
	오늘의 할일을 입력하세요 : 점심
	오늘의 할일을 추가하시겠습니까?(y/n) : y
	오늘의 할일을 입력하세요 : 집가기
	오늘의 할일을 추가하시겠습니까?(y/n) : n
	오늘의 할일
	1. 수업
	2. 점심
	프로그램을 종료합니다.
*/
		ArrayList<Today> today = new ArrayList<Today>();
		Scanner scan = new Scanner(System.in);
		printToday(today);
	}
	public static void printToday(List<Today> today) {
/**/
		Scanner scan = new Scanner(System.in); 
		while(true) {
			System.out.print("오늘의 할일을 추가하시겠습니까?(y/n) : ");
			char ch = scan.next().charAt(0);
			scan.nextLine();
			if(ch =='y'||ch =='Y') {
				System.out.print("오늘의 할일을 입력하세요 : ");
				String toDo = scan.nextLine();
			//	today.add(toDo);
			}else if(ch =='n'|| ch =='N') {
				System.out.println("오늘의 할일");
				for(int i=0;i<today.size();i++) {
					System.out.println(i+1+". "+today.get(i));
				}
				break;
			}

		}System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	}

class Today{
	String w;
	public Today() {}
	public Today(String w) { this.w=w;	}
	
	@Override
	public String toString() {	return "today [w=" + w + "]";	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((w == null) ? 0 : w.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)		return true;
		if (obj == null)		return false;
		if (getClass() != obj.getClass())		return false;
		Today other = (Today) obj;
		if (w == null) {
			if (other.w != null)			return false;
		} else if (!w.equals(other.w))		return false;
		return true;
	}

	
	
}