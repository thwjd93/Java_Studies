package chapter2;

public class charVariableTest {
	
	public static void main(String[] args) {
		
		char ch = 'A'; //문자 입력 시 '' 사용, 문자열의 경우 " " 
		System.out.println(ch); 
		System.out.println((int)ch); //문자로 입력한 값을 숫자(코드) 값으로 출력해라
		
		ch = 66;
		System.out.println(ch); 
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2); //숫자(코드)로 입력한 값을 문자로 출력해라
	}

}
