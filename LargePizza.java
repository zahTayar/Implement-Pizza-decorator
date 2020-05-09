package excersize2;

public class LargePizza extends Pizza implements Product{

	public LargePizza() {
		super(55, 2150, "Huge pizza");
		
	}

	@Override
	public double getTotal() {
		return price;
	}

	@Override
	public Pizza getPizza() {
		return this;
	}

	

}
