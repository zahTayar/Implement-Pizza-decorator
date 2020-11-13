package excersize2;

public class Bulgerian extends Decorater{

	public Bulgerian(Product product) {
		super(product);
	}
	public double getTotal() {
		return super.getTotal()+addition;
	}
	public Pizza getPizza() {
		return super.getPizza();
	}
}