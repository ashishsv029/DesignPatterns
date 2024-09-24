package org.designpatterns.structural.facade_9;

import org.designpatterns.structural.facade_9.subsystems.Inventory;
import org.designpatterns.structural.facade_9.subsystems.Payments;
import org.designpatterns.structural.facade_9.subsystems.Shipping;

public class ShoppingFacade {
    private Inventory inventory;
    private Payments payment;
    private Shipping shipping;

    public ShoppingFacade(Inventory inventory, Payments payment, Shipping shipping) {
        this.inventory = inventory;
        this.payment = payment;
        this.shipping = shipping;
    }

    public void placeOrder(String item, String paymentDetails) {
        if (inventory.checkStock(item)) {
            inventory.reserveItem(item);
            payment.processPayment(paymentDetails);
            shipping.arrangeShipping(item);
            System.out.println("Order placed successfully for item: " + item);
        } else {
            System.out.println("Item out of stock: " + item);
        }
    }
}