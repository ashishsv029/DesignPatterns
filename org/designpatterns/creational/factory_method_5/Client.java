package org.designpatterns.creational.factory_method_5;

import org.designpatterns.creational.factory_method_5.vehicle_factory_impl.BikeFactory;
import org.designpatterns.creational.factory_method_5.vehicle_factory_impl.CarFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle myCar = carFactory.createVehicle();
        Vehicle myBike = bikeFactory.createVehicle();
        myCar.drive();
        myBike.drive();
    }
}
