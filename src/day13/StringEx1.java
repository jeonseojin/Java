package day13;

public class StringEx1 {

	public static void main(String[] args) {
		/* str1과 str2는 둘다 abc라는 문자열 리터럴을 저장하기 떄문에 같은 주소를 가진다.
		 * (문자열 리터럴은 재사용을 하기 떄문에 가능)
		 * str2에 abc를 저장하기 전에 리터럴을 저장하는 메모리에 abc가 있는지 확인하여
		 * 있으면 재사용한다. 그래서 str1에서 사용된 abc를 재사용하여 str1과 str2의 주소는 같다.
		 */
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);
		String str3= new String("abc");
		String str4= new String("abc");//468p하단
		System.out.println(str3.equals(str4));//문자를 비교하기 위해서는 equals를 사용하여 값이 같은지를 비교할 수 있다.
		System.out.println(str3==str4);//저장되는 값이 같아도 서로 다른 주소에 저장되기에 다르다고 나온다.
		System.out.println("위의 false는 intern을 하기전 아래의 true 사용 후의 결과");
		str3= str3.intern();
		str4= str4.intern();//intern은 이미 있는 문자열이 있으면 가지고 있는 주소를 가져오것
		System.out.println(str3==str4);
		
		char []arr = new char[] {'a','b','c'};
		String str5 = new String(arr);//469p상당
		System.out.println(str5.charAt(1/*0,1,2 번지중의 1번지임으로 b가 출력됨*/));
		String str6 = "abcdabcd";
		String str7 = str6.replace("abc", "def");
		System.out.println(str6);
		System.out.println(str7);
		String str8 = str6.replaceAll("abc", "def");/*위의 replace와 같은 동일하지만 정규표현식이다*/
		System.out.println(str6);
		System.out.println(str8);
		String str9 = "200101-3011111";
		String reg[] = str9.split("-");
		for(String tmp : reg) {
			System.out.println(tmp);//-를 기준으로 나누어서 저장됨
		}
		String str10 = "사과,배,오렌지";
		reg = str10.split(",");//reg의 0=사과,1=배,2=오렌지 가 저장되있음
		for(String tmp : reg) {	System.out.println(tmp);}
		System.out.println(str10.substring(0));
		System.out.println(str10.substring(1));
		//reg 배열에 저장된 각 문자열을 구분자 -를 기준으로 하나의  문자열로 만들어 준다.
		String str11 = String.join("-",reg);
		System.out.println(str11);
	}

}
