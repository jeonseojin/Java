package day18;

import java.util.*;



public class TestEx3 {

	public static void main(String[] args) {
/* 3. 영어 사전을 프로그램을 만들려고 한다. 이때 단어를 저장할 수 있는 클래스를 생성해 보시오.(기능구현 x)
 * 단어 클래스 
 * 	- 단어, 품사, 뜻을 관리하는 클래스
 */
	}
}
class Word{
	String word;
/*	String wordClass[];
	String meaning[];	*/
	List<String> wordClass = new ArrayList<String>();
	List<String> meaning = new ArrayList<String>();
/* 단어는 중복되면 안되기 떄문에, 해당하는 단어와 같은 지를 판별하는 equals가 필요하다.
 * 	=> 단어만 비교	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meaning == null) ? 0 : meaning.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		result = prime * result + ((wordClass == null) ? 0 : wordClass.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)			return true;
		if (obj == null)			return false;
		if (getClass() != obj.getClass())			return false;
		Word other = (Word) obj;
		if (meaning == null) {
			if (other.meaning != null)				return false;
		} else if (!meaning.equals(other.meaning))			return false;
		if (word == null) {
			if (other.word != null)				return false;
		} else if (!word.equals(other.word))			return false;
		if (wordClass == null) {
			if (other.wordClass != null)				return false;
		} else if (!wordClass.equals(other.wordClass))			return false;
		return true;
	}
	
}
class Dic{
	List<Word> list = new ArrayList<Word>();
	// 단어 추가
	// 단어 수정 => 품사 수정하거나 뜻을 수정
	// 단어 삭제
	// 사전 출력 => 한 단어의 정보를 출력하거나 특정 단어가 들어간 단어들을 출력
}