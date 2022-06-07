package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//기본 자료형 배열 복사 
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {10,20,30,40,50};
		
		System.arraycopy(arr1, 0, arr2, 2, 3);
		//(복사할 배열, 복사할 첫번째 위치, 붙여넣을 배열, 붙여넣을 위치, 복사할 요소 개수)
		//복사할 배열의 요소개수가 붙여넣을 배열의 공간 수보다 많을 경우 오류 발생.
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
