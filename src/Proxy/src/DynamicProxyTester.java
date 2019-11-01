import java.lang.reflect.Proxy;
import java.util.Map;

public class DynamicProxyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drivable proxyInstance = (Drivable) Proxy.newProxyInstance(
				Motorcycle.class.getClassLoader(), 
				  new Class[] { Drivable.class }, 
				  new DynamicLoggerProxy(new Motorcycle(new Driver(18,"HD man"))));
		
		proxyInstance.drive();
	}

}
