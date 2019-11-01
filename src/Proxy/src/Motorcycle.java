
public class Motorcycle implements Drivable {

	protected Driver driver;
	public Motorcycle(Driver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	@Override
	public void drive() {
		System.out.println(driver.getName() + " is driving Motorcycle");

	}

}
