package student;

import java.util.Scanner;

/* 학생들을 관리하는 프로그램을 작성하세요.
- 학생 정보 : 학년, 반, 번호, 이름, 국어, 영어, 수학 등
- 기능 : 학생 정보 추가, 학생정보 수정, 학생정보 삭제, 학생정보출력

예시 메뉴
1. 학생정보추가
2. 학생정보수정
3. 학생정보삭제
4. 학생정보 출력
5. 종료
메뉴를 선택하세요. : 1*/

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int manu = 0;
		Student tmpStudent;
		int size = 30;
		Student std[] = new Student[size];
		int cnt = 0;//현재 저장된 학생 수
/* Subject subjectList[];//입력받은 배열을 저장한것
 * String title;
 * int midterm, finals, performance, attendance;
 * 메소드로 작성하여 블러처리
*/
		String name;
		
		while(manu != 5) {
			printManu();
			manu = scan.nextInt();
			System.out.println();
			
			switch(manu) {
		case 1 : System.out.println("추가할 학생 정보를 입력하세요."); 
			tmpStudent = searchInfo(scan);
			System.out.print("이름을 입력하세요 : ");
			name = scan.next();
			tmpStudent.setName(name);
			
			if(isDuplicated(std, cnt, tmpStudent) != -1) {/*같지않을경우*/
				System.out.println();
				System.out.println("이미 있는 학생입니다.");
				break;
			}	
			std[cnt] = tmpStudent;
			
			System.out.println("과목정보를 입력하시겠습니까?(Y/N)");
			char subjectMenu = scan.next().charAt(0);
				switch(subjectMenu) {
				case 'Y': case 'y':/*몇과목받을지확인*/  
					inputSubject(scan, std[cnt]);
					break;
				/*default:처리 생략가능*/ }	
			cnt++;
			tmpStudent =null;
			/* tmpStudent와 std는 같은 객체 searchInfo를 공유하여 tmpStudent값의 연결을 끊어준다. */
				break;
			
		case 2 : 		System.out.println("학생정보 수정기능을 구현해야합니다.");
		modifyStudent(std, cnt, scan);
					break;
			
		case 3 : System.out.println("학생정보 삭제기능을 구현해야합니다.");
					 System.out.println("삭제할 학생 정보를 입력하세요.(검색)");
					 tmpStudent = searchInfo(scan);
					 if(deleteStudent(std, tmpStudent, cnt)) cnt--;
					 break;
			
		case 4 :	printStudent(std, cnt); 	break;	
		case 5 : System.out.println("프로그램을 종료합니다.");	
		break;			
		default: System.out.println("잘못된 메뉴입니다.");
			}
		}
		scan.close();
		
	
	}
/*선택메뉴 출력*/
	public static void printManu() {
/* static을 제거하면 클래스 메소드를의미 객체를 만들지않은 상태에서는 사용할 수 없다
 * 객체메소드는 클래스메소드를 소환할수없다. */
		System.out.println("------ 메 뉴 -------");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료 ");
		System.out.println("------------------");
		System.out.printf("메뉴를 선택하세요. : ");
		System.out.println();
	}
	
/*학생정보 입력		case1 사용*/
	public static Student searchInfo(Scanner scan) {
		System.out.print("학년을 입력하세요 : ");
		int grade = scan.nextInt();
		System.out.print("학반을 입력하세요 : ");
		int ClassNum = scan.nextInt();
		System.out.print("번호를 입력하세요 : ");
/* 학년, 반, 번호
 * 메소드안에 이름을 입력할 경우 설정했던 기능과 달라지기에
 * main class에 따로 기입*/
		int num = scan.nextInt();
		Student s = new Student();
		s.setGrade(grade);
		s.setClassNum(ClassNum);
		s.setNum(num);
		return s;
		
	}

