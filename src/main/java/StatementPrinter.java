public class StatementPrinter {
  public String getHeader(String name) {
    return "Rental Record for " + name + "\n";
  }

  public String getFooter(double totalAmount, int frequentRenterPoints) {
    String result = "";
    result += "You owed " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points\n";
    return result;
  }
}
