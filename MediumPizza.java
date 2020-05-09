package excersize2;

public class MediumPizza extends Pizza implements Product{


	public MediumPizza() {
		super(35, 1500, "Family pizza");
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
