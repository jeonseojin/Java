package day21;

import java.util.*;

public class EnglishMain {

	public static void main(String[] args) {
		List<Word> list = new ArrayList<Word>();	//비어있는 단어장
		Scanner scan = new Scanner(System.in);
		Word word = null;	//추가, 수정, 삭제, 검색에서 사용할 임시 단어
		char menu = '1'; 	//선택된 메뉴

		do {
			printmenu();
			menu = scan.next().charAt(0);
			
			switch(menu) {
			case '1':
				System.out.println("===============================");
				System.out.println("추가할 단어와 품사와 의미를 입력하세요.");
				word = inputAllWord(scan);
				System.out.println("===============================");
				if(insertWord(list, word)) {
					System.out.println("단어장에 단어를 추가했습니다.");
				}else {
					System.out.println("단어장에 단어를 추가하지 못했습니다.");
				}
				System.out.println("===============================");
				break;
			case '2':
				System.out.println("===============================");
				System.out.println("수정할 단어와 품사와 의미를 입력하세요.");
				word = inputAllWord(scan);
				System.out.println("===============================");
				if(modifyWord(list, word)) {
					System.out.println("단어장에 단어를 수정했습니다.");
				}else {
					System.out.println("단어장에 단어를 수정하지 못했습니다.");
				}
				System.out.println("===============================");
				break;
			case '3':
				System.out.println("===============================");
				System.out.println("삭제할 단어를 입력하세요.");
				word = inputSearchWord(scan);
				System.out.println("===============================");
				if(deleteWord(list, word)) {
					System.out.println("단어장에 단어를 삭제했습니다.");
				}else {
					System.out.println("단어장에 단어를 삭제하지 못했습니다.");
				}
				System.out.println("===============================");
				break;
			case '4':
				System.out.println("===============================");
				System.out.println("검색할 단어를 입력하세요.");
				word = inputSearchWord(scan);
				System.out.println("===============================");
				Word tmp = searchWord(list, word);
				if(tmp !=null) {
					System.out.println("단어장에서 단어를 불러왔습니다.");
					System.out.println(tmp);
				}else {
					System.out.println("단어장에 "+word.word+"가(이) 없습니다.");
				}
				System.out.println("===============================");
				break;
			case '5':
				System.out.println("===============================");
				System.out.println("프로그램을 종료합니다!!!");
				System.out.println("===============================");
				break;
				
			default: 
				System.out.println("===============================");
				System.out.println("잘못된 메뉴를 선택했습니다");
				System.out.println("===============================");
			}
			
		}while(menu != '5');
	}
	public static void printmenu() {
		System.out.println("===============================");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 단어 검색");
		System.out.println("5. 종료");
		System.out.println("===============================");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
/* 단어장에단어추가
 * 기능 : 단어장(리스트)에 단어를 추가하는 메소드로 단어장에 추가하면 true를 추가하지 못하면 false를 반환한다.
 * 매개변수 : 단어장, 단어 => List<Word> list, Word word
 * 리턴타입 : true or false => boolean 
 * 메소드명 : insertWord	 */
	public static boolean insertWord(List<Word> list, Word word) {
		if( list == null /*단어장이 없거나*/|| word == null /*단어가없거나*/|| list.contains(word)/*이미 있는단어이면*/) return false;/*처리하지않겠다*/
		list.add(word);/*위의 경우가 아니면 추가하겠다.*/
		return true;
	}
	
/* 단어생성
 * 기능 : 단어, 품사, 뜻을 입력받아 단어를 만들어 반환하는 메소드
 * 매개변수 : 스캐너 => Scanner scan (매개변수로 따로 넣지않고 메소드 내에서 생성해도 상관없음)
 * 리턴타입 : 단어 => Word
 * 메소드명 : inputAllWord	 */
	public static Word inputAllWord(Scanner scan) {
		Word word = new Word();/*최종적으로 반환할 단어*/
		char menu = 'y';/*품사와 의미를 계속 추가할건지 알려주는 변수*/
		String tmp = "";/*next는 공백을 인식하지 않기 때문에 전에 있던 엔터를 판단하기 위해서*/
		
		System.out.print("단어 : " );
		word.word = scan.next();
		
		do {
			
			System.out.print("품사 : " );
			while(true) {
				tmp = scan.nextLine();
				if(tmp.trim/*공백을 제거하는 명령어 시작과 끝의 공백을 제거*/().length()!=0/*엔터가아닌다른글자가 있을경우*/) {
					break;/*아닌경우빠져나가라*/
				}
			}
			word.WordClass.add(tmp);
			
			System.out.print("의미 : " );
			while((tmp = scan.nextLine()).trim().length() == 0);//위의 while문을 한줄로 줄인것
/* 스캐너를 통해서 tmp를 입력받고 => 입력받은 tmp의 양쪽끝 공백을 제거하고 => tmp의 길이를 확인했을때 => 저장된 글자가 없을 경우 => 다시 tmp를 입력받는다 */
			word.meaning.add(tmp);
			
			
			System.out.print("품사와 의미를 더 입력하시겠습니까?(y/n) : " );
			menu = scan.next().charAt(0);
			
			
		}while(menu =='y' || menu =='Y');
		return word;
	}
	
/* 검색기능
 * 기능 : 단어장에 해당 단어가 있으면 검색해서 단어를 반환하고 없으면 null을 반환하는 메소드
 * 매개변수 : 단어장, 검색단어 => List<Word> list, Word word
 * 리턴타입 : 검색된 단어 => Word
 * 메소드명 : searchWord	 */
	public static Word searchWord(List<Word> list, Word word) {
		if(list == null || word == null) return null;

/*contains는 전체에 포함된것이기에 사용하지않고 향상된 반복문을 사용하여 같은 단어를 찾는다
 * 향상된 for문으로 list에 있는 단어들을 하나씩 가져와서 tmp에 연결*/
		for(Word tmp : list) {

/*단어장에서 꺼내온 단어 tmp와 검색 단어 word를 비교하여 같으면 단어장에서 꺼내온 단어를 반환*/
			if(tmp.equals(word)) return tmp;
		}

/*단어장을 다 확인했는데 검색 단어 word가 없으면 null을 반환*/
		return null;
	}
	
/* + 검색기능 
 * 기능 : 스캐너를 통해 검색어를 입력하여 검색어를 단어로 변환하여 반환하는 메소드 
 * 매개변수 : 스캐너  => Scanner scan
 * 리턴타입 : 검색어로 만들어진 단어 =>Word
 * 메소드명 : inputsearchWord	(Allword는 전체 word는 검색단어)	 */
	public static Word inputSearchWord(Scanner scan) {
		System.out.print("단어 : ");
		return new Word(scan.next(),null,null);
		/*객체를 만들어 스캐너를 통해 입력받은 단어를 검색 */
	}
	
	
/* 삭제기능
 * 기능 : 단어장에 삭제하려는 단어가 있으면 삭제하고 true를 반환, 없으면 false를 반환하는 메소드
 * 매개변수 : 단어장, 삭제하려는 단어 =>  List<Word> list, Word word
 * 리턴타입 : 리턴타입 => boolean 
 * 메소드명 : deleteWord	 */
	public static boolean deleteWord( List<Word> list, Word word) {
		if(list == null || word == null)	return false; 
		return list.remove(word);/*리무브자체가 boolean형이라서 따로 중복확인을 하지 않아도 됨*/
		
	}
	
/* 수정
 * 기능 : 수정할 단어가 주어지면 단어장에서 해당 단어를 찾아 단어를 교체하면(덮어씌기) true를 반환하고
 * 			교체하지 못하면 false를 반환하는 메소드
 * 매개변수 : 단어장, 수정할 단어 =>  List<Word> list, Word word
 * 리턴타입 : 수정여부 => boolean
 * 메소드명 : modifyWord	 */
	public static boolean modifyWord( List<Word> list, Word word) {
		if(list == null || word == null || !list.contains(word)) return false;
		list.remove(word);
		list.add(word);
		return true;
	}
	
	
	
}





class Word{

/* 클래스를 생성할 경우에는
 * 객체를 선언
 * 기본생성자와 기본생성자오버로딩을 만듬
 * 메인클래스에서 출력할 수 있도록 투스트링을 통해서 메소드생성
 * 같은 단어가 있는지 없는지를 확인 할 수 있도록 이퀄스(+해쉬코드) 메소드를 생성해줌
 * 
 * 그후 메인클래스에서 메소드를 생성하여 기능을 부여해줄때 단어클래스를 활용하면 됨.
 */
	
	String word;										// 단어
	List<String> meaning = new ArrayList<String>();		// 뜻
	List<String> WordClass = new ArrayList<String>();	// 품사

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
	@Override
	public String toString() {		// 사용하지 않을경우 출력할때 제대로 출력되지 않음
		String str = "단어 : " + word + "\n";
		for(int i = 0;i < meaning.size(/*문자열은 length list는 size*/);i++){
			str +=/*str의 뒤에 이어붙이겠다는 의미*/ (i+1)+". "+WordClass.get(i) + " " + meaning.get(i) + "\n";
		}
		return str;
	}
	public Word() {}
	public Word(String word, List<String> meaning, List<String> wordClass) {
		super();
		this.word = word;
		this.meaning = meaning;
		WordClass = wordClass;
	}
	
	
	
}