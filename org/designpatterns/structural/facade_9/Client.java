package org.designpatterns.structural.facade_9;

import org.designpatterns.structural.facade_9.subsystems.Inventory;
import org.designpatterns.structural.facade_9.subsystems.Payments;
import org.designpatterns.structural.facade_9.subsystems.Shipping;

/*
-> Using facade we can provide a simplified interface for a complex subsystem  (set of classes/interface) based on the needs and requirements.
-> It helps to hide the complexities of the system and provides an easy-to-use interface to the client.
-> If there is no facade the client should directly interact with all the subsystems and prone to many changes later

 */
public class Client {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Payments payment = new Payments();
        Shipping shipping = new Shipping();

        ShoppingFacade shoppingFacade = new ShoppingFacade(inventory, payment, shipping);

        shoppingFacade.placeOrder("Laptop", "CreditCard: 1234-5678-9012-3456");
        // if not then client should have had all the logic which the facade is having right now
    }
}
