
public class Doom extends Metal {

	public Doom(Genre genre) {
		super(genre);
	}

	@Override
	public String getDescription() {
		return genre.getDescription() + " thicker or heavier sound than other heavy metal genres ";
	}

	@Override
	public int getEstimatedFanCount() {
		return genre.getEstimatedFanCount() + 40;
	}

}
