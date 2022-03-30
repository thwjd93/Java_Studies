package classpart;

public class Student {
	
	// member variable 정의, 초기화 (property, attribute)
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public Student() {} //같은 이름의 생성자 입력 가능하나 매개변수는 달라야 함.
	
	public Student(int id, String name) { //학생이라는 객체가 생성될때 반드시 이런 특성의 객체를 만들겠다.
		studentID = id;
		studentName = name;
	}
	//이렇게 같은 이름의 생성자를 2개 이상 만드는 것을 constructor overloading이라고 함
	
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
	
	//JVM에 의해 메인함수가 가장 먼저 수행됨. 
	//객체를 구성하는데 필요한 함수가 아니기때문에 사용하는 클라이언트 코드에 main을 입력하여 사용. 
/*	public static void main(String[] args) { //메인 함수에서 각각 클래스를 불러서 메소드 실행 
		
		//int 와 같은 자료형은 primitive data type
		//Student는 객체라서 property 및 기능을 정의해서 생성해서 사용 
		
		Student studentLee  = new Student(); //클래스 생성, Student()는 디폴트 생성자 형태 
		studentLee.studentName = "이순신"; //참조변수.멤버변수 = 대입값 
		studentLee.studentID = 100;
		studentLee.address = "서울시 서초구 서초동";
		
		Student studentKim  = new Student(); //클래스 생성, Student()는 디폴트 생성자 형태 
		studentKim.studentName = "김유신"; //참조변수.멤버변수 = 대입값 
		studentKim.studentID = 101;
		studentKim.address = "미국 애리조나주";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}*/
}
