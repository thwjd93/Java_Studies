package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5]; 
		// 책이 저장될 주소 공간 5개가 생성.
		// 각 배열의 요소를 초기화하지 않으면 null 값.
		
		library[0] = new Book("해리포터1", "J.K.롤링");
		library[1] = new Book("해리포터2", "J.K.롤링");
		library[2] = new Book("해리포터3", "J.K.롤링");
		library[3] = new Book("해리포터4", "J.K.롤링");
		library[4] = new Book("해리포터5", "J.K.롤링");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); 
		} //각 배열의 값이 저장되어 있는 인스턴스 주소값을 리턴.
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	
	}

}
