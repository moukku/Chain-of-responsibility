package factory;

public class ChigagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new ChigagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChigagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChigagoStyleClamPizza();
		} 
		return null;
	}

}
 