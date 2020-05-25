package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DteEx2 {
/* p.545 잘씀 날짜 & 시간
 * 날짜를 내가 지정한 형태의 문자열로 변환하는 코드
 * 2020년 0월 25일
 * 2020-05-25		 */
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");//소문자 m은 시간의 분을 의미
		System.out.println(format.format(today));
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss.SSS");
// HH : 0~23 단위 hh : 1~12 단위로 시간표현
		System.out.println(format.format(today));
	}

}
