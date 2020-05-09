package excersize2;

public class Tomato extends Decorater {

	public Tomato(Product product) {
		super(product);
	}
	public double getTotal() {
		return super.getTotal()+addition;
	}
	public Pizza getPizza() {
		return super.getPizza();
	}
}

