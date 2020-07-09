package day53;

public class Ex5 {

	public static void main(String[] args) {
		// 1~10까지의 짝수의 합을 구하기
		int n=0;
		for(int i=1;i<=10;i++) {
			n=n+i;
		}
		System.out.println("1부터 10까지의 합: "+n);
		System.out.println();
		System.out.println("1부터 10까지의 짝수의 합");
		System.out.println();
		n=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				n = n + i;
			}
		}
		System.out.println("기본 for문으로 한 경우 : "+n);
		
		n=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) 
				continue;
				n += i;
		}
		System.out.println("for문에 continue를 사용한 경우 : "+n);

		int j=0;
		n=0;
		while(++j<=10) {
			if(j%2==1)
				continue;
			n+=j;
		}
		System.out.println("while문에 continue를 사용한 경우 : "+n);
	}

}
