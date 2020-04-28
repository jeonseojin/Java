package day8;

public class RecursiveEx2 {

	public static void main(String[] args) {
		int num = 5 ;
		int res = 1 ;
		for(int i =1; i<=num;i++) {
			res *=i;// 다른표현으론 res = res * i;로 사용가능
		}
		if(num <0)
			System.out.println(0);
		else {
			System.out.println(res);
		}

	}

}
