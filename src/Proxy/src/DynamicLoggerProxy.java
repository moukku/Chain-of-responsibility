import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class DynamicLoggerProxy implements InvocationHandler {
	private static Logger LOGGER = Logger.getLogger(
			DynamicLoggerProxy.class.getName());
	private Motorcycle moto;
	
	public DynamicLoggerProxy(Motorcycle motorcycle) {
		moto = motorcycle;
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		LOGGER.info("Invoked method: " + method.getName());
		method.invoke(moto, args);
		return null;
	}
}

