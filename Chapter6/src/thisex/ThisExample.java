package thisex;

class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //변수는 자신과 가장 가까운것을 참조함. this를 안넣으면 바로 위에 있는 parameter를 참조하게 됨.
	}
	
	public void printThis() {
		System.out.println(this); //클래스 안에서 this는 생성된 클래스 인스턴스의 힙메모리 위치를 가리킴.
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		System.out.println(b1);
		b2.printThis();
	}

}
