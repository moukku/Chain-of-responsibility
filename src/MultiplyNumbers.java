
public class MultiplyNumbers implements Chain{

	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;}

	public void calculate(Numbers request) {
		if(OperationType.Multiply.equals(request.getCalculationWanted())){
			System.out.println(request.getNumber1() + " x " + request.getNumber2() + " = " + (request.getNumber1()*request.getNumber2()));
		}
		else {
			nextInChain.calculate(request);
		}
	}
}
