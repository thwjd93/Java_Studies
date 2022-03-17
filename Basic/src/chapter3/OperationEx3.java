package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = (((num1 = num1 + 10) < 10) && ((i = i+2) < 10)); 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 앞 항이 false기 때문에 && 뒷 항을 실행하지 않아 i 값이 변화하지 않

		boolean value2 = (((num1 = num1 + 10) > 10) || ((i = i+2) < 10)); 
		System.out.println(value2);
		System.out.println(num1);
		System.out.println(i); // 앞 항이 true기 때문에 || 뒷 항을 실행하지 않아 i 값이 변화하지 않
		
	}

}
