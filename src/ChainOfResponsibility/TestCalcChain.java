
public class TestCalcChain {

	public static void main(String[] args) {

		Chain divideNumbers = new DivideNumbers(null);
		Chain subtractNumbers = new SubtractNumbers(divideNumbers);
		Chain multiplyNumbers = new MultiplyNumbers(subtractNumbers);
		Chain addNumbers = new AddNumbers(multiplyNumbers);

		Numbers request = new Numbers(4, 2, OperationType.Divide);
		addNumbers.calculate(request);

	}

}
