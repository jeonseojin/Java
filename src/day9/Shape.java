package day9;

public class Shape{
//변수
	private int left;	//시작점의 x좌표
	private int up;		//시작점의 y좌표
	private double width;	//가로의 길이
	private double height;	//세로의 길이
	private static int count;
	public static void printCount() {
		System.out.println("현재까지 만들어진 도형의 갯수 : "+ count);
	}
//메소드
	public void print() {
		System.out.println("-------도형의 정보---------");
		System.out.printf("시작점은 ("
				+ "%d , %d)\n",left,up);
		System.out.printf("가로 : %.2f\n",width);
		System.out.printf("세로 : %.2f\n",height);
		System.out.println("------------------------");
	}
	
	public Shape() {count++;	}
/* └ 생성자 */
	public Shape(int left, int up, double width, double height) {
		super();
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		count++;
	}
/* └ 우클릭 > source > constructor using file*/
	
	public void move(int left, int up) {
		this.left =left; this.up = up; 
	}
	public void resize(double width, double height) {
		this.width = width; this.height = height;
	}
	
/* └ 기능 코드*/
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

/* └우클릭 > source >  get,set (private이 사용되어 get,set을 사용)
 * private은 속성정보가 중요할 경우에 변경되지 않게 유지하기위해 사용한다
 * 어떠한 경우에만 변경하기 위해서 get,set을 사용한다.
 */
	

	
}