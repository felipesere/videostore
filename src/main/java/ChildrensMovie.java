public class ChildrensMovie extends Movie {
  public ChildrensMovie(String title, int priceCode) {
    super(title, priceCode);
  }


  public double getAmount(int daysRented) {
    double amount = 1.5;
    if (daysRented > 3){
      amount += (daysRented - 3) * 1.5;
    }
    return amount;
  }
}
