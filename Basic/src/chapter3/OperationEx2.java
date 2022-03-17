package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(++num); //출력이 되는 statement 전에 ++ 실행
		System.out.println(num++); //출력이 되는 statement 후에 ++ 실행
		System.out.println(num);
				
		System.out.println(3>5); 
		int num1 = 10;
		int num2 = 5;
		boolean flag = num1 > num2;
		System.out.println(flag);
	}

}
