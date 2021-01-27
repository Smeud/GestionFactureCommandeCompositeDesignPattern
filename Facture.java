import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Facture implements ComportementPrixOffre {
  // Class properties
  private Collection facture;

  // Class constructor
  public Facture() {
    facture = new ArrayList();
  }

  // Class methods
  public void add(ComportementPrixOffre prix) {
    facture.add(prix);
  }
  public void remove(ComportementPrixOffre prix) {
    facture.remove(prix);
  }
  public Iterator getFacture() {
    return facture.iterator();
  }

  // Other methods
  @Override
  public double getPrix() {
    double prixTotal = 0;
    for (Iterator i = facture.iterator(); i.hasNext(); ) {
        Object object = i.next();
        ComportementPrixOffre prix = (ComportementPrixOffre)object;
        prixTotal += prix.getPrix();
    }
    return prixTotal;
  }
} 