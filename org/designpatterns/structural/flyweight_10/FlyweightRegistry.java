package org.designpatterns.structural.flyweight_10;

public interface FlyweightRegistry {
    // The addFlyweight method adds a flyweight object to the registry.
    void addFlyweight(UserIntrinsicState flyweight);

    // The getFlyweight method retrieves a flyweight object from the registry.
    UserIntrinsicState getFlyweight(String email);
}
