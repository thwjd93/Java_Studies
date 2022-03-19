package chapter3;

public class OperationEx5 {
	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 11;
		
		int result = num1 & num2; //수의 연산이 아니라 비트연산 (논리 곱은 &&) 
		System.out.println(result);
		
		int num3 = 5;
		int num4 = 10;
		
		int result2 = num3 | num4; //수의 연산이 아니라 비트 연산 (논리 합은 ||) 
		System.out.println(result2);

		int num5 = 5;
		System.out.println(num5 << 1);
		System.out.println(num5); //대입한게 아니기 때문에 num5 값은 초기화 값 그대로 
		System.out.println(num5 <<= 1);
		System.out.println(num5); //복합 대입연산자로 num5 값 변화  
		
	}

}
