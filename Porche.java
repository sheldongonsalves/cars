
public class Porche extends Car {
	private String color;

	public Porche() {
		// TODO Auto-generated constructor stub
	}

	public String getDisplayText()
	{
		return super.toString() + "color : "+ color +"\n";
	}

	public Porche(int run ,int stop ,int accelerate ,int race ,String color1) {
		super(run,stop,accelerate,race);
		this.color =color1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color1) {
		this.color = color1;
	}


}
