package day20;

import java.util.*;

public class WordbookEx1 {

	public static void main(String[] args) {
/*  영어 단어장 프로그램을 작성하세요.
	1. 영어 단어 등록
	2. 영어 단어 수정
	3. 영어 단어 삭제
	4. 영어 단어 검색
	5. 종료

* 메소드 = 메뉴, 단어등록, 수정, 삭제, 검색
*
*/
		Scanner scan = new Scanner(System.in);
		int menu=0;
		Word w;
		List<Word> list = new ArrayList<Word>();
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				w = inputWord(scan);
				me(scan, w);
				if(! insertWord(list, w)) {
					System.out.println("입력하신 정보는 이미 있는 단어입니다.");
				}else {
					
					System.out.println("단어를 등록하였습니다.");
				}
				break;
			
			case 2 : System.out.println("2. 영어단어 수정");
				w = inputWord(scan);
				if(! modifyWord(list, w)) {
					System.out.println("입력하신 단어는 등록되어 있지 않습니다..");
				}else {
					me(scan, w);
					System.out.println("단어를 수정하였습니다.");
				}
				break;
			
			case 3 : System.out.println("3. 영어단어 삭제");
				w = inputWord(scan);
				if(! deleteWord(list, w)) {
					System.out.println("입력하신 단어는 등록되어 있지 않습니다.");
				}else {
					System.out.println("단어를 삭제하였습니다.");
				}
				break;
			
			case 4 : System.out.println("4. 영어단어 검색");
				w = compr(scan);
				if(!com(w, list)) {
					System.out.println("입력하신 단어는 등록되어 있지 않습니다.");
				}else {
					
					}
				
				break;
			
			case 5 : System.out.println("5. 프로그램 종료");
			
				break;
			
			default : System.out.println("올바른 메뉴가 아닙니다.");
			}
		}while(menu !=5);
		
	}
/* 메뉴프린트 기능의 메소드 생성 */
	public static void printMenu() {
		System.out.println("====== 영 어 단 어 ======");
		System.out.println("1. 영어단어 등록");
		System.out.println("2. 영어단어 수정");
		System.out.println("3. 영어단어 삭제");
		System.out.println("4. 영어단어 검색");
		System.out.println("5. 프로그램 종료");
		System.out.println("=====================");
		System.out.print("번호를 입력해 주세요 : ");
	}
	
/* 단어등록
 * 기능 : 스캐너를 통해 입력받은 단어를 저장하고 word클래스에 저장
 * 매개변수 : scanner scan
 * 리턴타입 : Word
 * 메소드명 : inputWord	 */
	public static Word inputWord(Scanner scan) {
		Word w = new Word();
		System.out.print("단어 : ");
		w.word = scan.next();
		System.out.print("의미 : ");
		String meaning = scan.next().trim();
		w.meaning.add(meaning);
		System.out.print("품사 : ");
		String wdcl = scan.next().trim();
		w.wordclass.add(wdcl);
		return w;
	}
/* 의미와 품사를 입력하는 메소드*/
	public static void me( Scanner scan, Word w) {
		
		char a;
		do{
			System.out.print("의미와 품사를 입력하시겠습니까?(y/n) : ");
			a = scan.next().charAt(0);
			switch(a) {
			
			case 'y': 
				System.out.print("의미 : ");
				String meaning = scan.next();
				w.meaning.add(meaning);
				System.out.print("품사 : ");
				String wdcl = scan.next();
				w.wordclass.add(wdcl);
				break;
			case 'n':  break;
			default: System.out.println(a+"는 잘못된 명령어입니다. y 또는 n으로 입력해주세요.");
			System.out.println();
			}
		}while(a!='n' );
	}
/* 추가등록
 * 기능 : 주어진 단어를 단어리스트에 저장하는 메소드로 이미 있는 단어는 저장하지 않고 없는 단어는 저장함
 * 매개변수 : List<Word> list, Word w 
 * 리턴타입 : boolean
 * 메소드명 : insertWord
 */
	public static boolean insertWord(List<Word> list, Word w ) {
		if(list == null || w == null) return false;	
		if(list.contains(w)) return false;
			list.add(w);
			return true;
	}
	
	
/* 단어수정
 * 기능 : 주어진 정보를 입력받아 입력되어 있는 정보가 있으면 수정하는 메소드로 단어가 없으면 수정 실패 있으면 수정성공을 알려주는 메소드
 * 매개변수 : 주어진 정보 , 입력되어 있는 정보 => Word w, List<Word> list
 * 리턴타입 : 수정여부 => boolean
 * 메소드명 : modifyWord	 */
	public static boolean modifyWord(List<Word> list, Word w) {
		if(list == null || w == null) return false;
		if(! list.contains(w)) return false;
		list.remove(w);
		list.add(w);
		return true;
	}
	
/* 단어삭제
 * 기능 : 주어진 정보를 입력받아 입력되어 있으면 정보를 삭제하고 저장된 정보가 없으면 삭제 실패를 알려주는 메소드
 * 매개변수 : 주어진 정보 , 입력되어 있는 정보 => Word w, List<Word> list
 * 리턴타입 : 삭제여부 => boolean 
 * 메소드명 : deleteWord
 */
	public static boolean deleteWord(List<Word> list, Word w) {
		if(list == null || w == null) return false;
		if(! list.contains(w)) return false;
		list.remove(w);
		return true;
	}
	
/* 단어검색
 * 기능 : 입력한 단어가 입력되어 있는 단어이면 그 내용을 검색하는 것
 * 매개변수 : Word w, ,List<Word> list
 * 리턴타입 : boolean 
 * 메소드명 : com
 */
	public static boolean com(Word w, List<Word> list) {
		if(list == null || w == null) return false;		//비어있을경우 false
		if(! list.contains(w))		return false;		//정보가 없으면 false
		
		return true;
	}
	
	public static Word compr(Scanner scan) {
		Word w = new Word();
		System.out.print("단어 : ");
		w.word = scan.next();
		return w;
	}
	
	
	
	
}
class Word{
	String word;//중복되지 않는것
	List<String> meaning= new ArrayList<String>();
	List<String> wordclass= new ArrayList<String>();
	
	
	public Word() {
	}
	
	public Word(String word, List<String> meaning, List<String> wordclass) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.wordclass = wordclass;
	}

	@Override
	public String toString() {
		String str = "단어 : " + word+"| 의미 : ";
		for(int i = 0; i<meaning.size(); i++) {
			str += meaning.get(i) + " | 품사 : " + wordclass.get(i) + " ";
		}
		return  str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)			return true;
		if (obj == null)			return false;
		if (getClass() != obj.getClass())			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)				return false;
		} else if (!word.equals(other.word))			return false;
		return true;
	}






	
	
}
