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
    double amount = 0;
    switch (getMovie().getPriceCode()) {
      case Movie.REGULAR:
        amount = movie.getAmount(daysRented);
        break;
      case Movie.NEW_RELEASE:
        amount += getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        amount += 1.5;
        if (getDaysRented() > 3){
          amount += (getDaysRented() - 3) * 1.5;
        }
        break;
    }
    return amount;
  }

  int getFrequentRenterPoints() {
    int frequentRenterPoints = 1;

    if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1){
      frequentRenterPoints++;
    }
    return frequentRenterPoints;
  }
}
