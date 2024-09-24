package org.designpatterns.creational.abstract_factory_6.example1.teacher_impl;

import org.designpatterns.creational.abstract_factory_6.example1.Teacher;

public class BiologyTeacher implements Teacher {
    String firstName;
    String lastName;
    public BiologyTeacher(String a, String b) {
        this.firstName = a;
        this.lastName = a;
    }
    @Override
    public void teach() {
        System.out.println("Teaching biology");
    }
}
