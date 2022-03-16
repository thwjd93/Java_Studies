package chapter2;

public class ExplicitConversion {
	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; //iNum의 자료형이 변환된 것이 아니라 bNum에 byte 값으로 대입된 것.
		
		System.out.println(iNum);
		System.out.println(bNum); //1바이트만 가져가다 저장했기 때문에 전혀 다른 숫자로 대입됨
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);		
		System.out.println(num1);
		System.out.println(num2); 
	}

}
