package org.designpatterns.structural.decorator_7.example2_communicators;


/*
Decorator Pattern:-
     -> Extending the functionality of a class during run time (This pattern avoids Class Explosion).
     -> The decorator class wraps the target object and delegates calls to target object appropriately
     -> Class Explosion means creating new classes for the sake of getting combined behaviour
     -> for ex:- let say currently we have 3 communication ways i.e only do email, only do phone , only do slack message
     -> let say in future we got a requiremnt to comunicate via both email and phone. U can call both classes function from client
     -> but disturbing/modifying client's code is not correct. So we created a new class that calls both email and phone
     -> Next day they asked us to communicate via slack and email, for this we again created a new class that calls both email and slcak
     -> So this is how classes are unnecessarily increasing causing class explosion
     -> So we need to have a way to combine any number of classes functionality dynamically
     -> This is possible by creating decorators which relies on an oops principle called as Composition
 */

public interface Communicator {
    void send(String target, String message);
}
