package classpart;

public class StudentTest {

	//클래스 내부에 메인함수가 있을 경우, JVM에 의해 메인함수가 가장 먼저 수행됨. 
	//객체를 구성하는데 필요한 함수가 아니기 때문에 사용하는 클라이언트 코드에 main을 입력하여 사용. 
	public static void main(String[] args) { //메인 함수에서 각각 클래스를 불러서 메소드 실행 
		//int 와 같은 자료형은 primitive data type
			
		//Student는 객체라서 property 및 기능을 정의해서 생성해서 사용
		//클래스 생성, Student()는 디폴트 생성자 형태, 매개변수를 이용해 생성자를 정의했을 경우에는 반드시 입력 
		Student studentLee  = new Student(100, "이순신"); 
		studentLee.address = "서울시 서초구 서초동"; //참조변수.멤버변수 = 대입값 
			
		Student studentKim  = new Student(101, "김유신"); 
		studentKim.studentName = "김유신"; //디폴트 생성자 이용 시 사용할 멤버 변수에 값을 대입해야 함.
		studentKim.studentID = 101;
		studentKim.address = "미국 애리조나주";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); //classpart.Student@251a69d7 ; 클래스 풀네임(패키지명.클래스명)@ 16진수 위치 값 
		System.out.println(studentKim);
	}

}
