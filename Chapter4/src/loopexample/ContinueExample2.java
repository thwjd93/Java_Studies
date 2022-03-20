package loopexample;

public class ContinueExample2 {

	public static void main(String[] args) {

		int dan;
		
		for(dan = 2; dan <= 9; dan++) {  
			int times = 1;
			if((dan % 2) != 0) { // ==1 or != 0 같은 의미, 다른 표현.
				continue; //홀수인 경우 증감식으로 직행(continue)
			}
			for(; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println( );
		}
	}
}
