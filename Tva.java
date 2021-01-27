public class Tva implements ComportementPrixOffre {
  // Class properties
  private double prix;

  // Class constructor
  public Tva(double prix) {
    this.prix = prix;
  }

  // Class getters
  @Override
  public double getPrix() {
    
    return this.prix;
  }
}