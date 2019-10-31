
public abstract class AbstractNumberCommand {

	private final Chain nextChain;

	public AbstractNumberCommand(Chain nextChain) {
		this.nextChain = nextChain;
	}

	protected Chain getNextInChain() {
		if (nextChain == null)
			throw new UnsupportedOperationException("Supported operations are Add, Sub, Mult and Divide");
		else
			return nextChain;
	}

}
