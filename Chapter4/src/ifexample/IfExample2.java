package ifexample;

public class IfExample2 {
	public static void main(String[] args) {
		
		int age = 30;
		int charge; //선언만 하고 초기화 해도 안해도 상관 없음.
		
		if(age < 8) {
			charge = 1500;
			System.out.println("미취학 아동입니다.");
		}
		else if(age < 14) {  //else를 넣지 않으면 아래 if문 모두 실행이 되어서 큰 차이가 생김. 
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("요금은 " + charge + "원 입니다."); 
		// 조건문을 돌면서 대입된 charge값을 가지고 if문을 빠져나옴.
		//출력문에서 +를 사용하면 여러 단어를 연결하여 실행가능 
		
	}

}
