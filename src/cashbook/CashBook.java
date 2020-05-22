package cashbook;

public class CashBook {
//일시, 내용, 수입/지출, 금액, 분류를 등록
	private String date;		//일시
	private String content;		//내용
	private boolean income;		//수입지출여부 => true :수입, false :지출
	private int money;			//금액
	private String type;		//분류
	
	
	
	
	
	
	
	

	public CashBook(int income, String date, String type, String content, int money) {
		this.income = income ==0? true : false; //인컴이 0과 같으면 true 같지않으면 false
		this.date=date;
		this.type=type;
		this.content=content;
		this.money = money;
	}
	
/*메인에서 확인하기 위해서 생성*/
@Override
	public String toString() {
		return income +" " + date + " "+ type +  " " + content +   " " + money ;
	}
	/*private으로 객체를 생성했기 때문에 get , set 을 생성*/	
	public String getDate() {		return date;	}
	public void setDate(String date) {		this.date = date;	}
	public String getContent() {		return content;	}	
	public void setContent(String content) {		this.content = content;	}
	public boolean isIncome() {		return income;	}
	public void setIncome(boolean income) {		this.income = income;	}
	public int getMoney() {		return money;	}
	public void setMoney(int money) {		this.money = money;	}
	public String getType() {	return type;	}
	public void setType(String type) {		this.type = type;	}
	
	
	
}
