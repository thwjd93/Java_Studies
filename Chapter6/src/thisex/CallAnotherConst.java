package thisex;

class Person {
	
	String name;
	int age;

	public Person() {
		//Constructor Call 앞에 다른 statement가 올 수 없음.
		this("이름없음", 1); //아래 있는 다른 생성자를 가져와서 초기값 설정 가능. (name, age) 매개변수 타입과 갯수가 맞으면 자동으로 불러와짐.
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { //자기 자신을 리턴할 때는 자료형은 해당 클래스 
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person john = new Person();
		System.out.println(john.name);
		
		System.out.println(john.returnSelf());
	}
}
