package day23;
import java.util.*;
public class DateEx1 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2020, Calendar.MAY, 5);
/* 달은 0~11까지 입력하기 떄문에 5월을 입력하려면 4로 입력하거나 Calendar.MAY를 입력
 * Calenda.MAY는 상수 4를 의미한다.
 * Calenda.MAY가 아닌경우 -1을 하여 수를 입력해야한다.*/
		System.out.println(date.get(Calendar.YEAR)+"-"
						 + (date.get(Calendar.MONTH)+1)+"-"
						 + date.get(Calendar.DATE));
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);
//date.add(5, -14);
		System.out.println(toString(date));
		date.add(Calendar.DATE, 14);
		System.out.println(toString(date));
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
	
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"-"+
				 ((date.get(Calendar.MONTH)+1)<10?"0":"") 
				 +(date.get(Calendar.MONTH)+1)+ "-"
				 + ((date.get(Calendar.DATE))<10?"0":"") 
				 + date.get(Calendar.DATE);
	}
	

}
