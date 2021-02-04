import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FinalInvoice implements OrderPrice, OrderDiscount {
  // Class properties
 private Collection finalInvoice;
 private Collection discount;
 //private Facture prixAvantReduction;

  // Class constructor
/*public FactureFinale(Facture prixAvantReduction) {
    this.prixAvantReduction = prixAvantReduction;
}*/
  public FinalInvoice() {
    finalInvoice = new ArrayList();
    discount = new ArrayList();
  }

  // Class methods
  public void add(OrderPrice price) {
    finalInvoice.add(price);
  }
  public void remove(OrderPrice price) {
    finalInvoice.remove(price);
  }
  public void add(OrderDiscount discountPrice) {
    discount.add(discountPrice);
  }
  public void remove(OrderDiscount discountPrice) {
    discount.remove(discountPrice);
  }
  public Iterator getInvoice() {
    return finalInvoice.iterator();
  }
  public Iterator getDiscount() {
    return discount.iterator();
  }

  // Other methods
  @Override
  public double getPrice() {
    double totalPrice = 0;
    for (Iterator i = finalInvoice.iterator(); i.hasNext(); ) {
        Object object = i.next();
        OrderPrice prix = (OrderPrice)object;
        totalPrice += prix.getPrice();
    }
    return totalPrice;
  }
  @Override
  public double getDiscountPrice() {
    double totalDiscount = 0;
    for (Iterator i = discount.iterator(); i.hasNext(); ) {
        Object object = i.next();
        OrderDiscount discountPrice = (OrderDiscount)object;
        totalDiscount += discountPrice.getDiscountPrice();
    }
  return totalDiscount;
  }
  public double getTotal(double total) {
    return total;
  }
}