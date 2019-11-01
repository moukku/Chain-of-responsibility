
public class MotorcycleProxy extends Motorcycle {

	public MotorcycleProxy(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drive() {
		if ( driver.getAge() < 18) {
			System.out.println(driver.getName() + " is too young to drive motorcycle");
		} else {
			super.drive();
		}
	}

}
