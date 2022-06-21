package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee", 101);
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.addSubject("과학", 65);
		studentLee.addSubject("사회", 80);
		
		studentLee.showStudenInfo();
		
		System.out.println("----------------");
		
		Student studentKim = new Student("Kim", 102); //학번은 static 함수 활용해서 자동증가로 설정해도 됨. (예제 연습해보기)
		studentKim.addSubject("국어", 90);
		studentKim.addSubject("수학", 40);
		studentKim.addSubject("과학", 75);
		studentKim.addSubject("사회", 85);
		
		studentKim.showStudenInfo();
	}

}
