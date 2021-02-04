public class Coupons implements OrderDiscount {
  // Class properties
  private double discountPrice;

  // Class constructor
  public Coupons(double discountPrice) {
    this.discountPrice = discountPrice;
  }
  
  // Class getters
  @Override
  public double getDiscountPrice() {
    return this.discountPrice;
  }
}