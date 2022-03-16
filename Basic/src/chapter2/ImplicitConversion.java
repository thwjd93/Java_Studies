package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNUM = 10; // bNUM은 1바이트 
		int num = bNUM; // num은 4바이트 
		
		System.out.println(num);
		
		long lNum = 10 ; //10은 int 4바이트로 상수풀에 저장되고 8바이트 long 대입에 문제없이 형변환 가능 
		float fNum = lNum; //float 실수는 정수보다 더 정밀한 수로 형변환 가능 
		
		System.out.println(fNum);
		
		double dNum = fNum + num ; 
		//(1) fNum과 num의 합에서 num은 float형으로 형변환
		//(2) float를 dNum에 대입하면서 2차 형변환 
		
		System.out.println(dNum);
		
	}

}
