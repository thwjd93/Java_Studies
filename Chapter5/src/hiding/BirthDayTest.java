package hiding;

class BirthDay {
	
	//class BirthDay의 변수는 접근 불가능하나, 메소드는 접근 가능.
	private int day; 
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		switch(month) {
			
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				if(day < 1 || day > 31) {
					System.out.println("Day Setting Error");
				} else this.day = day;
				break;
			
			case 4 : case 6 : case 9 : case 11 :
				if(day < 1 || day > 30) {
					System.out.println("Day Setting Error");
				} else this.day = day;
				break;
				
			case 2 : 
				if(day < 1 || day > 28) {
					System.out.println("Day Setting Error");
				} 
				break;
		}
		
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		
		if (month>=1 && month<=12) {
			this.month = month;	
		} else {
			System.out.println("Month Setting Error");
		}
	}
	
	public int getYear() {
		return year;
	}
	
	//set method 없이 get method만 제공해서 read only 인 변수를 만들 수 있음.
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2022);
		date.setMonth(5);
		date.setDay(24);
		
	}
	
}
