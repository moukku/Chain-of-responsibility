
public class SubtractNumbers extends FizzBuzzOperation implements Rule{
	
	private Rule nextInChain;

	public void setNextChain(Rule nextChain) {
		nextInChain = nextChain;}

	public void calculate(int number) {}

}
