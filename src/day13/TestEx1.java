package day13;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
/* 문제1
 * 제목을 입력하고 단어를 입력 후  해당 단어가 제목에 있는지 확인하는 코드를 작성하세요
 * 예1)
 * 제목을 입력하세요 : Java의 정석
 * 단어를 입력하세요 : java
 * Java의 정석에는 java라는 단어가 없습니다.
 * 예2)
 * 제목을 입력하세요 : Java의 정석
 * 단어를 입력하세요 : Java
 * Java의 정석에는 Java라는 단어가 있습니다.
 */
		Scanner scan= new Scanner(System.in);
		String book = "Java의 정석";
		
		while(true) {
			String a=scan.next();
			if(book.equals(book)) {
		System.out.printf("Java의 정석에는 %s라는 단어가 있습니다.\n",a); break;
		}else {
			System.out.printf("Java의 정석에는 %s라는 단어가 없습니다.\n",a);break;
		}
		}
			
		}

/* 문제2
 * 주민등록번호를 입력하여 남자인지 여자인지 판별하세요.
 * 예)
 * 주민번호를 입력하세요 : 021001-3000110
 * 해당 주민번호는 남성입니다.
 */			
		
//		String str =  "021001-3000110";
//		String reg[] = str.split("-");
//		for(String tmp : reg) {
//			if()
//			System.out.println(tmp);
//		}
		
		
		
		
	}



