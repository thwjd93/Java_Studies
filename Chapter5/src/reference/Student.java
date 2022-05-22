package reference;

public class Student {

	int studentID;
	String studentName;
	
	/*이 아래 속성은 학생 속성이라고도 볼 수 있지만 별개의 클래스로 구분가능함.
	
	int koreaScore;
	int mathScore;
	String koreaSugjectName;
	String mathSubjectName;
	
	*/

	Subject korea;
	Subject math; //클래스는 선언만 한다고 생기지 않음 
	
	public Student(int id, String name) { //참조변수 안넣어도 괜찮음 
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore()+math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
