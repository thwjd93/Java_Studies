package ifexample;

public class IfExample1 {

	public static void main(String[] args) {
		
		int age = 2;
		
		if(age >= 8) {   // 수행문이 하나라면 {} 안써도 인식 ok
			System.out.println("학교에 다닙니다.");  //true 라면 
		} 
		else {
			System.out.println("학교에 다니지 않습니다."); //false 라면 
		}

	}

}
