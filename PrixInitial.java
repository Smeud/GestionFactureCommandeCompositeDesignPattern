public class PrixInitial implements ComportementPrixOffre {
  // Class properties
  private double prix;

  // Class constructor
  public PrixInitial(double prix) {
    this.prix = prix;
  }
  
  // Class getters
  @Override
  public double getPrix() {
    return this.prix;
  }
}