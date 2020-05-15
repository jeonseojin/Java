package day16;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();//<>가 필요한 클래스를 재널이 클래스를 의미한다. 2문자열을 저정하는 것
		map.put("abcde", "1234");
		map.put("abcde", "12345");
		map.put("abcdef", "1234");
		
		Set set =map.entrySet();
		Iterator it = set.iterator();
/* Set<Map.Entry클래스명<String, String재너리>>
 * Iterator<Map.Entry<String, String>>   <>안의 내용이 생략된 것
 * Entry라는 클래스를 생성하고 Object Key; Object Value;를 같고 있는 것
 * 인터레이터를 사용하기위해서  Set으로 변경 
 */
		while(it.hasNext()) {
			
			
			Map.Entry e =(Map.Entry)it.next();
			System.out.println("ID : "+e.getKey());
			System.out.println("PW : "+e.getValue());
			System.out.println("---------------------");
		}
		Set keySet = map.keySet();
		Collection ValueSet = map.values();//중복을 허용하기에 collection으로 설정
		
	}

}
