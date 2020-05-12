package day14;

import java.util.Objects;

public class ObjectsEx1 {

	public static void main(String[] args) {
		String str=null;
		System.out.println("객체 str은 null입니까?"+Objects.isNull(str));
		System.out.println("객체 str은 null이 아닙니까?"+!Objects.isNull(str));
		System.out.println("객체 str은 null이 아닙니까?"+Objects.nonNull(str));//!Objects.isNull과 같은 의미로 null이 아닌지 묻는 것은 동일
		String str2 ="";
		//System.out.println(str.equals(str2));			예외 발생 -> str을 기준으로 불러오는데 값이 null값이기에 없는것으로 equals에서는 객체가 필요하기에 에러발생
		System.out.println(Objects.equals(str, str2));//class메소드 이기때문에 값이 null이되어도 상관없다.
	
	
	
	
	}

}
