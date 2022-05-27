package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james = new Student("James", 20000);
		Student tomas = new Student("Tomas", 7000);
		
		Bus bus5531 = new Bus(5531);
		james.takeBus(bus5531);
		james.showInfo();
	
		Subway subwayGreen = new Subway(2);
		tomas.takeBus(bus5531);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		
		bus5531.showInfo();
		subwayGreen.showInfo();
	}

}
