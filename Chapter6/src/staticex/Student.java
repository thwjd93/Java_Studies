package staticex;

public class Student {
	
	private static int serialNum = 10000; //어떤 인스턴스이든 공유하는 변수. 클래스 변수.
	
	String studentjName;
	int studentID; //인스턴스 변수.
	
	public Student() {
		this.studentID = ++serialNum; 
		//student 클래스를 생성할때마다 자동으로 학번이 1씩 증가.
		//이렇게 생성자 안에 넣어주지 않으면 모든 student의 기본 학번은 static 변수에 저장된 10000.
	}

	public static int getSerialNum() {
		return serialNum;
	}
	
}
