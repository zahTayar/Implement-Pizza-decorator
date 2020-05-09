package excersize2;

public abstract class Pizza implements Product {//abstract class that finally get decorate by the additions
	
	protected double price ;
	protected int calories ;
	protected String name;
	
	
	public  Pizza(int price ,int calories ,String name) {
		this.price=price ;
		this.calories=calories;
		this.name=name;
	}


	public double getPrice() {
		return price;
	}


	public int getCalories() {
		return calories;
	}


	public String getName() {
		return name;
	}


	


}
