
public class Car extends Vehicle{
	private int race;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRace() {
		return race;
	}

	public void setRace(int race1) {
		this.race = race1;
	}

	public String getDisplayText()
	{
		return super.toString() + "race : "+ race +"\n";
	}
	
	public Car(int run ,int stop ,int accelerate ,int race1) {
		super(run ,stop ,accelerate);
		this.race =race1;
	}

	
}
