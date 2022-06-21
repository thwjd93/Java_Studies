package arraylist;

import java.util.ArrayList;

public class Student {

	 private String name;
	 private int studentID;
	 private ArrayList<Subject> subjectList;
	 
	 //생성자.
	 public Student(String name, int studentID) {
		 this.name = name;
		 this.studentID = studentID;
		 
		 subjectList = new ArrayList<Subject>(); 
		  //Student가 생성될 때 Subject List 배열도 함께 생성되도록.
	 }
	 
	 public void addSubject(String name, int score) {
		 Subject subject = new Subject(); //새로운 과목을 추가할때는 새로운 인스턴스를 먼저 생성해줘야 함.
		 subject.setName(name);
		 subject.setScore(score);
		 
		 subjectList.add(subject); //해당 메서드 안에서 subject라는 인스턴스를 생성하고 그것을 바로 list에 추가하는 과정.
	 }
	 
	 public void showStudenInfo() {
		 
		 int total = 0;
		 for(Subject subject : subjectList) { // for(int i = 0; i <subjectList.size(); i++)
			 System.out.println("학생 " + name + "님의 " + subject.getName()+ " 과목 점수는 " + subject.getScore() + "점 입니다.");
			 total += subject.getScore();
		 }
		
		 System.out.println("과목 총점 : " + total);
	 }
}
 