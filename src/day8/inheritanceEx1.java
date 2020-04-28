package day8;

public class inheritanceEx1 {

	public static void main(String[] args) {
		// 상속 : 
		Child c1 =new Child();
		c1.print2();
		System.out.println();
		c1.setD(12);
		c1.print2();
	}

}
class Child extends Parent{
	private int e;
	point p1 =new point();//ConstructorEx1에 있는 point를 사용
	public void print2() {//print로 해도 가능하지만 개념이 다르게 설정됨
		//print();
		System.out.printf("%d,%d\n",p1.x ,p1.y);
		System.out.printf("%d,%d", x,y);
		System.out.println();
		System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%d\n",a,b,c,getD()/*private으로 설정되어있는 d를 따로 불러오기 위해서 getD()를 사용*/,e);
	}
}
class Parent{
	public int a;
	protected int b;
	int c;
	private int d=10;
	public int x, y;
	public void print() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n",a,b,c,d);
	}
	public Parent() {}
//	public Parent(int a, int b, int c, int d) {
//		this.a=a; this.b=b; this.c=c; this.d=d;
//	}
//alt + shift + s 로 
	public Parent(int a, int b, int c, int d) {
		//super();
		this.a = a;	this.b = b;	this.c = c;	this.d = d;
	}
	
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	
	
	
}