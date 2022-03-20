package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) { // 1~100까지 조건식 실행 
			
			if(num % 2 == 1) {
				continue; //홀수인 경우 증감식으로 직행(continue)
			}
			total += num; //짝수인 경우 실행되고 증감식으로 이동
		}
		System.out.println(total);
	}

}
