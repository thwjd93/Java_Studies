package classpart;

public class StudentTest {

	public static void main(String[] args) { //메인함수에서만 각 클래스의 메소드 실
		
		Student studentLee  = new Student(); //클래스에 대입 
		studentLee.studentName = "이순신";     //Student 클래스의 멤버 변수 정의 
		studentLee.address = "서울시 서초구 서초동";
	
		studentLee.showStudentInfo();        //Student 클래스의 메소드 사용 
	}

}
