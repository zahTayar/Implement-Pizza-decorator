package excersize2;

public class PersonalPizza extends Pizza implements Product{

	public PersonalPizza() {
		super(20, 750, "personal pizza");
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
