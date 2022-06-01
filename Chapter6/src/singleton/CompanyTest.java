package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
	/*	Company company = new Company(); Company 생성자의 접근제어자를 private으로 제한했기 때문에 사용불가 */ 
		
		Company c1 = Company.getInstance(); //new 키워드 사용하지 않음.
		Company c2 = Company.getInstance();

		System.out.println(c1 == c2); //True, Company의 인스턴스는 private + static으로 c1 및 c2의 메모리 주소값이 동일. 
		
		Calendar cal = Calendar.getInstance(); //날짜, 시간는 이클립스에서 자동으로 싱글톤 패턴 제공.
	}
}
