package classpart;

public class Student {
	
	// member variable 정의, 초기화 (property, attribute)
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

/*	public static void main(String[] args) { //메인 함수에서 각각 클래스를 불러서 메소드 실행 
		
		Student studentLee  = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		studentLee.showStudentInfo();
	}*/
}
