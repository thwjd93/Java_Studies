package inheritance;

public class VIPCustomer extends Customer { //상위 클래스의 기능을 사용 가능.
	
	private int agentID; //담당 상담원 ID
	private double discountRatio;
	
	
	//기본 생성자, 기본 등급 실버.
	public VIPCustomer() {
		
		customerGrade = "VIP"; //상위클래스에서 custmoerGrade를 private으로 선언하면 'not visible(접근 불가)' warning. 상속 관계에서는 protected 사용.
		bonusRatio = 0.05;
		discountRatio = 0.1;
	
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public double discountPrice(int price) {
		return this.calcPrice(price) * (1 - discountRatio);
	}
}
