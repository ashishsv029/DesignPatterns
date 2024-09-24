package org.designpatterns.structural.flyweight_10;
/*
The Flyweight Pattern is a structural design pattern used to minimize memory usage or computational expenses by sharing as much data as possible with similar objects
It uses shallow copy kind of reference to reduce memory by sharing the same intrinsic state with all the instances
 */

import org.designpatterns.structural.flyweight_10.flyweight_registry_impl.FlyweightRegistryImpl;

/*
     -> Intrensic state of the object:- Some properties values are common across different instances (ex:- Bullet image, dimensions)
           -> It is also called as Flyweight
     -> Extrensic state of the object:- Properties values that are different for every instance of the object (ex:- speed, direction)

        You need to maintain a Registry of Intrinsic states of many types based on unique values
        private Map<String, UserIntrinsicState> registry = new HashMap<>();

       here String will be emailId, we strore intrinsic states of many users using their mail ID, so while creating many instance of a particular user the User (Extrensic) class can be instantiated with extrensic properties along with email Id with which we can retrieve the intrensic object and hold a reference for it
 */
public class Client {
    public static void main(String[] args) {
        FlyweightRegistry flyweightRegistry = new FlyweightRegistryImpl();
        flyweightRegistry.addFlyweight(new UserIntrinsicState("ashish", 23, "male", "ashishsv028@gmail.com", "781091010"));
        UserExtrinsicState user1 = new UserExtrinsicState(Colour.BLACK, 0,  flyweightRegistry.getFlyweight("ashishsv028@gmail.com"));
    }
}
