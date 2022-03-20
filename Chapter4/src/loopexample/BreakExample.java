package loopexample;

public class BreakExample {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
	/*	for (num = 1; ; num++) {
			
			sum += num;
			
			if(sum >= 100) break;
				
		} */ //혼자 작성해봄. 틀리진 않음. for와 while 중 어떤 반복문을 쓰는게 유용한지는 상황에 대한 공부가 필요. 
		
		while (sum < 100) {
			sum += num;
			if(sum >= 100) break;
			num++;
		}
		System.out.println("1과 사이에 있는 수를 더해 합이 첫번째로 100을 넘는 수는 " + num + "입니다.");
	}

}
