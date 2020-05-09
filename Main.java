package excersize2;

public class Main {

	public static void main(String[] args) {
		Pizza p=new PersonalPizza();//make pizzas
		Pizza p1=new MediumPizza();
		Pizza p2=new LargePizza();
		System.out.println(p.getName()+"-"+p.getTotal());
		System.out.println(p1.getName()+"-"+p1.getTotal());
		System.out.println(p2.getName()+"-"+p2.getTotal());
		  
		
		Product p4=new Olives(new Mushroom(new PersonalPizza()));
		Product p5=new Tomato(new Bulgerian(new MediumPizza()));
		Product p6=new Bulgerian(new Olives(new LargePizza()));
		System.out.println(p4.getPizza().getName()+" with olives and mushrooms "+p4.getTotal());
		System.out.println(p5.getPizza().getName()+" with tomato and bulgarit "+p5.getTotal());
		System.out.println(p6.getPizza().getName()+" with bulgarit and olives "+p6.getTotal());

	}

}
