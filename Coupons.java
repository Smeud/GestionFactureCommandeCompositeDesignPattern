public class Coupons implements ComportementReduction {
  // Class properties
  private double prixReduit;

  // Class constructor
  public Coupons(double prixReduit) {
    this.prixReduit = prixReduit;
  }
  
  // Class getters
  @Override
  public double getPrixReduit() {
    return this.prixReduit;
  }
}