
public class VehicleApp {

	public VehicleApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Porche car =new Porche();
		Car c =new Car();
		
		car.setAccelerate(100);
		c.setRace(160);
		car.setStop(5);
		car.setColor("red");
		car.setRun(120);
		
		car.getDisplayText();
		c.getDisplayText();
		System.out.println(car.getDisplayText());
		System.out.println(c.getDisplayText());
		
		
	}

}
