import java.util.LinkedList;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new LinkedList<Rental>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental rental) {
    rentals.add(rental);
  }

  public String statement() {
    StatementPrinter printer = new StatementPrinter();
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = printer.getHeader(name);

    for(Rental rental : rentals) {
      double thisAmount = rental.getAmount();

      frequentRenterPoints += rental.getFrequentRenterPoints();

      result = printer.getRentalStatement(rental, thisAmount);
      totalAmount += thisAmount;
    }

    result += printer.getFooter(totalAmount, frequentRenterPoints);

    return result;
  }

}
