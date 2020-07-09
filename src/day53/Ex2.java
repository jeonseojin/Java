package day53;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 성적을 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요
		// A+: =100~95 A: 94~90 B+: 89~85 B: 84~80......D+:69~65 D:64~60 F:0~59
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
//		if(score>=95) {
//			System.out.println("A+");
//		}else if(score>=90) {
//			System.out.println("A");
//		}else if(score>=85) {
//			System.out.println("B+");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if(score>=75) {
//			System.out.println("C+");
//		}else if(score>=70) {
//			System.out.println("c");
//		}else if(score>=65) {
//			System.out.println("D+");
//		}else if(score>=60) {
//			System.out.println("D");
//		}else if(score>60) {
//			System.out.println("F");
//		}
//		else {
//			System.out.println("잘못된 성적입니다.");
//		}
		if(score>=90 && score==100) {
			if(score>=94) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		}
	}

}
