package loopexample;

public class DoubleLoopEx2 {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			
			for (times = 1; times <= 9; times++) { 
				//내부 반복문에서 초기화부분이 꼭 있어야 외부 반복문이 다시 진행될 때 새로 초기화 하고 진행
				
				System.out.println(dan + " 곱하기 " + times + "는(은) " + dan * times); 
				//print에서 +는 문자 연결/결합의 의미 
				
			}
			System.out.println( ); //한 줄 띄워서 출력 
		}
	}
}