package inheritance;

public class Circle {
	//합성(has - a)의 예시. 상속(is - a)과 차이점 설명.
	
	/*
	private int x;
	private int y; 
	Point와 Circle은 상속의 관계가 아님. 일반적-구체적 관계 아님. 
	그래서 class Circle extends Point 할 수 없음.
	*/
	Point point; 
	//그래서 그냥 인스턴스 선해서 사용.
	
	private int radius;
	
	public Circle() {
		point = new Point(); //이 방식은 상속이 아닌 합성.
	}
}
