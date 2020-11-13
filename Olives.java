package excersize2;

public class Olives extends Decorater {

	public Olives(Product product) {
		super(product);
		}
	public double getTotal() {
		 return super.getTotal()+addition;
	}

	public Pizza getPizza() {
		return super.getPizza();
	}


}
