
public class TestCalcChain {

	public static void main(String [] args) {
		
		Chain addNumbers = new DivideNumbers();
		Chain subtractNumbers = new SubtractNumbers();
		Chain multiplyNumbers = new MultiplyNumbers();
		Chain divideNumbers= new AddNumbers();

		addNumbers.setNextChain(subtractNumbers);
		subtractNumbers.setNextChain(multiplyNumbers);
		multiplyNumbers.setNextChain(divideNumbers);
		
		Numbers request = new Numbers(4, 2, OperationType.Divide);
		addNumbers.calculate(request);
		
	}
	
}
