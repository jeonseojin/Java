package day5;

public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point1.printCount();
		point1 p1 = new point1(); //point 변수 선언
		System.out.print("1. 현재 좌표를 출력하는 기능 : ");
		p1.printPoint();
		p1.movexy(3, 5);
		System.out.print("2. x,y좌표가 주어지면 해당 좌표로 이동하는 기능 : ");
		p1.printPoint();
		p1.setX1(2);
		System.out.print("3. x의 값이 주어지면 x1의 값을 수정하는 기능 : ");
		p1.printPoint();
		p1.setY1(7);
		System.out.print("4. y의 값이 주어지면 y1의 값을 수정하는 기능 : ");
		p1.printPoint();
		point1.printCount();
		point1 p2 = new point1(10, 10);
		p2.printPoint();
		point1.printCount();
		int x = 40, y = 20;
		p1.movexy(x, y);
		p1.printPoint();
	}

}
/* 클래스명 : point1(페키지 내에서 동일한 포인트가 있기때문에 1을 붙임)
 * 멤버변수 : x1좌표, y1좌표 => 외부에서 접근이 불가능하도록 설정
 * 기능 (메서드)
 * 	1. 현재 좌표를 출력하는 기능
 *  2. x,y좌표가 주어지면 해당 좌표로 이동하는 기능
 *  3. x의 값이 주어지면 x1의 값을 수정하는 기능
 *  4. y의 값이 주어지면 y1의 값을 수정하는 기능
 *  5. x1의 값을 가져오는 기능
 *  6. y1의 값을 가져오는 기능
 * 생성자
 * 	- 기본 생성자
 * 	- x, y좌표가 주어졌을 때 객체를 생성하는 생성자
*/

	class point1{				//클래스명
		private int x1, y1;		//멤버변수가 private일때 값을 가져오는 것과 값을 설정하는 변수를 설정해야한다.
	/* 기능 : 1. 현재 좌표를 출력하는 기능
	 * 매개변수 : 필요없음 (내생각 : 정수 => int x, int y)
	 * 리턴타입 : 없음
	 * 메소드명 : printPoint
	 public int print(int x, int y) {
		return 1;
	}
	*/
		private static int count;
		public void printPoint() {//public (리턴타입없음) 메소드명 (매개변수 없음){ }

			System.out.printf("( %d , %d )\n",x1,y1);
		}
		
	/* 기능 : 2. x,y좌표가 주어지면 해당 좌표로 이동하는 기능
	 * 매개변수 : x,y좌표 => int x, int y)
	 * 리턴타입 : 없음
	 * 메소드명 : movexy
		*/
		public void movexy(int x, int y) {
			x1=x; y1=y;
		}
		
/*   3. x의 값이 주어지면 x1의 값을 수정하는 기능
 * 	 4. y의 값이 주어지면 y1의 값을 수정하는 기능
 * getter와 setter
 * getter는 멤버변수가 private인 경우 직접 멤버 변수의 값을 가져올 수 없기 때문에 멤버 변수의 값을 가져올 수 있는 메서드
 * setter는 멤버변수가 private인 경우 직접 멤버 변수의 값을 설정할 수 없기 때문에 멤버 변수의 값을 설정 할 수 있는 메서드
 * 		사용방법
 * 		class내에서 우클릭 후 Source > Generate Getters and Setter 클릭
 * 			└ 불러올 멤버변수가 private인 것을 체크해줌
*/

		public int getX1() {
			return x1; //현재진행문을 종료하고 해당값을 가져간다
		}

		public void setX1(int x1) {
			this.x1 = x1;
		}

		public int getY1() {
			return y1;
		}

		public void setY1(int y1) {
			this.y1 = y1;
		}
		/* 생성자가 하나도 없으면 기본 생성자를 생략해도 클래스에 기본 생성자가 자동으로 만들어진다.
		 * 생성자가 오버로딩이 되어 있고 기본 생성자가 없으면, 이때는 자동으로 기본 생성자를 많들지 않아서
		 * 기본생성자를 이용한 객체를 만들 수 없다.
		 */
	 public point1() {
			count++;//값을 설정하지 않을 경우 0으로 세팅되어 있음
	 } // 기본생성자(public point1() {})를 주석처리하면 오류발생
		public point1(int x, int y) {
			count++;
			x1 = x; y1 =y;
			}
// ----------------------------------------------------------------------------
		public static int getCount() {
			return count;
		}

		public static void setCount(int count) {
			point1.count = count;
		}
		public static void printCount() {
	// 클래스 메소드에는 객체변수를 사용할 수 없으므로 에러발생
	// 클래스 메소드는 객체없이 사용이 가능한데 x1이라는 객체변수는 객체를 생성해야 사용할 수 있는 변수이다
	// 그렇기 때문에 클래스 메서드에서는 사용할 수 없다.
	// System.out.println(x1);
			System.out.println("지금까지 만들어진 좌표의 갯수 : "+count);
		}
		
	}
