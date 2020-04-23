package day5;

public class MethodEx1 {

	public static void main(String[] args) {
		// 메인의 매개변수이며 args 스트링의 변수명 문자열이 여러개 들어올수있다는 표현(교제 212p)
		int res = sum(1,2); //문법이 맞을경우 sum(1, 2);에 합만 입력해도 가능하다
//		char res2 = 3;에러발생
//		int num1 = 1, num2 = 2;
//		char ch = 1 + 2 ;
//		ch = num1 + num2;

		System.out.print("두 정수의 합을 알려주는 메서드 : ");
		System.out.println(res);
		System.out.print("두 정수의 합을 알려주는 메서드 : ");
		System.out.println(1+2);
		System.out.print("두 정수의 최대 공약수를 알려주는 메서드 : ");
		System.out.println(gcd(10,15));
		System.out.print("두 정수의 최대 공약수를 알려주는 메서드 : ");
		gcd2(10,15);
		System.out.print("두 정수의 최소 공배수를 알려주는 메서드 : ");
		System.out.println(lcm(10,15));
		System.out.print("정수가 소수인지 아닌지 판별하는 메소드 : ");
		if(isPrime(11)) {
			System.out.println("11은 소수");
		}else {
			System.out.println("11은 소수가 아님");
		}
		/*main이 실행되면 res 또는 gcd로 위치이동하여 실행 후 출력하고 다시 메인으로 돌아오는 형태를 반복*/
	}
	
	
	/* 기능 : 두 정수의 합을 알려주는 메서드
	 * 매개변수 : 두 점수 => int num1, int num2 (일반변수가 아닌 매개변수는 앞에 전부 입력)
	 * 리턴타입 : 합 => 정수 => int
	 * 메서드명 : sum
	 * 
	 * 사용하는 이유 
	 * 1. 재사용이 용의함
	 * (변수명 중복을 신경쓰지 않고 따로 복사해서 반복하지 않아도 되기 때문에)
	 * 2. 코드의 길이를 줄일 수 있음
	 * 3. 유지&보수가 쉽다
	 */
	
	public static int sum(int num1, int num2) { //리턴값이 입력되기 전까지는 빨간밑줄이 생김
		/* return : 메서드를 종료하고, 값을 전달하는 역학 */
		return num1 + num2;
	}
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메서드
	 * 매개변수 : int num1, int num2/두 정수
	 * 리턴타입 : /최대 공약수 => 정수 => int
	 * 메서드명 : gcd(임의로 설정하는것이라 무엇이든 상관없음)
	 */
	public static int gcd(int num1, int num2) {//값을 선언한 상태 따로 선언할 필요는 없다
		int res=1;//최대 공약수를 저장하는 변수
		
		for(int i=1;i<num1;i++) {
			if(num1%i==0 && num2%i==0) {
				res=i;
			}
		}//최대공약수를 구하는 공식
		return res;
	}
	//public static 리턴타입 isPrime(매개변수)
	public static void gcd2(int num1, int num2) {//값을 선언한 상태 따로 선언할 필요는 없다
		int res=1;//최대 공약수를 저장하는 변수
		
		for(int i=1;i<num1;i++) {
			if(num1%i==0 && num2%i==0) {
				res=i;
			}
		}//최대공약수를 구하는 공식
		System.out.println(res);		
	}
	//public static 리턴타입 isPrime(매개변수)
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd (num1, num2);
		}
	
	/* 기능 : 정수가 소수인지 아닌지 판별하는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지 => 참 또는 거짓 => boolean
	 * 메소드명 : isPrime
	 */
//public static 리턴타입 isPrime(매개변수) 
	public static boolean isPrime(int num) {
//기능
		int cnt = 0;
		for(int i=1; i*i<=num;i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 1) {  //else if를 사용하지 않은것은 리턴의 방식을 보여주기 위함
		return true;	//return을 만나면 메소드가 종료되기 때문에 맞으면 true로 출력  현제 공식이 다른 경우 false로 종료
		}
		return false;
	}
	
}
