public class Rental {

	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented () {
		return daysRented;
	}
	
	public Movie getMovie () {
		return movie;
	}
	
	private Movie movie;
	private int daysRented;

  double getAmount() {
    return movie.getAmount(daysRented);
  }

  int getFrequentRenterPoints() {
    return getFrequentRenterPoints(daysRented);
  }

  private int getFrequentRenterPoints(int daysRented) {
    int frequentRenterPoints = 1;

    if (getMovie().getPriceCode() == Movie.NEW_RELEASE && daysRented > 1){
      frequentRenterPoints++;
    }
    return frequentRenterPoints;
  }
}
