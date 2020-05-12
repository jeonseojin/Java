package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		String registerNum;
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		registerNum = scan.nextLine();
/* 입력받는 것은 Test2와 동일하고 팬턴을 만들어 정규표현식을 팬턴으로 만들어서 사용*/
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
						/* registerNum = registerNum.replaceAll("-", "");//-를 제거
						 * registerNum = registerNum.replaceAll(" ", "");//공백제거 필요가 없음*/
		Matcher m = p.matcher(registerNum);
		if(!m.matches()) {//if(!p.matcher(registerNum);.matches()) {
			System.out.println("올바른 주민번호 형태가 아닙니다.");
			return;
		}

		if(! isValid(registerNum.substring(0, 6))) {
			System.out.println("유효하지 않은 생년월일입니다.");
			scan.close();
			return;
		}
		char gender;
		if(registerNum.contains("-")) gender = registerNum.charAt(7);
		else	gender = registerNum.charAt(6);

		switch(gender) {
		case '1': case '3': case '9':
			System.out.println("해당 주민번호는 남성입니다.");break;
		case '2': case '4': case '0':
			System.out.println("해당 주민번호는 여성입니다.");break;
		case '5': case '7': 
			System.out.println("해당 주민번호는 외국인 남성입니다.");break;
		case '6': case '8': 
			System.out.println("해당 주민번호는 외국인 여성입니다.");break;
		}
	}
	public static boolean isValid(String birth) {
		if(birth == null || birth.length() != 6) return false;
		String sYear = birth.substring(0, 2);
		String sMonth = birth.substring(2, 4);
		String sDay = birth.substring(4, 6);/*문자열 중에서설정*/

		int year, day, month;
		try {
			 year = Integer.parseInt(sYear);
		 day = Integer.parseInt(sDay);
		 month = Integer.parseInt(sMonth);
		}catch(Exception e ) {
			return false;
		}
		
		int lastDay = 31;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay =31; break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;break;
		case 2:
			lastDay = 28;break;
			default: return false;
		}
		if(day<1 ||day>lastDay) return false;
		return true;
	}

}
