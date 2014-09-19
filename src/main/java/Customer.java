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

  public String getName() {
    return name;
  }

  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = "Rental Record for " + getName() + "\n";

    for(Rental rental : rentals) {
      double thisAmount = rental.getAmount();

      frequentRenterPoints += rental.getFrequentRenterPoints();

      result += "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
      totalAmount += thisAmount;
    }

    result += "You owed " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points\n";

    return result;
  }
}
