public class Vouchers implements ComportementReduction {
  // Class properties
  private double prixReduit;

  // Class constructor
  public Vouchers(double prixReduit) {
    this.prixReduit = prixReduit;
  }
  
  // Class getters
  @Override
  public double getPrixReduit() {
    return this.prixReduit;
  }
}