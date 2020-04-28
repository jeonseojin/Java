package day8;

public class RecursiveEx1 {

	public static void main(String[] args) {

		System.out.println(fact(5));
	}
//팩토리얼 메서드
	public static int fact(int num) {
		if(num==1||num==0)
			return 1;
		if(num<0) //음수일경우
			return 0;		//위의 조건은 끝내기위한 코드
		return num*fact(num-1);
	}
}
/*  위에서 재귀호출하고자 하는 코드의 프로그램이 종료 될때까지 실행순서를 표현한 것
	5 7 
 	10(num=5) 11 13 15(f4호출) (num=4일때 팩토리얼 호출)
	10(num=4) 11 13 15(f3호출) (num=3일때 팩토리얼 호출)
	10(num=3) 11 13 15(f2호출) (num=2일때 팩토리얼 호출)
	10(num=2) 11 13 15(f1호출) (num=1일때 팩토리얼 호출)
	10(num=1) 11 12 (return 1;을 통해서 f1을 빠져나감)
	15(f1에서 빠져나와 f2의 15줄을 실행하는데 이때 f2를 빠져나감) (1팩토리얼 메서드를 빠져 나와 2팩토리얼의 리턴으로 이동,num=2)
	15(f2에서 빠져나와 f3의 15줄을 실행하는데 이때 f3를 빠져나감) (2팩토리얼 메서드를 빠져 나와 3팩토리얼의 리턴으로 이동,num=3)
	15(f3에서 빠져나와 f4의 15줄을 실행하는데 이때 f4를 빠져나감) (3팩토리얼 메서드를 빠져 나와 4팩토리얼의 리턴으로 이동,num=4)
	15(f4에서 빠져나와 f5의 15줄을 실행하는데 이때 f5를 빠져나감) (4팩토리얼 메서드를 빠져 나와 5팩토리얼의 리턴으로 이동,num=5)
	7 (5팩토리얼의 값이 계산되어 나옴)
	8 
 */