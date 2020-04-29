package play;

import java.util.Scanner;

public class day_2 {

	public static void main(String[] args) {
/* for문을 이용하여 5번 출력*/
	int i;
	System.out.println("일반 반복문");
	for(i=1;i<=5;i++){
		System.out.println("안녕하세요.");
	}
//안녕하세요를 5번 출력
	for(i=1;i<=5;i++){
		System.out.println(i);
	}
	System.out.println();
//i값을 5번 출력

	System.out.println("구구단 출력하기");
	System.out.print("정수를 입력하세요 : ");
/*입력한 수의 구구단을 출력하는 코드*/
	int  num;
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();
	for(i=1;i<=9;i++){
		System.out.printf("%d x %d = %d\n",num, i , num*i);
	}
	System.out.println();
	
/*for문으로 1부터 10까지의 합을 구하는 코드*/
	int sum=0;
	System.out.println("입력한 수의 합계 구하기");
	System.out.println("정수를 입력하세요 : ");
	num = scan.nextInt();
	for(i=1; i<=5; i++) {
		sum=sum+i;//sum+=i;
	}
	System.out.println("1부터 5까지의 합 : " + sum);
	System.out.println();
	
/*for문으로 num가 주어지면 주어진 num의 약수를 출력하는 코드*/
	System.out.println("약수구하기");
	System.out.println("구하려는 약수의 수를 입력하세요 : " );
	num =scan.nextInt();
	for(i=1;i<=num;i++) {
		if(num%i==0) {System.out.printf(""+i+(i!=num?",":""));	}
	}
	System.out.printf(" = %d의 약수",num);
	System.out.println();
	
/*if문을 이용하여 num이 음수이면 음수라고 양수면 양수라고 출력되고 0이면 0이라고 출력되는 코드*/
	System.out.println();
	System.out.println("음수,정수,0 판별");
	System.out.println("정수를입력하세요 : ");
	num =scan.nextInt();
	if(num == 0) {System.out.println("0입니다.");}
	else if(num > 0) {	System.out.println(num+"는 양수입니다.");}
	else {System.out.println(num+"는 음수입니다.");}
	System.out.println();
	
	
/*증감연산자*/
	System.out.println("증감연산자를 이용한 코드");
	int num1=10, num2=10;
	System.out.println("증가전 : num1 = " + ++num1 +", num2 = " +num2++);
	System.out.println("증가후 : num1 = " + num1 +", num2 = " + num2);
	
	System.out.println("----------------------------------------");
	System.out.println("증가전 : num1 = " + num1 +", num2 = " +num2);
	++num1;
	System.out.println("증가중 : num1 = "+ num1 + ", num2 = " +num2);
	++num2;
	System.out.println("증가후 : num1 = "+ num1 + ", num2 = " +num2);
	
	System.out.println("----------------------------------------");
	System.out.println("증가전 : num1 = " + num1 +", num2 = " +num2);
	num1++;
	System.out.println("증가중 : num1 = "+ num1 + ", num2 = " +num2);
	num2++;
	System.out.println("증가후 : num1 = "+ num1 + ", num2 = " +num2);
	System.out.println();
	
/*조건 연산자를 통해서 홀짝 확인하기*/
	System.out.println("홀짝 확인하기");
	System.out.println("정수를 입력하세요 : ");
	num =scan.nextInt();
	boolean isEven =(num % 2 == 0) ? true : false;
	boolean isOdd = (num%2 == 0) ? false : true;
	System.out.println(num+"는 짝수입니까? : " + isEven );
	System.out.println(num+"는 홀수입니까? : " + isOdd);
	System.out.println();
	
/*switch문을 이용하여 간단하게 만드는 홀짝*/
	System.out.println("switch문을 통한 홀짝");
	System.out.println("정수를 입력하세요 : ");
	num=scan.nextInt();
	switch(num%2) {
	case 0:
		System.out.println(num + "는 짝수");
		break;
	case 1://default:
		System.out.println(num + "는 홀수");
		break;
	}
	System.out.println();
	
	
/*랜덤 수 생성하기*/
	System.out.print("랜덤수 : ");
	int min = 0, max = 10, random = 0;
	random = (int)(Math.random()*(max-min+1))+min;
	System.out.println(random);
	
	
	
	
	scan.close();
	}
}


