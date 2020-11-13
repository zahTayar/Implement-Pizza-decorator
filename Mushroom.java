package excersize2;

public class Mushroom extends Decorater {

	public Mushroom(Product product) {
		super(product);
		}
	public double getTotal() {
		 return super.getTotal()+addition;
	}
	public Pizza getPizza() {
		return super.getPizza();
	}


}
