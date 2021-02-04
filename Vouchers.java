public class Vouchers implements OrderDiscount {
  // Class properties
  private double discountPrice;

  // Class constructor
  public Vouchers(double discountPrice) {
    this.discountPrice = discountPrice;
  }
  
  // Class getters
  @Override
  public double getDiscountPrice() {
    return this.discountPrice;
  }
}