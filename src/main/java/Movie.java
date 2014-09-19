public abstract class Movie {

	public static final int CHILDRENS	= 2;
	public static final int REGULAR 	= 0;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private int priceCode;
	
	public Movie (String title, int priceCode) {
		this.title 		= title;
		this.priceCode 	= priceCode;
	}
	
	public int getPriceCode () {
		return priceCode;
	}
	
	public String getTitle () {
		return title;
	}

  abstract double getAmount(int daysRented);

  int getFrequentRenterPoints(int daysRented) {
    int frequentRenterPoints = 1;

    if (this.getPriceCode() == NEW_RELEASE && daysRented > 1){
      frequentRenterPoints++;
    }
    return frequentRenterPoints;
  }
}
