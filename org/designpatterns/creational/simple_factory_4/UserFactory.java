package org.designpatterns.creational.simple_factory_4;


import org.designpatterns.creational.simple_factory_4.user_impl.Admin;
import org.designpatterns.creational.simple_factory_4.user_impl.Student;
import org.designpatterns.creational.simple_factory_4.user_impl.Teacher;

public class UserFactory {
    public static User createUser(UserRole role) {
        switch (role) {
            case STUDENT:
                return new Student("John", "Doe");
            case TEACHER:
                return new Teacher("John", "Doe");
            case ADMIN:
                return new Admin("John", "Doe");
        }
        return null;
    }
}
/*
Cons of Simple Factory:-

 	       -> It is easy to implement, but it has a few drawbacks.
 	       -> The factory class is not extensible. If we want to add a new type of user, we will have to modify the factory class.
 	       -> The factory class is not reusable. If we want to create a factory for creating different types of objects, we will have to create a new factory class.
 	       -> To overcome these drawbacks, we can use the factory method pattern (by splitting every object instantation under its own factory class).
 	       -> It violates OCP and SRP as there are lot of if else additions and multiple reasons to change the class
 */