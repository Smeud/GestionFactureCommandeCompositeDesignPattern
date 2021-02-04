import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Invoice implements OrderPrice {
  // Class properties
  private Collection invoice;

  // Class constructor
  public Invoice() {
    invoice = new ArrayList();
  }

  // Class methods
  public void add(OrderPrice price) {
    invoice.add(price);
  }
  public void remove(OrderPrice price) {
    invoice.remove(price);
  }
  public Iterator getInvoice() {
    return invoice.iterator();
  }

  // Other methods
  @Override
  public double getPrice() {
    double totalPrice = 0;
    for (Iterator i = invoice.iterator(); i.hasNext(); ) {
        Object object = i.next();
        OrderPrice price = (OrderPrice)object;
        totalPrice += price.getPrice();
    }
    return totalPrice;
  }
} 