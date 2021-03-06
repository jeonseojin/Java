package day3;

import java.util.Scanner;

public class whileEx2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소공배수 : 두 수의 공배수 중 가장 작은 공배수
		 * 공배수 :ㅣ 두 수의 배수 중 공통인 배수
		 * 10의 배수 : 10 20 30 40 ....
		 * 15의 배수 : 15 30 45 60 ....
		 * 10과 15의 공배수 : 30 60 90 ...
		 * 10과 15의 최소 공배수 : 30
		 * 1. 반복횟수 : i는 1부터 num1*num2까지 1씩 증가 (두수의 곱과 같거나 작을 경우이기 때문에 )
		 * 								<조건문				실행문>
		 * 2. 규칙성 : i가 num1의 배수(이고) i가 num2의 배수(이[면]) i를 출력하고 반복문을 종료
		 * 3. 반복문 종료 후 : 없음
		 */
		/*while(i<=num1*num2) {
		if(i가 num1의 배수이고 i가 num2의 배수이다) {
				i를 출력;
				반복문 종료;
			}
			*/
		//2는 4의 약수이다. 4는 2의 배수이다  4%2==0
		//└ 약수이자 배수가 되는 형태임으로 %를 사용한다.
		
		//예제 1
		
		int num1, num2;
		int i;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		i=1;

		while(i<=num1*num2) {
			cnt++;
			if(i%num1==0 && i%num2==0) {
				System.out.printf("%d와 %d의 최고공배수 : %d, 반복획수 %d\n",num1,num2,i,cnt);
				break;
			}
			i++;
		}

		/*위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소 공배수가 큰 경우 반복횟수가 많아짐.
		 * 그래서 아래처럼 i를 num1부터 시작하여 num1의 배수로 한다면 반복회수가 줄어든다. 
		 */
		
		//예제 2 효율증가↑
		
		i=num1;
		cnt=0;
		while(i<=num1*num2) {
			cnt++;
			if(i%num1==0 && i%num2==0) {
				System.out.printf("%d와 %d의 최고공배수 : %d, 반복획수 %d\n",num1,num2,i,cnt);
				break;
			}
			i+=num1;
		}
		
		if(num1<num2) {
			int tmp = num1; //23p참고
			num1=num2;
			num2=tmp;
				/* 서로의 값을 교환할 경우에 새로운 제3자를 생성하지만 arrayEx2에서의
				arr1[i]=arr2[i];의 표현은 공요하는 개념이다.?
				*/
		}
		i=num1;
		cnt=0;
		while(i<=num1*num2) {
			cnt++;
			if(i%num1==0 && i%num2==0) {
				System.out.printf("%d와 %d의 최고공배수 : %d, 반복획수 %d\n",num1,num2,i,cnt);
				break;
			}
			i+=num1;
		}
		
		
	}
		
}
