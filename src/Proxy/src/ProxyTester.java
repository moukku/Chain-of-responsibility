
public class ProxyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver(16,"HD-man");
		Motorcycle hd = new Motorcycle(driver);
		hd.drive();
		
		//Protect access to motorcycle
		Motorcycle hd2 = new MotorcycleProxy(driver);
		hd2.drive();
		

	}

}
