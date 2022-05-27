package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int income;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passengerCount++; //1만큼 후 증가. this 예약어를 안써도 되는 이유는 해당 메서드에서 매개변수로 쓰지 않았기 때문에 구분 안해도 됨.
		income += money;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "호선 지하철의 승객은 현재 " + passengerCount + "명이고, 현재 수입은 " 
				+ income + "원 입니다.");
	}
}
