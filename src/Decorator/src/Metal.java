
public abstract class Metal implements Genre {

	protected Genre genre;

	public Metal(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String getDescription() {
		return genre.getDescription();
	}

	@Override
	public int getEstimatedFanCount() {
		return genre.getEstimatedFanCount();
	}

}
