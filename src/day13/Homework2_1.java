package day13;

import java.util.Scanner;

public class Homework2_1 {

	public static void main(String[] args) {
		int size = 50;
		Product product[] = new Product[size];
		char menu = 'y';
		Scanner scan = new Scanner(System.in);
		int cnt = 0;//현재 저장된 제품의 갯수
		
/*1. 반복문 */
		while(menu != 'n'/*menu == 'y'*/) {
//2. 입력을 받음(y/n)
			System.out.print("상품을 등록하시겠습니까?(y/n) : ");
			menu = scan.next().charAt(0);
//3. 입력받은 값을 통해 제품 리스트를 출력할지 제품을 등록할지를 결정	
			if(menu == 'y') {
//제품을 등록
				System.out.print("상품명 : ");
				String name = scan.next();
				System.out.println("가격 : "); 
				int price = scan.nextInt();
				product[cnt] = new Product(name, price);
				cnt++;
			}
		}
		int total=0;
//등록된 제품 리스트 출력
		for(int i=0; i<cnt; i++) {
			product[i].print(i+1); //product 클래스의 멤버 메소드 print를 실행
			//print(product[i],i+1); //print 메소드를 실행 
			total += product[i].getPrice();
		}
		System.out.println("총 가격 : "+total+"원");
		scan.close();
	}
	
	public static void print(Product product, int num) {
		System.out.printf("%d. 상품명 : %s , 가격 : %d원\n",num,product.getName(),product.getPrice());
	}
}//main class


class Product{
	private String name;
	private int price;
	public Product() {}//기본생성자
	
	public Product(String name, int price) {/*우클륵*/
		this.name = name;
		this.price = price;
	}
	
public Product(int size) {
		// TODO Auto-generated constructor stub
	}

/*get,set*/
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getPrice() {	return price;	}
	public void setPrice(int price) {	this.price = price;	}
	
	
/* 번호가 없는 경우*/
	public void print() {
		System.out.printf("상품명 : %s , 가격 : %d원\n",name,price);
	}
/* 번호가 주어진 경우
 * 메소드 오버로딩
 */
	public void print(int num) {
		System.out.print(num+". ");
		print();
	}
}
