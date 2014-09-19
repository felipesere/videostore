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

    for(Rental each : rentals) {
      double thisAmount = 0;
      thisAmount += getAmount(each, thisAmount);

      frequentRenterPoints++;

      if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) frequentRenterPoints++;

      result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
      totalAmount += thisAmount;
    }

    result += "You owed " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

    return result;
  }

  private double getAmount(Rental each, double thisAmount) {
    double amount = 0;
    switch (each.getMovie().getPriceCode()) {
      case Movie.REGULAR:
        amount += 2;
        if (each.getDaysRented() > 2) {
          amount += (each.getDaysRented() - 2) * 1.5;
        }
        break;
      case Movie.NEW_RELEASE:
        amount += each.getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        amount += 1.5;
        if (each.getDaysRented() > 3){
          amount += (each.getDaysRented() - 3) * 1.5;
        }
        break;
    }
    return amount;
  }
}
