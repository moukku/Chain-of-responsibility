package factory;

public class NYStyleVeggiePizza extends Pizza{
	
	public NYStyleVeggiePizza() {
		name="veggie pizza";
		dough="thick Crust Dough";
		sauce="Tomato Sauce";
		
		toppings.add("Mozzarella");
		toppings.add("vegetables");
				
	}

	void cut() {
		//cut
	}
}
