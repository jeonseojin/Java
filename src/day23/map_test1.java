package day23;

import java.util.*;

public class map_test1 {

	public static void main(String[] args) {
/* 카페 등급을 프로톤에서 요청을 하면 서버에서 해당 카페 등급에 맞는 카페 리스트와
 * 카페 등급을 프론트로 보내려한다. 
 * 이 때 카페 등급 : 정수이고, 카페 이름은 String이고, 카페 리스트는 List<String>이다.
 * 		*/
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cafeGrede", new Integer(1));//카페등급이 1등급
		List<String> list = new ArrayList<String>();
		list.add("네이버 카페1");
		list.add("네이버 카페2");
		map.put("cafeList", list);
		
	}

}
