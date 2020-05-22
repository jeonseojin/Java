package cashbook;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CashbookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<CashBook> list = new ArrayList<CashBook>();
		
		registerCashBook(list, new CashBook(1, "2020-05-22", "식비", "점심", 5000));
		registerCashBook(list, new CashBook(1, "2020-05-21", "식비", "점심", 5000));
		registerCashBook(list, new CashBook(1, "2020-05-21", "교통비", "버스", 1400));
		registerCashBook(list, new CashBook(0, "2020-05-22", "월급", "청주학원", 1400));
		
		int cnt = 1;
		for(CashBook tmp : searchCashBook(list, 2, "지출")) {
			System.out.println(cnt++ +"."+tmp);
		}
	
		modifyCashBook(list, 4, new CashBook(1, "2020-05-23", "식비", "점심", 5000));
		
		cnt = 1;
		for(CashBook tmp : searchCashBook(list, 2, "지출")) {
			System.out.println(cnt++ +"."+tmp);
		}
	}
/* 가계부에 내용을 저장하는 내용
 * 기능 : 주어진 가계부 내역(CashBook)을 가계부(list)에 저장하는 메소드
 * 매개변수 : 가계부, 가계부 내역 => List<CashBook> list , CashBook cashBook
 * 리턴타입 : 등록여부 => boolean 으로 해도 상관 없음
 * 메소드명 : registerCashBook	 */
	public static boolean registerCashBook( List<CashBook> list , CashBook cashBook) {
		if(list == null  || cashBook==null) return false;
		list.add(cashBook);
/*저장후 정렬방법*/
		list.sort(new Comparator<CashBook>() {

			@Override
			public int compare(CashBook o1, CashBook o2) {
			/*	int year1 = Integer.parseInt(o1.getDate().substring(0, 4));
				int year2 = Integer.parseInt(o2.getDate().substring(0, 4));
				int month1 = Integer.parseInt(o1.getDate().substring(5, 7));
				int month2 = Integer.parseInt(o2.getDate().substring(5, 7));
				int day1 = Integer.parseInt(o1.getDate().substring(8, 10));
				int day2 = Integer.parseInt(o2.getDate().substring(8, 10));

 * 
 * 위의 방식을 쉽게 사용하기 위해서 분류할 곳을 정한 후 배열에 저장하여 반복문을 통해여 간단하게 정리				*/
				String arr1[] = o1.getDate().split("-");
				String arr2[] = o2.getDate().split("-");
/*split은 경계를 지정하여 분류할 수 있도록 해주는 방법*/
				for(int i =0;i<arr1.length;i++) {
/* arr의 0번지는 : 년도
 * arr의 1번지는 : 월
 * arr의 2번지는 : 일*/
					if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) return 1;
					else if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) return -1;
				}
				return 0;	
			}
		});
		return true;
	}
/* 등록작업1
 * 기능 : 스캐너를 통해 가계부 내역을 입력받아 가계부 내역을 반환하는 메소드
 * 매개변수 : 스캐너 => Scanner scan
 * 리턴타입 : 가계부 내역 => CashBook
 * 메소드명 : inputCashBook	 */
	public static CashBook inputCashBook(Scanner scan) {
		System.out.print("수입(0) , 지출(1) 여부  : ");
		int income = scan.nextInt();
		Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher m;
		String date;
		do {
			System.out.print("날짜(예 : 2020-05-22) : ");
			date = scan.next();
			m = p.matcher(date);
		}while(! m.matches());
		
		System.out.print("분류                              : ");
		String type = scan.next();
		System.out.print("내용                              : ");
		String content = "";
		while((content = scan.nextLine()).trim().length() == 0);
		System.out.print("금액 (원)             : ");
		int money = scan.nextInt();
		CashBook cashbook = new CashBook(income,date,type,content,money);
		return cashbook;
	}
/* 확인작업1
 * 기능 : 가계부에서 확인하려는 종류에 맞는 검색 결과를 리스트로 반환하는 메소드
 * 매개변수 : 가계부, 종류, 검색어 => List<CashBook>list,int kind, String search
 * 			kind = 1 : 일시 기준 분류 
 * 			kind = 2 : 수입/지출 기준 분류
 * 			kind = 3 : type 기준 분류
 * 리턴타입 : 검색된 가계부 => List<CashBook>
 * 메소드명 : 	searchCashBook	*/
	public static List<CashBook> searchCashBook(List<CashBook>list,int kind, String search){
		List<CashBook> searchlist = new ArrayList<CashBook>();
		switch(kind) {
		case 1: 
			Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
			Matcher m = p.matcher(search);
			if(! m.matches()) {
				System.out.println("날짜 형태의 검색어가 아닙니다.");
				return null;
			}
			for(CashBook tmp : list) {
				if(tmp.getDate().equals(search))
					searchlist.add(tmp);
			}
			return searchlist;
			
		case 2:
			if(! search.equals("수입")&& ! search.equals("지출")) {
				System.out.println("검색어는 수입 또는 지출이어야 합니다.");
				return null;
			}
			boolean isIncome = search.equals("수입");
			for(CashBook tmp : list) {
				if(tmp.isIncome() == isIncome)
					searchlist.add(tmp);
			}
			return searchlist;
		case 3:
			for(CashBook tmp : list) {
				if(tmp.getType().equals(search))
					searchlist.add(tmp);
			}
			return searchlist;
		}
		
		return null;		
	}
	
/* 수정작업 1
 * 기능 : 가계부에서 수정할 위치는 알려주면 수정 항목으로 수정하는 메소드
 * 리턴타입 : 수정여부 => boolean
 * 메소드명 : modifyCashBook
 * 매개변수 : 가계부 , 수정할 위치, 수정항목 => List<CashBook> list, int index, CashBook cashBook */
	public static boolean modifyCashBook(List<CashBook> list, int index, CashBook cashBook) {
		if(list == null || cashBook==null ||list.size()<index) return false;
		//list.set(index-1, cashBook);
		list.remove(index-1);
		registerCashBook(list, cashBook);
		return true;
	}
}

