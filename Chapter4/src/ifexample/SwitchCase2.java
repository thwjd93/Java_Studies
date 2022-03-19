package ifexample;

public class SwitchCase2 {
	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
					 break; 
					 //break를 넣지 않으면 case 1에서 만족했기 때문에 medalColor 대입 실행하는데 break가 있는 행까지 실행 
					 //switch-case문에는 꼭 break를 넣어줘야 함.
				
			case 2 : medalColor = 'S';
					 break;
			
			case 3 : medalColor = 'B';
					 break;
					
			default : medalColor = 'A';
		}
		
		System.out.println(rank + "등 메달 색깔은 " + medalColor + " 입니다.");
	}

}
