
public class DivideNumbers extends AbstractNumberCommand implements Chain{
	
	public DivideNumbers(Chain nextInChain) {
		super(nextInChain);
	}
	
	
	public void calculate(Numbers request) {
		if(OperationType.Divide.equals(request.getCalculationWanted())){
			System.out.println(request.getNumber1() + " : " + request.getNumber2() + " = " + (request.getNumber1()/request.getNumber2()));
		}
		else {
			getNextInChain().calculate(request);
		}
	}


}
