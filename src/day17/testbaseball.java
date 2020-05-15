package day17;

import java.util.*;


public class testbaseball {

	public static void main(String[] args) {
/* 야구게임 설정
 * 1. 컴퓨터가 생성한 랜덤한 수를 저장하는 리스트 생성 : com */
		List<Integer> com = new ArrayList<Integer>();
/* 2. 사용자가 입력한 수를 저장하는 리스트 생성 : user*/
		List<Integer> user = new ArrayList<Integer>();
		int size = 3;
		int min =1, max =9;
 /* 3. 중복되지 않는 랜덤한 수 3개를 com에 저장*/
		com = createRandomList(size, min, max);
		System.out.println(com);
/* 4. 사용자가 중복되지 않는 세 수를 입력하여 맞출때까지 반복*/
		int strike =0,ball=0;
/*	4-1. 스트라이크의 갯수가 3개가 될때까지 반복*/
		Scanner scan = new Scanner(System.in);
		while(strike != size) {
/*	4-2. 중복되지 않은 세 수를 입력  // 정수 세 개를 입력받아 중복된 내용이 있으면 다시 입력받게 함*/
			user.clear();//유저가 여러번 입력하기 위해서 초기화
			
			if(! insertUser(scan, min, max, user, size)) {
				System.out.printf("입력된 숫자 중에 중복된 숫자가 있거나 입력된 숫자가 "
						+ " %d ~ %d 사이의 숫자가 아닙니다.\n",min,max);
				continue;/*중복된 수가 있는 경우 continue로 가라는 의미*/
			}
			System.out.println(user);

/*	4-3. 스트라이크와 볼을 판별*/
			strike = 0;
			ball = 0;
			for(int i = 0; i<com.size();i++) {
		//스트라이크의 갯수 판별
				if(com.get(i)==user.get(i)) {	strike++;	}
				
		//스트라이크 + 볼의 갯수 판별
				if(com.contains(user.get(i))){	ball++;		}
			}
		//ball의 현재 값이 스트라이크 + 볼의 값이기 때문에 strike만큼 빼줘야 ball의 갯수가 나옴 
			ball = ball-strike;
/*	4-4. 판별한 스트라이크와 볼을 이용하여 출력 */
			if(strike != 0) {System.out.print(strike+"S ");	}
			if(ball != 0 ) { System.out.println(ball +"B ");}
			if(strike==0&&ball==0) {System.out.print("30");}
			System.out.println();
		}//반복문 종료
		System.out.println("정답입니다.");
		scan.close();
	}
/*랜덤수 생성*/
	public static int random(int min, int max) {
		if(max<min)throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
/* 기능 : min~max사이의 중복되지 않는 랜덤한 3개의 수를 com에 저장
 * 	 =>	min에서 max 사이의 랜덤한 수를 중복되지 않게 size개만큼 리스트에 저장하여 반환하는 메소드
 * 매개변수 : int min,int max,List<Integer> com <= 내생각/샘 => 객수, 최고값, 최대값 > int size,int min, int max
 * 리턴타입 : List<Integer> 또는 void <= 내생각/샘 => 랜덤한 수가 저장된 리스트 => List<Integer>
 * 메소드명 : createRandomList*/
	public static List<Integer> createRandomList(int size,int min,int max){
		if(size>max-min+1) throw new ArithmeticException("예외 발생 : 랜덤 범위보다 만들어야 하는 갯수가 많습니다.");
/*리스트생성*/		List<Integer> list = new ArrayList<Integer>();
		while(list.size()<size) {
			int r= random(min,max);
			if(! list.contains(r)/*list.contains는 중복되는것이라 !를입력하여 중복되지않는것을설정*/) {
				list.add(r);
			}
		}
		return list;
	}
	
/* 기능 : 스캐너를 통해 정수를 size개 입력받아 입력받은 정수가 min ~ max사이이고 중복되지 않으면 리스트에 저장한 후 
 * 		리스트 생성 여부를 알려주는 메소드
 * 매개변수 : 스캐너, 최소값, 최대값, 리스트, 갯수 => Scanner scan, int max, int min, List<Integer> user, int size
 * 리턴타입 : 생성 여부 => boolean 
 * 메소드명 : insertUser */
	public static boolean insertUser(Scanner scan, int min, int max, List<Integer> user, int size) {
		int i=0;
		System.out.print("중복되지 않은 숫자 3개를 입력하세요(1~9) : ");
		while(i++ < size) {//i가 0일때 size(3)과 비교 다른경우 i++ 1에 값을 저장되는 식
			user.add(scan.nextInt());
			// i++; 그저 반복을 하기위해서 사용 위에 while의 조건에 바로 적용가능
		}
		i=0;
		List<Integer> tmpList = new ArrayList<Integer>();
		while(user.size() != 0) {
			int tmp = user.remove(0);
			if(tmp<min || tmp > max || user.contains(tmp)) {
				/* 입력받은 수(tmp)가 min보다 작거나 max보다 크거나 중복이 되는 경우 */
				return false;
			}
			tmpList.add(tmp);//중복된게 없으면저장
		}
		//user = tmpList; => 이렇게 작성할 경우 원본에 tmpList값이 추가되지 않음 아래의 코드를 사용해야 원본에 추가됨		
		user.addAll(tmpList);
		return true;
	}


}
