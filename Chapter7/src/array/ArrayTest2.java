package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 0.0;
		double total2 = 0.0;
		
		for(int i = 0; i < num.length; i++) {
			total += num[i];
			total2 *= num[i]; 
		}

		System.out.println(total);
		System.out.println(total2);
		//데이터값이 없는 배열의 공간은 0 혹은 null로 초기화되어 있어 각 데이터 값을 곱하면 0이 나옴.

		
		double total3 = 1;
		for(int i = 0; i < size; i++) {
			total3 *= num[i];
		}

		System.out.println("total = " +total3); //6000.0
		//유효한 사이즈의 데이터만 가지고 메서드를 만들고 싶을때 size를 사용하면 헷갈리지 않을 수 있음.

		
	}

}
