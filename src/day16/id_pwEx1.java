package day16;

import java.util.*;

/* id와 pw를 등록하고, id를 이용하여 pw를 검색하는 코드를 작성하세요.
예)
메뉴
1. 등록
2. 검색	
3. 종료
메뉴를 선택하세요 : 1
id : abcde
pw : 1234
메뉴
1. 등록
2. 검색
3. 종료
메뉴를 선택하세요 : 2
id : abcd
abcd는 없는 아이디입니다.
1. 등록
2. 검색
3. 종료
메뉴를 선택하세요 : 2
id : abcde
abcde의 pw는 1234입니다.
*/
public class id_pwEx1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		Set set =map.entrySet();
		Iterator it = set.iterator();


		int menu =0;
		
		
		while(menu!=3) {
			print();
			menu =scan.nextInt();
			switch(menu) {
			case 1:

 					System.out.print("ID : ");
 					String id= scan.next();
					
					System.out.println("PW : ");
					String pw = scan.next();
					map.put(id, pw);

				break;
			case 2:
								
				
				break;
			case 3: System.out.println("종료합니다.");
					break;
			}
		}
	}

	public static void print() {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 종료");
		System.out.println("메뉴를 선택하세요 : ");
		System.out.println();
	}
}
