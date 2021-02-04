public class InitPrice implements OrderPrice {
  // Class properties
  private double price;

  // Class constructor
  public InitPrice(double price) {
    this.price = price;
  }
  
  // Class getters
  @Override
  public double getPrice() {
    return this.price;
  }
}