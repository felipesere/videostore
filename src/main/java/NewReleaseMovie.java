public class NewReleaseMovie extends Movie {
  public NewReleaseMovie(String title) {
    super(title, NEW_RELEASE);
  }

  public double getAmount(int daysRented) {
    return  daysRented * 3;
  }
}
