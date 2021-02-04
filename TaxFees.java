public class TaxFees implements OrderPrice {
  // Class properties
  private double price;

  // Class constructor
  public TaxFees(double price) {
    this.price = price;
  }

  // Class getters
  @Override
  public double getPrice() {
    
    return this.price;
  }
}