package factory;

public class ChigagoStyleVeggiePizza extends Pizza{
	
	public ChigagoStyleVeggiePizza() {
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
