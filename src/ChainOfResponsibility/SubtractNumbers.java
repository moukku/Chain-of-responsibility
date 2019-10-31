
public class SubtractNumbers extends AbstractNumberCommand implements Chain{
	
	public SubtractNumbers(Chain nextInChain) {
		super(nextInChain);
	}
	
	
	public void calculate(Numbers request) {
		if(OperationType.Subtract.equals(request.getCalculationWanted())){
			System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " + (request.getNumber1()-request.getNumber2()));
		}
		else {
			getNextInChain().calculate(request);
		}
	}

}
