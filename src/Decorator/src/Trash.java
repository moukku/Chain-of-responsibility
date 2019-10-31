
public class Trash extends Metal {

	public Trash(Genre genre) {
		super(genre);
	}

	@Override
	public String getDescription() {
		return genre.getDescription() + " characterized by its overall aggression and often fast tempo ";
	}

	@Override
	public int getEstimatedFanCount() {
		return genre.getEstimatedFanCount() + 175;
	}

}
