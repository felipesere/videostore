public abstract class Movie {

	private String title;

  public Movie(String title) {
		this.title 		= title;
  }
	
	public String getTitle () {
		return title;
	}

  abstract double getAmount(int daysRented);

  int getFrequentRenterPoints(int daysRented) {
    return 1;
  }
}
