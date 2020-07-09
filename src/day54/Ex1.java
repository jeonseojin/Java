package day54;

public class Ex1 {

	public static void main(String[] args) {
		// 2차원 좌표 평면의 한 점을 나타내는 point클래스를 만들고, 테스트 해보세요.
		// 멤버변수 설정 / getter,setter / 생성자 / 필요한 기능 -> 메서드
		
		// 객체 생성
		Point p1 = new Point();
		p1.print();
		System.out.println(p1.distanc(3, 4));
		p1.move(3, 4);
		p1.print();
	}

}
// 클래스에 public을 붙일 때는 클래스명과 페키지명이 동일 할 때만 가능
// 따로 입력받은 생성자가 없기때문에 default임으로 나 + 같은 패키지를 의미
class Point{
	// 멤버변수 생성
	private int x;
	private int y;
	
	// getter, setter 생성
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	
	// 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	// 기본 생성자
	public Point() {}
	
	// 복사 생성자(Ex5에서 Point의 이동경로를 확인하기 위해서 필요한 생성자)
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	
	// 메서드
	public void print() {
		System.out.println(x+" , "+y);
	}
	// 기능
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	// 나와 다른 점 사이의 거리를 의미하는 메서드
	public double distanc(int x, int y) {
		double res = 0;
		int disX = this.x - x; // x2-x1
		int disY = this.y - y; // y2-y1
		res = Math.pow(disX,2.0)+Math.pow(disY,2.0); //(x2-x1)^2 + (y2-y1)^2
		res = Math.sqrt(res); // (x2-x1)^2 + (y2-y1)^2
		return res;
	}
}