public class ShippingFees implements OrderPrice {
  // Class properties
  private double price;

  // Class constructor
  public ShippingFees(double price) {
    this.price = price;
  }
  
  // Class getters
  @Override
  public double getPrice() {
    return this.price;
  }
}