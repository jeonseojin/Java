package day18;

import java.util.*;

public class TestEx2 {

	public static void main(String[] args) {
/* 1. 성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하세요.
 * 		A : 90이상 100이하
 * 		B : 80이상 90미만
 * 		c : 70이상 80미만
 * 		D : 60이상 70미만
 * 		F : 0이상 60미만
 * 
 * 2. 1번에서 작성한 내용을 메소드로 만드세요.
 * 
 * 3. 영어 사전을 프로그램을 만들려고 한다. 이때 단어를 저장할 수 있는 클래스를 생성해 보시오.(기능구현 x)
 * 
 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num =scan.nextInt();
		String grade = grade(num);
		if(grade.equals("X")) {System.out.println("올바른 점수가 아닙니다.");		}
		else {	System.out.println(grade(num)+"학점입니다.");		}
		try {
		System.out.println(grade2(num)+"학점입니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//ABC(num);	
/*		if(90<=num && 100>=num) { 	System.out.println("A학점");	}
		else if(80<=num && 90>num) { System.out.println("B학점"); }
		else if(70<=num && 80>num) {System.out.println("C학점"); }
		else if(60<=num && 70>num) {System.out.println("D학점"); }
		else if(0<=num && 60>num) {System.out.println("F학점"); }
		else {System.out.println("??");	} 	*/
		
		
	}

/*	public static void ABC(int num) {
		if(90<=num && 100>=num) { 	System.out.println("A학점");	}
		else if(80<=num && 90>num) { System.out.println("B학점"); }
		else if(70<=num && 80>num) { System.out.println("C학점"); }
		else if(60<=num && 70>num) { System.out.println("D학점"); }
		else if(0<=num && 60>num) { System.out.println("F학점"); }
		else {System.out.println("??");	}
	}	*/
/* 기능 : 성적을 입력받아 입력받은 점수가 어떤 학점인지 확인하는 메소드
 * 	사용가능한 기능 설명
 * 		* 정수 성적이 주어지면 성적에 맞는 학점을 알려주는 메소드
 * 		매개변수 : 정수 성적 => int score
 * 		리턴타입 : 학점(추루 +를 추가할 수도 있기 때문에) => String
 * 		메소드명 : grade
 * 		* 점수를 입력받아입력받은 성적에 맞는 학점을 알려주는 메소드
 * 		* 점수를 입력받아 입력받은 성적에 맞는 학점을 출력하는 메소드
 * 
 * 매개변수 : 입력받은 점수 int num
 * 리턴타입 : 성적 int
 * 메소드명 : ABC */
	/**
	 * @param score : 정수성적
	 * @return : 성적에 맞는 학점으로 A,B, C, D, F학점과 올바르지 않ㅇ를때의 학점 X를 반환
	 */
	public static String grade(int score) {
		if(score < 0 || score > 100) return "X";//잘못입력될 값을 알고 있을 경우에 사용
		if(score >=90) return "A";
		if(score >=80) return "B";
		if(score >=70) return "C";
		if(score >=60) return "D";
		return "F";
	}
	public static String grade2(int score) {
		if(score < 0 || score > 100) throw new ArithmeticException("올바른 점수가 아닙니다.");//올바르지않은 경우를 몰라도 됨
		if(score >=90) return "A";
		if(score >=80) return "B";
		if(score >=70) return "C";
		if(score >=60) return "D";
		return "F";
	}

}

