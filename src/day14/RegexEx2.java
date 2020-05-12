package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
	public static void main(String[] args) {
		/* 아이디를 입력받고 아이디가 유효한 아이디인지 검사하는 코드를 작성하세요
		 * 단, 정규표현식을 이용해야한다.
		 * 아이디의 조건
		 * 1. 알파벳 +숫자
		 * 2. 첫글자는 알파벳
		 * 3. 5글자이상 10글자 이하
		 * 예)
		 * 아이디를 입력하세요 : 1abcde
		 * 1abcde는 유효하지 않은 아이디입니다.
		 * 예)
		 * 아이디를 입력하세요 : abcde1
		 * abcde1은 유효한 아이디입니다.
		 * 
		 */
		String ch ;
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		ch = scan.next();
		Pattern p = Pattern.compile("[a-zA-Z]\\w{4,9}");
		//가로안에 "^[a-zA-Z]\\w{4,10}&"를입력해도 동일하게 사용가능
				// ^는 문자처음에 올경우 뒤에 입력한 값으로 문장이 시작
		Matcher m = p.matcher(ch);
		if(!m.matches()) {
			System.out.println(ch+"는(은) 유효하지 않은 아이디입니다.");return;
		}else {
			System.out.println(ch+"는(은) 유효한 아이디입니다.");
		}
		scan.close();
	}
}
