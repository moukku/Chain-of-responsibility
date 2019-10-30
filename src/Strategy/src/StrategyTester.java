import java.util.ArrayList;
import java.util.List;

public class StrategyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Calculate> operations = new ArrayList<>();

		operations.add(new Sum());
		operations.add(new Multiply());
		operations.add(new Divide());

		
		int i = 6;
		int j = 2;

		//Java8 syntax
		operations.stream().forEach((cal)->System.out.println(cal.count(i, j)));
		
		System.out.println();
		//prior Java8
		for(Calculate cal : operations) {
			System.out.println(cal.count(i, j));
		}

	}

}
