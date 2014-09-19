public class StatementPrinter {
  double totalAmount = 0;
  int frequentRenterPoints = 0;

  public String getHeader(String name) {
    return "Rental Record for " + name + "\n";
  }

  public String getRentalStatement(Rental rental) {
    updateValues(rental);
    return "\t" + rental.getMovie().getTitle() + "\t" + rental.getAmount() + "\n";
  }

  private void updateValues(Rental rental) {
    frequentRenterPoints += rental.getFrequentRenterPoints();
    totalAmount += rental.getAmount();
  }

  public String getFooter(double totalAmount, int frequentRenterPoints) {
    String result = "";
    result += "You owed " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points\n";
    return result;
  }
}
