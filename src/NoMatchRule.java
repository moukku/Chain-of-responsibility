
public class NoMatchRule extends FizzBuzzOperation implements Rule{

	private Rule nextInChain;

	
	public void setNextChain(Rule nextChain) {
		nextInChain = nextChain;}


	public void calculate(int number) {}
} 