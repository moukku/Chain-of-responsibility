
public class Black extends Metal {

	public Black(Genre genre) {
		super(genre);
	}

	@Override
	public String getDescription() {
		return genre.getDescription() + " fast tempo, a shrieking vocal style ";
	}

	@Override
	public int getEstimatedFanCount() {
		return genre.getEstimatedFanCount() + 800;
	}

}
