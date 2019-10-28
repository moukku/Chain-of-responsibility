
public class TestCalcChain {

	public static void main(String [] args) {
		
		Rule addNumbers = new BuzzRule();
		Rule subtractNumbers = new SubtractNumbers();
		Rule multiplyNumbers = new MultiplyNumbers();
		Rule divideNumbers= new NoMatchRule();

		addNumbers.setNextChain(subtractNumbers);
		subtractNumbers.setNextChain(multiplyNumbers);
		multiplyNumbers.setNextChain(divideNumbers);
		
	}
	
}
