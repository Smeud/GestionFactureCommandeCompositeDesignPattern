public class Shipping implements ComportementPrixOffre {
  // Class properties
  private double prix;

  // Class constructor
  public Shipping(double prix) {
    this.prix = prix;
  }
  
  // Class getters
  @Override
  public double getPrix() {
    return this.prix;
  }
}