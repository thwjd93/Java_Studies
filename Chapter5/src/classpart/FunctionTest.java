package classpart;

public class FunctionTest {

	public static void main(String[] args) { //함수의 반환값이 없을 땐 반환타입 void

		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}

	public static int addNum(int n1, int n2) { //이렇게 하나의 함수를 완성했다면 '함수를 정의'했다고 함.
		int result = n1 + n2;
		return result;
	}
}
