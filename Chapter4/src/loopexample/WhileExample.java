package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
	/*	while (num <= 10) { //while 조건식 결과 값이 참이면 수행문 수행. false 일 경우에만 빠져나감.
			sum += num;  //복합 대입 연산자
			num++; //증가 감소 연산자
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		*/
		
		do { //수행문을 꼭 한번 수행해야할 때 사용. 
			sum += num;  
			num++; 
		}while(num <= 10); //조건 체크를 수행문 수행 후에 체크. 참이면 다시 do 수행
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

		
	}

}
