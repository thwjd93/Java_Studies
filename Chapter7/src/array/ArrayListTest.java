package array;

import java.util.ArrayList; //Command + Shift + 'O', 자동으로 ArrayList 클래스 import.

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); 
		//general 타입에서 타입을 명시하지 않아도 되는 경우 있음.
		//타입을 명시하지 않으면 컴파일러가 최상위형태인 object로 인식.
		//(String)list.get(i) 이런식으로 직접 캐스팅 필요.
		list.add("AAA"); //String으로 선언했기 때문에 배열 요소는 자동으로 String 형태여야 함.  
		list.add("BBB");
		list.add("CCC");
		
		for(String s : list) { //enhanced for loop
			System.out.println(s);
		}
		
		for(int i = 0; i<list.size(); i++) { //ArrayList 메서드 활용.
			System.out.println(list.get(i)); //list[i] 불가. ArrayList 클래스에서는 인덱스 연산자를 제공하지 않음.
		}
	}
 
}
