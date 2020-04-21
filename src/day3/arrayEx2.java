package day3;

public class arrayEx2 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		num1=num2;
		System.out.println(num1);
		int arr1[]=new int[] {1, 2, 3, 4};
		int arr2[]=new int[] {9, 8, 7, 6};
		//arr2[0]=1;
		/*arr1=arr2;로 작성할 경우 참조주소를 함께 공유하는 형태가 된다.
		arr1에 있던 배열이 사라짐
		배열끼리는 ( ==, = ) 같다는 표현을 사용할 수 없다.
		*/
		for(int i = 0; i<arr1.length; i++) {
			//arr1[i]=arr2[i];
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i]=tmp;
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println(" ");
		
		System.out.println(" ");
		
		System.arraycopy(arr1, 1, arr2, 1, arr1.length-1);
		for(int i = 0; i<arr1.length; i++) {
			//arr1[i]=arr2[i];
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i]=tmp;
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
	}

}