/*학생정보 출력		case4 사용*/
	public static void printStudent(Student []std, int cnt) {
		System.out.println("========================");
		for(int i=0 ;i<cnt;i++) {/*향상된포문을이용*/
			Student tmp = std[i];
			System.out.printf("%d학년 %d반 %d번 이름 : %s\n", tmp.getGrade(),
			tmp.getClassNum(), tmp.getNum(), tmp.getName());/*tmp대신 std[i]를 사용해도 됨 (출력은 자신의 스타일로 꾸며출력)*/
			std[i].printScore();
		}		
		System.out.println("========================");
/* 위의 설명
 * 학생의모든정도 출력하는코드(출력코드는 return타입이 없기에 void)
 * 사용가능리턴
 * void : 콘솔에 출력하고 알려줄 정보가 없음
 *   └ 리턴타입이 없을때 사용(자주사용)
 * int : 출력학생 수를 확인
 * boolean : 학생정보를 출력하면 true, 실패하면 false
 * 사용가능매개
 * Student : 한명의 학생정보
 * Student[] : 여러명의 학생 정보
 * cnt : 현재 출력할 학생 수 */	
		
	}
/*여러 과목 정보 입력	case1, case2 사용*/
	public static void inputSubject(Scanner scan, Student s) {
		System.out.print("입력할 과목 수 : ");
		 int subjectCnt = scan.nextInt();
		 Subject []subjectList = new Subject[subjectCnt];// 배열생성
		 	for(int i=0;i<subjectCnt;i++) {
		 		System.out.println();
		 		System.out.print("과목명 : ");
		 		String title = scan.next();
		 		System.out.print("중간고사 : ");
		 		int midterm = scan.nextInt();
		 		System.out.print("기말고사 : ");
		 		int finals = scan.nextInt();
		 		System.out.print("수행평가 : ");
		 		int performance = scan.nextInt();
		 		System.out.print("출석점수 : ");
		 		int attendance = scan.nextInt();
		 		subjectList[i] = new Subject(title, midterm, finals, performance, attendance);
		 		}
		 	if(s==null) return;/*참조주소안에 값이 없을 경우 종료(학생정보가 없는 경우)*/
		 	s.setScore(subjectList);
		
/* 위의 설명
 * 기능 : 콘솔에 정보를 입력받고 입력받은 정보를 통해 과목들을 저장하고 저장한 과목을 학생정보에 추가하는 기능
 * 내생각리턴 : Student ?
 * 사용가능리턴
 * void : 매개변수를 통해서 변경이 가능하기에 없어도 가능
 * int : 추가된 과목 수  
 * 내생각매개 : Scanner ?
 * 사용가능매개
 * Scanner : 콘솔에서 입력받기 위함
 * Student : 학생 정보
 */
	}
	
/*학생 정보 삭제		case3 사용*/
	public static boolean deleteStudent(Student std[], Student deleteStudent ,int cnt) {
		if(std==null || deleteStudent == null ||cnt<=0) return  false;
		int pos = isDuplicated(std, cnt, deleteStudent);/*삭제할 학생정보가 몇번지에 있는지 확인하는 코드*/
		
		if(pos != -1) {
			 for(int j=pos;j<cnt-1;j++) {
				 std[j] = std[j+1];
		
//		 for(int i=0;i<cnt;i++) { 
///*하나씩 검색해서 tmpStudent와 같은 학생이 있는지 확인하고 있을 경우 삭제 후 하나씩 밀어줌*/
//			 if(deleteStudent.equal(std[i])) {
//				 for(int j=i;j<cnt-1;j++) {
//					 std[j] = std[j+1];
//					 } 
			System.out.println("삭제가 완료되었습니다.");
			System.out.println();
			return true;
	 }
  }return false;

/* 내생각리턴 : void
 * 사용가능결론
 * int : 삭제된 뒤의 학생 수
 * boolean : 삭제 여부(학생수를 main에서 true,false로 처리)
 * 내생각매개 : cnt
 * 사용가능매개 
 * int cnt : 현재 학생수
 * Student []std : 저장된 학생 정보
 * Student s : 삭제할 학생 정보
 */
		
	}
	
