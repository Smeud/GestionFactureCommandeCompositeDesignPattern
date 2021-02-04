# Management Invoice Order Composite Design Pattern
It is an application of the Composite design pattern for invoice management of an order.

# Design Pattern Composite
Composite Design Pattern, part of the category of structural design patterns. 
This aims to organize the objects in tree structures in order to represent a hierarchy 
and allows the client part to handle a single object and a compound object in the same way. 
Consequently, this design pattern helps to isolate membership in an aggregate.

# Problem and solution
I want to develop an invoice management module for orders from customers of my online sales site. 
So, first I want to factor in the original price of the customer's order plus the shipping and tax 
charges for the current order. Then, consider if the customer has a reduction either by voucher or by 
traditional reduction coupon and subtract the sum of his reduction from the total cost of his order.

## UML Diagram
![Class Diagram](https://github.com/Smeud/GestionFactureCommandeCompositeDesignPattern/blob/master/GestionFactureClassDiagramCompositeDesignPattern.png?raw=true "Title") 
### Quickly, let's identify the different classes of our diagram:
The Component interfaces here are “OrderPrice” and “OrderDiscount”, in our case they are interfaces 
implemented by the “Invoice” and “FinalInvoice” classes which are two Composite classes. Note that the 
“FinalInvoice” class implements the two interfaces present. But hey, don't worry, later you will see why. 
Composite classes are “Invoice” and “FinalInvoice”. And all the other classes present are Element classes.

# Simulation
![Test](https://github.com/Smeud/GestionFactureCommandeCompositeDesignPattern/blob/master/SimulationDPComposite.png?raw=true"Title")
