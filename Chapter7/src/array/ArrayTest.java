package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[10]; 
		//자료형[] 배열이름 = new 자료형[개수];
		//길이가 정해진 배열을 생성하기만 함.
		
		int[] numbers2 = new int[] {0,1,2};  
		//int[] numbers2 = {0,1,2}도 가능하지만 자바에서 쓰는 스타일은 아님.
		//배열선언만 먼저하고 나중에 초기화를 할 경우 numbers2 = {0,1,2}는 불가능 
		//배열을 선언함과 동시에 초기화.
		System.out.println(numbers2.length); //3
		
		
		int[] numbers3 = new int[3];
		numbers3[0] = 1; //배열의 첫번째 위치는 0 
		numbers3[1] = 2;
		numbers3[2] = 3;
		
		for(int i = 0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);	//1,2,3
		}
		
		int[] studentIDs = new int[5]; //배열 내 초기 데이터 값은 int일 경우 0, double 0.0, 객체 경우 null.
		
		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
	}

}