/*검사(같은 입력이 있는지 없는지 확인) , deleteStudent 사용*/
	public static int isDuplicated(Student std[],int cnt, Student s) {
		for(int i =0;i<cnt;i++) {
			if(std[i].equal(s)) {
				return i;
			}
		}return -1;
		
		
/* 내생각리턴 :	??
 * 사용가능한 리턴타입
 * int : 중복되면 중복된 번지를 알려주고, 중복 안되면 -1을 반환
 * 		(int로 리턴타입을 할 경우 isDuplicated를 통해서 몇번지에서 중복되는지를 찾을 수 있다)
 * boolean : 중복되면 true, 아니면 false로 표현
 * 내생각매개 : ?? 
 * 사용가능한 결론
 * Student []std
 * Student s
 * int cnt
 */
	}

/*정보 수정 case2(안의 case2) 사용*/
	public static void modifyStudent(Student std[], int cnt, Scanner scan) {
		 System.out.println("수정할 학생 정보를 입력하세요.(검색)");
		 Student tmpStudent = searchInfo(scan);
		 int pos = isDuplicated(std, cnt, tmpStudent);
		 if(pos ==-1) {
			 System.out.println("없는 학생 정보입니다."); return;
		 }
		System.out.print("변경 할 이름 : ");
		String name = scan.next();
		tmpStudent.setName(name);
		System.out.println("----과목수정----");
		System.out.println("1. 수정");
		System.out.println("2. 추가");
		System.out.println("3. 종료");
		System.out.println("과목을 수정하시겠습니까?");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1:
//해당 학생의 과목정보를 가져옴
			Subject sList[] = std[pos].getScore();
			if(sList == null) {
				System.out.println("수정할 과목이 없습니다.");
				break;//과목이 없을 경우 끝내기
			}
	
//수정할 과목을 입력
			System.out.print("과목 : ");
			String title = scan.next();

//수정할 과목이 있는지 찾아 있으면 아래작업을 하고 없으면 종료
			int subPos =-1;
			for(int i=0; i<sList.length;i++) {
				if(sList[i].getTitle().contentEquals(title)){
					subPos =i;
					break;
				}
			}
			if(subPos==-1) {
				System.out.println("등록되지 않은 과목입니다.");
				break;
			}
//중간,기말, 수행평가, 출석점수를 전부 새로 수정/
			System.out.print("중간고사 : ");
			int midterm = scan.nextInt();
			System.out.print("기말고사 : ");
			int finals = scan.nextInt();
			System.out.print("수행평가 : ");
			int performance = scan.nextInt();
			System.out.print("출석점수 : ");
			int attendance = scan.nextInt();
			sList[subPos].setMidterm(midterm);
			sList[subPos].setFinals(finals);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendance(attendance);
			break;
		case 2:
			Student s = new Student();
			inputSubject(scan,s);
			std[pos].addScore(s.getScore());
			break;
		}
		
		
/* 내생각리턴 : ??
 * 사용가능리턴
 * void : 없음
 * 내생각매개 : ?? 
 * 사용가능매개 
 * Student std[] : 학생들 정보
 * int cnt : 저장된 학생 수
 * Scanner : 학생 정보를 입력받기 위해서
 */
	}

}
	
/////////////////////////////////////////////////////////////////////////////////////////////////		
/* 1. 데이터 관리를 위한 작업
 *   => 변수나 클래스를 이용
 *   학생 정보=>Student 클래스
 *   과목 정보=>Subject 클래스
 * 2. 기능 구현
 *   => main메소드에 바로 구현
 * 	 => 또는 기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
 * 3. 테스트

	interface Manage{
		public int insertStuent(Student []arr, Student std);
		public void modifyStuent(Student []arr, Student std);
		public int deleteStuent(Student []arr, Student std);
		public void printStuent(Student []arr,int count);
	}




어려워서 하지않음

 */
	
	
	
	
/* 과제
 * 1~50사이의 랜덤한 수를 컴퓨터가 생성하고, 사용자가 해당수를 맞추는 게임
	예) 컴퓨터가 랜덤으로 생성된 수가 34
	입력 : 50 down
	입력 : 20 up
	입력 : 35 down
	입력 : 34 정답이니다~*/
