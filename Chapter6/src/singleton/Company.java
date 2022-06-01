package singleton;

public class Company {

	private Company () {} //private : 외부에서는 constructor를 사용하지 못하게 하겠다. 
	
	private static Company oneCompany = new Company(); //oneCompany는 이 프로젝트에서 유일하게 생성된 company 인스턴스
	
	public static Company getInstance() {
		if(oneCompany == null) 
			oneCompany = new Company();
		return oneCompany;
	}
}
