package org.designpatterns.creational.abstract_factory_6.example1.student_impl;

import org.designpatterns.creational.abstract_factory_6.example1.Student;

public class BiologyStudent implements Student {
    String firstName;
    String lastName;
    public BiologyStudent(String a, String b) {
        this.firstName = a;
        this.lastName = a;
    }
    @Override
    public void read() {
        System.out.println("Reading Biology");
    }
}
