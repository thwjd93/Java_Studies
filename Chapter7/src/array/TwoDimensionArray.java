package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr = /*new int[][]*/ {{1,2,3},{4,5,6}}; //행을 기준으로 열을 돌림.
		System.out.println(arr.length); 
		//2, 다차원 배열이라도 행을 기준으로 길이를 인식.
		System.out.println(arr[0].length); 
		//3, 0번 행의 길이는 열의 길이.
		
		System.out.println( ); //출력 한줄 띄움.
		
		for(int r = 0; r<arr.length; r++) {
			for(int c = 0; c<arr[r].length; c++) {
				System.out.println(arr[r][c]); //0,0 ~ 0,2 -> 1,0 ~ 1,2
			}
		}
		
		System.out.println( ); //출력 한줄 띄움.
		
		char[][] alphabets = new char[13][2]; //선언.
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length; i++) {
			for(int j = 0; j<alphabets[i].length; j++, ch++) {
				alphabets[i][j] = ch; //초기화.
				System.out.println(alphabets[i][j]);
			}
		}
		
		
	}

}
