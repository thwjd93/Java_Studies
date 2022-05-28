package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		// System.out.println(Student.serialNum); //static 변수의 최초값. private으로 static 변수가 설정되면 사용할 수 없음.
		System.out.println(Student.getSerialNum()); //static 변수를 private으로 설정 시 get 메소드 활용.
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		//System.out.println(Student.serialNum); //참조변수로 보통 클래스 표현 (static 변수의 출처), 인스턴스 변수로 참조 시 warning 발생. 
		System.out.println(Student.getSerialNum());
		
	}

}
