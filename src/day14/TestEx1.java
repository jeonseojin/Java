package day14;

import java.util.Scanner;

public class TestEx1 {
/*문자열 메소드를 활용할 수 있는지*/
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
		String title, word; // = "Java의 정석";
		
	while(true) {
		System.out.print("제목을 입력하세요 : ");
		title = scan.nextLine();// 공백을 포함한 단어를 의미 
		/* 반복문의 다음 제목으로 엔터가 자동으로 들어가서 
		 * 아래와 같은 결과가 나온다.
		제목을 입력하세요 : java의 정석
		단어를 입력하세요 : java
		java의 정석에는 java라는 단어가 있습니다.
		java의 정석에는 java라는 단어가 있습니다.
		제목을 입력하세요 : 단어를 입력하세요 : 
		
		 * 반복문의 마지막 단에 scan.nextLine();을 입력하게 되면 
		제목을 입력하세요 : java의 정석
		단어를 입력하세요 : jaca
		java의 정석에는 jaca라는 단어가 없습니다.
		java의 정석에는 jaca라는 단어가 없습니다.
		제목을 입력하세요 : 
		
		 * 의 결과가 나온다.
		*/
		if(title.equals("exit")) {
			System.out.println("프로그램이 종료됩니다.");
		}
		System.out.print("단어를 입력하세요 : ");
		word = scan.next();//입력받을 단어
/*title에 해당하는 단어 찾기*/
		if(!title.contains(word)) {//기준이 제목이라서 title로 작성하고 포함하는 것을 찾으면 되기에 contains를 사용하여 word를 넣음
			
			System.out.println(title+"에는 "+word+"라는 단어가 없습니다.");
		}else{
			System.out.println(title+"에는 "+word+"라는 단어가 있습니다.");
		}
		
		if( title.indexOf(word)== -1) {
//기준이 제목이라서 title로 작성하고 위의 값과 같은 결과를 낼수 있는 indexOf를 사용하여 코드 작성
			
			System.out.println(title+"에는 "+word+"라는 단어가 없습니다.");
		}else{
			System.out.println(title+"에는 "+word+"라는 단어가 있습니다.");
		} scan.nextLine();
	}
		}


		
	}



