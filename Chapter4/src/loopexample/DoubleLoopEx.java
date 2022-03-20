package loopexample;

public class DoubleLoopEx {

	public static void main(String[] args) {
		
		int dan = 2;
		
		while(dan <= 9) {
			int times = 1; //내부 반복문을 진행하기 전에 초기화를 해주지 않으면 기존에 진행했던 상수값이 대입되어 있어 진행 불가 
			while(times <= 9) { 
				
				System.out.println(dan + " 곱하기 " + times + "는(은) " + dan * times); 
				//print에서 +는 문자 연결/결합의 의미 
				times++;
			}
			dan++;
			System.out.println( ); //한 줄 띄워서 출력 
		}
	}
}