package day4;

public class StringEx1 {

	public static void main(String[] args) {
		// 교재 206/ 207 참고!!
				String str = "홍길동";
				String str1 = new String("임꺽정");
				String arr[] = new String[3];
				arr[0] = str; //arr[0] 은 참조변수라 str이라는걸 지정해준것.
				arr[1] = str1;
				arr[2] = "이순신";
				for(String s : arr) {
					System.out.println(s);
				}

			}

		}