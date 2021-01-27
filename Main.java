class Main {
  public static void main(String[] args) {

    PrixInitial prixInitial = new PrixInitial(50.00);
    System.out.print("\n"+"Offer price excluding tax : ");
    System.out.print(prixInitial.getPrix()+"$");

    Shipping shipping = new Shipping(6.50);
    System.out.print("\n"+"Shipping fees : ");
    System.out.print(shipping.getPrix()+"$");

    Tva tva = new Tva(50*10/100);
    System.out.print("\n"+"Tax fees : ");
    System.out.print(tva.getPrix()+"$");

    Facture facture = new Facture();
    facture.add(prixInitial);
    facture.add(shipping);
    facture.add(tva);
    System.out.print("\n"+"Total price reduction : ");
    System.out.println(facture.getPrix()+"$");

    Vouchers voucher = new Vouchers(50*25/100);
    System.out.print("\n"+"Vouchers promotions : ");
    System.out.print(voucher.getPrixReduit()+"$");

    Coupons coupon = new Coupons(50*5/100);
    System.out.print("\n"+"Discount coupons : ");
    System.out.print(coupon.getPrixReduit()+"$");

    FactureFinale factureFinale = new FactureFinale();
    factureFinale.add(voucher);
    factureFinale.add(coupon);
    System.out.print("\n"+"Total reduction on the offer : ");
    System.out.println(factureFinale.getPrixReduit()+"$");
    System.out.println("\n"+"Total price after discount :"+" "+factureFinale.getTotal(61.5-14.0)+"$");
  }
}
