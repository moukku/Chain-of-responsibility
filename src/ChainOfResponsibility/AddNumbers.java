
public class AddNumbers extends AbstractNumberCommand implements Chain{

	public AddNumbers(Chain nextInChain) {
		super(nextInChain);
	}

	public void calculate(Numbers request) {
		if(OperationType.Add.equals(request.getCalculationWanted())){
			System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1()+request.getNumber2()));
		}
		else {
			getNextInChain().calculate(request);
		}
	}
} 