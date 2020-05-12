package student;

public class Student {
	//학생클래스 사용
	private String name = "";
	private int grade;
	private int classNum;
	private int num;
	private Subject score[];
	//기능 설정
/* 입력한 값과 이미 저장된 값을 비교하여 같은 값이 있는지 확인 case1에서 사용*/
	public boolean equal(int grade, int classNum, int num, String name) {
		if(this.grade != grade) return false;
		if(this.num != num) return false;
		if(!this.name.equals(name)) return false;
		return true; }

/* 입력한 값과 이미 저장된 값을 비교하여 같은 값이 있는지 확인 case3에서 equal로 사용*/
	public boolean equal(Student s) {
				if(this.grade != s.grade) return false;
				if(this.classNum != s.classNum) return false;
				if(this.num != s.num) return false;
				return true; }
		


	//getter, setter 설정
	public String getName() {	return name;}
	public Subject[] getScore() { return score;	}
	public void setName(String name) {	this.name = name;}
	public int getGrade() {	return grade;}
	public void setGrade(int grade) {this.grade = grade;}
	public int getClassNum() {return classNum;}
	public void setClassNum(int classNum) {	this.classNum = classNum;}
	public int getNum() {	return num;}
	public void setNum(int num) {this.num = num;}

	
	
	
/*성적 배열*/
	public void setScore(Subject...score) {
		this.score = new Subject[score.length];
		for(int i =0; i < score.length; i++) {
			/* this.score[i]=score[i]; 에러발생()
			 * score[i]에 계속해서 다른값으로 덮어씌우기 때문에 무한루프에 빠지게 됨
			 * (예 : 3개를 추가 할 경우 i¹,i¹,i¹의 위치에 덮어씌우듯 저장)
			 * 아래 new Subject(score[i]);로 할 경우
			 * 같은 곳안에서 입력된 값을 저장해두고 새로운 곳에 입력하는 방식
			 * (예 : 3개를 추가 할 경우  i¹,i²,i³에 저장 )
			 */
			this.score[i] = new Subject(score[i]);	
			}
		}

/*성적출력*/
	public void printScore() {
		if(score == null) return;
/*입력된 값이 없을 경우 원래 있던 곳으로 돌아간다.*/
		for(Subject tmp:score) {
			tmp.print();
			
		}
	}

/*Main에서 modifyStudent에서 사용*/
	public void addScore(Subject[] addscore) {
		int aSize = 0, bSize = 0;
		if(score!=null) aSize=score.length;
		if(addscore!=null) bSize=addscore.length;
		/* 위의 코드는 예외처리를 하기 위해서 사용한 코드*/
		Subject []tmp = new Subject[aSize + bSize];
		for(int i=0;i<aSize;i++) {
			tmp[i] = score[i];					
		}
		/*위의 for문은 기존의 과목을 불러오는 배열코드*/
		for(int j=0;j<bSize;j++) {
			tmp[aSize+j] = addscore[j];
		}
		/*위의 for문은 새로늘어난사이즈의배열코드*/
		score = tmp;
		/*새로만든 과목을 원래 배열에 연결하는 배열을 score에 덮어씌우는 과정*/
		
		/* 작업을 하는 이유 : 기존의 배열을 score의 길이만큼만 만들었기 때문에 추가로 생성해야한다
		 * 기존과목 std + 새로운과목 = tmp 
		 */		
	}
}



