package org.designpatterns.creational.factory_method_5.vehicle_factory_impl;

import org.designpatterns.creational.factory_method_5.Vehicle;
import org.designpatterns.creational.factory_method_5.VehicleFactory;
import org.designpatterns.creational.factory_method_5.vehicle_impl.Bike;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
