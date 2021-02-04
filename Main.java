class Main {
  public static void main(String[] args) {

    InitPrice initPrice = new InitPrice(50.00);
    System.out.print("\n"+"Offer price excluding tax : ");
    System.out.print(initPrice.getPrice()+"$");

    ShippingFees shippingFees = new ShippingFees(6.50);
    System.out.print("\n"+"Shipping fees : ");
    System.out.print(shippingFees.getPrice()+"$");

    TaxFees tva = new TaxFees(50*10/100);
    System.out.print("\n"+"Tax fees : ");
    System.out.print(tva.getPrice()+"$");

    Invoice invoice = new Invoice();
    invoice.add(initPrice);
    invoice.add(shippingFees);
    invoice.add(tva);
    System.out.print("\n"+"Total price before discount : ");
    System.out.println(invoice.getPrice()+"$");

    Vouchers voucher = new Vouchers(50*25/100);
    System.out.print("\n"+"Vouchers promotions : ");
    System.out.print(voucher.getDiscountPrice()+"$");

    Coupons coupon = new Coupons(50*5/100);
    System.out.print("\n"+"Discount coupons : ");
    System.out.print(coupon.getDiscountPrice()+"$");

    FinalInvoice finalInvoice = new FinalInvoice();
    finalInvoice.add(voucher);
    finalInvoice.add(coupon);
    System.out.print("\n"+"Total reduction on the offer : ");
    System.out.println(finalInvoice.getDiscountPrice()+"$");
    System.out.println("\n"+"Total price after discount :"+" "+finalInvoice.getTotal(61.5-14.0)+"$");
  }
}
