
public class BandGenerator {

	public static void main(String[] args) {
		Metal amazingNewExperimentalBand = new Progressive(new Death(new Black(new Band())));

		System.out.println("Band style is " + amazingNewExperimentalBand.getDescription());
		System.out.print("The band has " + amazingNewExperimentalBand.getEstimatedFanCount() + " potential fans");
	}

}
