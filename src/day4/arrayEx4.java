package day4;

public class arrayEx4 {

	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제
		int arr[] = new int[7];
		int max = 45;
		int min = 1;
		
		// 임의의 수를 생성하여 배열에 저장하는 코드 (중복 가능)
		for(int i = 0; i<arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;//랜덤한 수를 생성
			arr[i] = random;
		}
		// for(int tmp:arr)
		// if(max > 100)
		// 위의 두 경우는 그대로 덮어쓰기의 기능을 한다
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
		
		/* 임의의 수를 생성하여 배열에 저장하는 코드 (중복 불가)
		 랜덤한 수를 생성하고 arr[1]에 저장된 수가 random의 수와 같으면 다시 랜덤한 수를 생성하도록 한다
		 	while(배열에 저장된 랜덤수의 갯수가 3보다 작을 때){
		 		int random = (int)(Math.random()*(max-min+1)) + min;
		 		배열의 0번지부터 cnt (배열에 저장된 랜덤수의 갯수) -1번지까지 중복여부 체크하여
		 		중복되지 않으면 배열에 랜덤수를 저장하고 배열에 저장된 랜덤수의 갯수를 1증가
		 	}
		
		*/
		int cnt = 0;//배열에 저장된 랜덤수의 갯수
		int []arr2=new int[7];
		while(cnt < arr.length) { //arr.length는  arr의 길이를 의미함으로 간편하게 사용가능
			int random = (int)(Math.random()*(max-min+1)) + min;//랜덤수
			int i=0; // i는 중복이 되었는지 확인하기 위해 체크하는 용도로 사용함(반복문을 체크하기위한것)
			while(i<cnt) {
							//cnt는 1~3을 의미하고 i<cnt는 cnt보다 작다는 의미로 cnt-1을의미함
				if(random == arr2[i]) { // arr2[i]는 cnt-1의 의미임으로 arr2의 길이를 뜻한다.
					break;// break를 입력하지 않은경우 i는 cnt와 동일하여 중복된다 
				}
				i++;
			}
			if(i == cnt) {
				arr2[cnt] = random;
				cnt++;
			}
			
		}
		System.out.println();
		for(int tmp:arr2) {
			System.out.print(tmp + " ");
		}
		
		// 생성된 랜덤수  r         1 1 2 1 9       arr[i] 0 1 2 arr[i]의 위치 cnt-1
		// 배열의저장갯수  (cnt-1)  1   2   3   
		//			  (if문)    0 1 2 2 3    
		// 저장된배열의값  arr      1 . 2 . 9     랜덤수가 저장됨  1 2 9
		
	}

}
