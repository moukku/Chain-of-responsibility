
public class MultiplyNumbers extends AbstractNumberCommand implements Chain{

	public MultiplyNumbers(Chain nextInChain) {
		super(nextInChain);
	}
	
	
	public void calculate(Numbers request) {
		if(OperationType.Multiply.equals(request.getCalculationWanted())){
			System.out.println(request.getNumber1() + " x " + request.getNumber2() + " = " + (request.getNumber1()*request.getNumber2()));
		}
		else {
			getNextInChain().calculate(request);
		}
	}
}
