package test;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10001); //customerLee.customerID는 불가능. 멤버변수가 protected로 선언되어 있기 때문에 같은 패키지내 라면 사용가능.
		customerLee.setCustomerName("Lee");

		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10002); 
		customerKim.setCustomerName("Kim");
		
		System.out.println(customerLee.showCustomerInfo()); //해당 메서드의 반환값이 String이기 때문에 출력문 넣어줘야 함.
		System.out.println(customerKim.showCustomerInfo());
	}

}
