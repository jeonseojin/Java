package day14;

import java.util.Scanner;

public class TestEx2 {


		/* 문제2
		 * 주민등록번호를 입력하여 남자인지 여자인지 판별하세요.
		 * 예)
		 * 주민번호를 입력하세요 : 021001-3000110
		 * 해당 주민번호는 남성입니다.
		 */			
				
// 내생각			String str =  "021001-3000110";
//				String reg[] = str.split("-");
//				for(String tmp : reg) {
//					if()
//					System.out.println(tmp);
//				}
							
	public static void main(String[] args) {
		String registerNum;
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		registerNum = scan.nextLine();
		registerNum = registerNum.replaceAll("-", "");//-를 제거
		registerNum = registerNum.replaceAll(" ", "");//공백제거
		if(registerNum.length() != 13) {
			System.out.println("주민번호 길이가 잘못되었습니다.");
			scan.close();
			return;
		}
		if(! isValid(registerNum.substring(0, 6))) {
			System.out.println("유효하지 않은 생년월일입니다.");
			scan.close();
			return;
		}
		char gender = registerNum.charAt(6);
/*	if(gender==1|| gender ==3) {
	System.out.println("해당 주민번호는 남자입니다.");
	}else if(gender==2||gender ==4) {
			System.out.println("해당 주민번호는 여성입니다.");
	}else {
	System.out.println("해당 주민번호는 외국인입니다.");
	}
*/
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
/*substring은 마지막번지 앞까지를 의미함*/
		String sYear = birth.substring(0, 2);
/*0번지에서 2번지 앞까지 부분문자열 생성 -> 0~1번지까지 부분문자열을 의미*/
		String sMonth = birth.substring(2, 4);
/*0번지에서 2번지 앞까지 부분문자열 생성 -> 0~1번지까지 부분문자열을 의미*/
		String sDay = birth.substring(4, 6);/*문자열 중에서설정*/
/*0번지에서 2번지 앞까지 부분문자열 생성 -> 0~1번지까지 부분문자열을 의미*/
		int year, day, month;
		try {
			 year = Integer.parseInt(sYear);
		 day = Integer.parseInt(sDay);
		 month = Integer.parseInt(sMonth);
		}catch(Exception e ) {
			return false;
		}
		
		int lastDay = 31;
		//if(month<1||month>12) return false;
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
