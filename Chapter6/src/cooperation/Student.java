package cooperation;

public class Student {

	String studentName; //멤버변수, 속
	int grade;
	int money;
	
	public Student(String studentName, int money) { //매개변수, 지역변
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //버스에 대한 클래스(정보)를 매개변수로 받음.
		bus.take(1000); //객체 간 협업이 일어나는 구간.
		money -= 1000; //money 값에서 1000원만큼 마이너스해서 다시 money 변수에 저장.
	}
	
	public void takeSubway(Subway subway) { 
		subway.take(1500); 
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName +"님의 잔액은 " + money +"원 입니다.");
	}
}
