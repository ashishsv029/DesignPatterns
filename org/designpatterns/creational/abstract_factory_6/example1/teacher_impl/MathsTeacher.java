package org.designpatterns.creational.abstract_factory_6.example1.teacher_impl;

import org.designpatterns.creational.abstract_factory_6.example1.Teacher;

public class MathsTeacher implements Teacher {
    String firstName;
    String lastName;
    public MathsTeacher(String a, String b) {
        this.firstName = a;
        this.lastName = a;
    }
    @Override
    public void teach() {
        System.out.println("Teaching Maths");
    }
}
