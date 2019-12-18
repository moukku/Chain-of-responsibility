package factory;

public class NYStyleClamPizza extends Pizza{

	public NYStyleClamPizza() {
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
