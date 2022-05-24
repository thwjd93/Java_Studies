package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student(100, "James");
		studentJames.setKorea(100); //Subject(String name) 생성자 활용 예시 
		studentJames.setMath("수학", 100);

		Student studentTomas = new Student(100, "Tomas");
		studentTomas.setKorea(80);
		studentTomas.setMath("수학", 60);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();

	}
	
}
