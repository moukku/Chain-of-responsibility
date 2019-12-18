package factory;

public class ChigagoStyleClamPizza extends Pizza{

	public ChigagoStyleClamPizza() {
		name="Chigago Clam Pizza";
		dough="Thick Crust Dough";
		sauce="Tomato Sauce";
 
		toppings.add("Mozzarella");
		toppings.add("Clams");
	}
 
	void cut() {
		//cut
	}
}
