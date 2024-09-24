package org.designpatterns.creational.factory_method_5.vehicle_impl;

import org.designpatterns.creational.factory_method_5.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("driving bike..");
    }
}
