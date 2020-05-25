package day23;

import java.util.Scanner;

public class EnumsEx1 {

	public static void main(String[] args) {
/* p.691 열거형 : 서로 관련된 상수를 편리하게 선언하기 위한 것	
 * 열거형.values() : 열거형에 있는 모든값들 각각을 하나의 열거형으로 만들어서 배열을 생성
 * 열거형.valueOf : 문자열을 열겨형으로 만듬	*/ 
		Type t = null;
		Scanner scan = new Scanner(System.in);
		String type;

		do {
			int cnt = 1;
			System.out.println("분류 리스트");
			System.out.println("┌───────────────────");
			for(Type tmp : Type.values()) {
				System.out.println("│"+cnt++ + ". "+ tmp);
			}
			System.out.println("└───────────────────");
			System.out.print("분류를 입력하세요 : ");
			type= scan.next();
				
			for(Type tmp : Type.values()) {
				if(tmp.toString().equals(type)){
					t = Type.valueOf(type);
		  		}
			}
		}while(t == null);
//입력된 항목
		System.out.println(t);
		scan.close(); 
	}

}
enum Type{
	통신비, 식비, 교통비, 월세,주거비
}