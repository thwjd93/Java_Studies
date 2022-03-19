package chapter3;

public class OperationEx4 {
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1 += 1); //왼쪽항에 오른쪽항 값을 더하고 왼쪽항에 다시 대입
		//실제 변수의 값이 변한다는 점에서 대입연산자와 다름 
		
		System.out.println(num1 %= 10); //현재 num1에는 위에 대입된 11이 있음. 10으로 나눈 나머지를 왼쪽항에 다시 대입 
		num1 -= 1; // num1 = num1 - 1
		System.out.println(num1);
		
		int num = (5 > 3)? 10:20;
		System.out.println(num);
	}

}
