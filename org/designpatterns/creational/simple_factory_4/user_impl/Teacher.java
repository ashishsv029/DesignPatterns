package org.designpatterns.creational.simple_factory_4.user_impl;


import org.designpatterns.creational.simple_factory_4.User;

public class Teacher implements User {
    String firstName;
    String lastName;
    public Teacher(String a, String b) {
        this.firstName = a;
        this.lastName = b;
    }
    @Override
    public void doTasks() {
        System.out.println("Teacher doing tasks..");
    }
}
