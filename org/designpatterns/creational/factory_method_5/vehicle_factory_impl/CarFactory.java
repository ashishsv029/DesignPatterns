package org.designpatterns.creational.factory_method_5.vehicle_factory_impl;

import org.designpatterns.creational.factory_method_5.Vehicle;
import org.designpatterns.creational.factory_method_5.VehicleFactory;
import org.designpatterns.creational.factory_method_5.vehicle_impl.Car;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
