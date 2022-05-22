package reference;

public class Subject {

	String subjectName;
	int score;
	
	public void setSubjectName(String name) {
		subjectName = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}
	
	//get, set method를 만들 수 있는 위저드(?)가 이클립스에는 제공됨.  (우클 - Source - Generate Getters and Setters)
	
}
