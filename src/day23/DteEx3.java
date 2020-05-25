package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DteEx3 {
/* 문자열을 Date로 변환하는 코드	 */
	public static void main(String[] args) {
		String strDate = "2020-05-25 15:24:10";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date date = format.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
