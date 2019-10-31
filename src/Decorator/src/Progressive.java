
public class Progressive extends Metal {

	public Progressive(Genre genre) {
		super(genre);
	}

	@Override
	public String getDescription() {
		return genre.getDescription() + " experimental, cerebral or pseudo-classical ";
	}

	@Override
	public int getEstimatedFanCount() {
		return genre.getEstimatedFanCount() + 300;
	}

}
