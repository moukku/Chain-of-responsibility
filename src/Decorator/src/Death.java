
public class Death extends Metal {

	public Death(Genre genre) {
		super(genre);
	}

	@Override
	public String getDescription() {
		return genre.getDescription() + " typically employs heavily distorted and low-tuned guitars ";
	}

	@Override
	public int getEstimatedFanCount() {
		return genre.getEstimatedFanCount() + 200;
	}

}
