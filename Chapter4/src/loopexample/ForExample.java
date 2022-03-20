package loopexample;

public class ForExample {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) { //초기화식, 조건식, 증감식을 넣지 않으면 무한반복문이지만 무한반복은 보통 while로
			 
			sum += num;
			 
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
