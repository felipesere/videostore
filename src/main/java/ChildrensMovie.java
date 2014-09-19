public class ChildrensMovie extends Movie {
  public ChildrensMovie(String title) {
    super(title, CHILDRENS);
  }


  public double getAmount(int daysRented) {
    double amount = 1.5;
    if (daysRented > 3){
      amount += (daysRented - 3) * 1.5;
    }
    return amount;
  }
}
