package ifexample;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int month = 10;
		int day;
		
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8: case 10 : case 12 :  //같은 수행문을 가진 경우 case 나열 가능.
				day = 31;
				break;
				
			case 2 :
				day = 28;
				break;
				
			case 4 : case 6 : case 9 : case 11 :
				day = 30;
				break;
			
			default : day = 0;
		}
		
		System.out.println(month + "월은 " + day + "일입니다.");
	}

}
