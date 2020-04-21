package day3;

public class ForEx9 {

	public static void main(String[] args) {
		/* *****
		 * 
		 */
		for(int i =1; i<=3;i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i =1; i<=5;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*     *	공백+*
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		
		for(int i =1; i<=5;i++) {
			
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
