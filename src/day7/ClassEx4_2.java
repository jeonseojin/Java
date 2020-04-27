package day7;

public class ClassEx4_2 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.in();
		s1.printInfo();
		Student1 s2 = new Student1("디지털 컨버전스 ... 자바","이순신");
		s2.in();
		s2.out();
		s2.printInfo();
		}
}
	/*수업과정을 클래스로 만들 경우 쌤이랑 같이 풀이한 클래스*/
class Student1{
/* 클래스명을 Student라고 작성할 경우 classEx4인 같은 페키지안에서 동일한 이름이 존재하기 때문에 오류가 난다. */
//멤버 변수
//학생 이름
	private String name;//static이 붙지 않음
//입실여부
	private boolean isEntrance;
//수강 과정
	private String course;
//입실시간, 퇴실시간
	private String inTime, outTime;
	
//멤버 메서드
//입/퇴실 기능
	public void in() {
		System.out.println(name + "님이 입실 했습니다.");
		isEntrance = true;
		inTime = "9시";
	}
	public void out() {
		System.out.println(name + "님이 퇴실 했습니다.");
		isEntrance = false;
		outTime = "18시";
	}
//학생정보 출력 기능
	public void printInfo() {
		System.out.println("과정 : "+course);
		System.out.println("이름 : "+ name);
		if(isEntrance) {
			System.out.println("입실 중입니다.");
			System.out.println("입실 시간 : "+inTime);
		}else {
			System.out.println("퇴실 했입니다.");
			System.out.println("입실 시간 : "+inTime);
			System.out.println("퇴실 시간 : "+outTime);
		}
	}
	
	//멤버변수가 private일 경우에 만들어두기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEntrance() {
		return isEntrance;
	}
	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
//생성자
	public Student1() {
		course = "자바";
		name = "홍길동";
	}
	public Student1(String course, String name) {
		this.course = course;
		this.name = name;
	}
}

