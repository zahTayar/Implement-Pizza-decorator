package excersize2;

public abstract class Decorater implements Product{
	private Product product;
	public Decorater(Product product) {
		this.product=product;
	}

	public double getTotal() {
		return product.getTotal();
	}
	public Pizza getPizza() {
		return product.getPizza();
	}

}
