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
    String result = printer.getHeader(name);

    for(Rental rental : rentals) {
      result += printer.getRentalStatement(rental);
    }

    result += printer.getFooter();

    return result;
  }

}
