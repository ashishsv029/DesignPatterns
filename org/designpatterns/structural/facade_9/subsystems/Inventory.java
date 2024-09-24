package org.designpatterns.structural.facade_9.subsystems;

public class Inventory {
    public boolean checkStock(String item) {
        System.out.println("Checking stock for item: " + item);
        // Assume all items are in stock for simplicity
        return true;
    }

    public void reserveItem(String item) {
        System.out.println("Reserving item: " + item);
    }
}

