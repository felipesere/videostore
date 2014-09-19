public class NewReleaseMovie extends Movie {
  public NewReleaseMovie(String title, int priceCode) {
    super(title, priceCode);
  }

  public double getAmount(int daysRented) {
    return  daysRented * 3;
  }
}
