package chapter2;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100; //상수는 보편적으로 대문자로 
		final double PI = 3.14; //final 상수로 선언되면 수정 불가능
		
		final int STUDENT_NUM = 30; //여러번 사용되는 수치를 상수로 선언해두면 수정 시 굉장히 용의
		int num = 0;
		if ( num == STUDENT_NUM ) {}
		
		System.out.println(STUDENT_NUM) ;

	}

}
