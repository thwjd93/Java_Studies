package array;

public class ObjectArrCopy {

	public static void main(String[] args) {
		
		//얕은 복사 
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
		bookArray1[0] = new Book("HarryPotter1", "J.K.Rolling");
		bookArray1[1] = new Book("HarryPotter2", "J.K.Rolling");
		bookArray1[2] = new Book("HarryPotter3", "J.K.Rolling");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		
		for(int i = 0; i < bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
		} //book 인스턴스 값이 저장되어있는 주소값 
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		
		bookArray1[0].setBookName("Diablo");
		bookArray1[0].setAuthor("Blizzard");
		
		System.out.println("-----BookArray1-----");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("-----BookArray2-----");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		} 
		//bookArray2[0]도 bookArray1[0]과 같이 값이 바뀜.
		//인스턴스 주소값을 복사해오는 것이기 때문에(얕은 복사) 해당하는 인스턴스 멤버 값이 바뀌면 자동으로 바뀜. 
	}

}
