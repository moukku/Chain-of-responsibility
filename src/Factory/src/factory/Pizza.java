package factory;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		/**	Print out :
		 * 	1. preparing pizza name
		 * 	2. dough prepairing
		 * 	3. sauce adding
		 * 	4. toppings adding
		 */
	}
	
	void bake() {
		
	}
	void cut() {
		
	}
	void box() {
		
	}
	
	public String getName() {
		return name;
	}
}
