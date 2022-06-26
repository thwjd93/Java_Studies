package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//기본 생성자, 기본 등급 실버.
	public Customer() {
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}
	
	//추가 생성자, 고객번호 및 이름 초기화.
	public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}   //결제하는 과정에서 할인(discount)는 없고 보너스 포인트 적립만 
	/*
	public void saveBonus(int price) {
		bonusPoint += price * bonusRatio;
	 */
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스포인트 적립액은 " + bonusPoint + "point 입니다.";
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
