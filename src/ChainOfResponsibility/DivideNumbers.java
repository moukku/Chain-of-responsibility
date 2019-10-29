
public class DivideNumbers implements Chain{
	
	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;}

	public void calculate(Numbers request) {
		if(OperationType.Divide.equals(request.getCalculationWanted())){
			System.out.println(request.getNumber1() + " : " + request.getNumber2() + " = " + (request.getNumber1()/request.getNumber2()));
		}
		else {
			throw new UnsupportedOperationException("Supported operations are Add, Sub, Mult and Divide");
		}
	}


}
