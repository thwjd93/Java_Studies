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

	//메소드를 사용하는 클라이언트 코드 입장에서 함수 이름 지정.
	public String getStudentName() {  //반환값이 있고 매개변수가 없는 경우.
		return studentName;
	}
	
	public void setStudentName(String name) { //반환값이 없고 매개변수가 있는 경우.
		studentName = name;
	}
/*	public static void main(String[] args) { //메인 함수에서 각각 클래스를 불러서 메소드 실행 
		
		Student studentLee  = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		studentLee.showStudentInfo();
	}*/
}
