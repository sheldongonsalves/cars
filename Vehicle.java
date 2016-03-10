
public abstract class Vehicle {

	private int run;
	private int stop;
	private int accelerate;
	
	public Vehicle()
	{
		
	}
	public Vehicle(int run1, int stop1 ,int accelerate1)
	{
		
	}
	
	public String toString() {
		return "run :" +run +"\n" +
	           "stop "+ stop +"\n" +
			  "accelerate " + accelerate +"\n";
	}
	
	abstract String getDisplayText();//abstract method
	
	public int getRun() {
		return run;
	}
	public void setRun(int run1) {
		this.run = run1;
	}
	public int getStop() {
		return stop;
	}
	public void setStop(int stop1) {
		this.stop = stop1;
	}
	public int getAccelerate() {
		return accelerate;
	}
	public void setAccelerate(int accelerate1) {
		this.accelerate = accelerate1;
	}
	

}
