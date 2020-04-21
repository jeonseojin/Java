package day3;

public class ForEx8 {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			System.out.println("Hi");
			//break; 를 사용하면 Hi를 5번 반복하지 않고 1번만 출력하게 된다. 
		}
		for(int i=1; i<=5;i++) {
			System.out.println("Go");
			if(i==3) {
				break;//if문을 함게 사용할 경우 조건과 함께 사용하였기 때문에 조건을 만족하여 break의 기능을 한다.
			}
		}
		for(int i=1; i<=10;i++) {
			// continue; 이 위치에 있을 경우 아래의 명령이 실행되지않는다.
			if (i%2==1) {//짝수를 의미하는공식
				continue;
						}
			System.out.println(i);
//			for(;;) {
//				for(;;) {
//					if() {
//						break;//기본 발생 지점은 B이며 이름을 붙여서 사용할 경우 그 반복문을 빠져나갈수있다.
//						}
//						}//B
//					}//A
//				}
		}
	}
}
