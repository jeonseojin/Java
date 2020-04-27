package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student.printInfo();
	}
}
/*수업과정을 클래스로 만들 경우를 혼자 풀이한 클래스*/
//클랙스명
class Student{
//클래스 변수(변경할 수 없는 것)
//교사, 수업명
	private static String teacher = "전일규";
	private static String lesson = "Java";	
//객체 변수
//학생수, 컴퓨터수, 수업중, 학생이름
	int stu, com;
	boolean listening;
	String stuName;
	
//클래스 메서드
	public static String semname() {
		return teacher;
	}
	public static String su() {
		return lesson;
	}
	public static void printInfo() {
		System.out.println(lesson+" 응용 프로그램");
		System.out.println(teacher+" 선생님");
	}
//객체 메서드

	
//생성자

}

