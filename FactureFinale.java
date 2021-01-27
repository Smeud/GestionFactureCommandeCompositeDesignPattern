import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FactureFinale implements ComportementPrixOffre, ComportementReduction {
  // Class properties
 private Collection factureFinale;
 private Collection reduction;
 //private Facture prixAvantReduction;

  // Class constructor
/*public FactureFinale(Facture prixAvantReduction) {
    this.prixAvantReduction = prixAvantReduction;
}*/
  public FactureFinale() {
    factureFinale = new ArrayList();
    reduction = new ArrayList();
  }

  // Class methods
  public void add(ComportementPrixOffre prix) {
    factureFinale.add(prix);
  }
  public void remove(ComportementPrixOffre prix) {
    factureFinale.remove(prix);
  }
  public void add(ComportementReduction prixReduit) {
    reduction.add(prixReduit);
  }
  public void remove(ComportementReduction prixReduit) {
    reduction.remove(prixReduit);
  }
  public Iterator getFacture() {
    return factureFinale.iterator();
  }
  public Iterator getReduction() {
    return reduction.iterator();
  }

  // Other methods
  @Override
  public double getPrix() {
    double prixTotal = 0;
    for (Iterator i = factureFinale.iterator(); i.hasNext(); ) {
        Object object = i.next();
        ComportementPrixOffre prix = (ComportementPrixOffre)object;
        prixTotal += prix.getPrix();
    }
    return prixTotal;
  }
  @Override
  public double getPrixReduit() {
    double reductionTotale = 0;
    for (Iterator i = reduction.iterator(); i.hasNext(); ) {
        Object object = i.next();
        ComportementReduction prixReduit = (ComportementReduction)object;
        reductionTotale += prixReduit.getPrixReduit();
    }
  return reductionTotale;
  }
  public double getTotal(double total) {
    return total;
  }
}