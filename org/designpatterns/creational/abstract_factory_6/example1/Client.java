package org.designpatterns.creational.abstract_factory_6.example1;

import org.designpatterns.creational.abstract_factory_6.example1.classroom_factories_impl.BiologyClassRoomFactory;

public class Client {
    public static void main(String[] args) {
        ClassRoomFactory factory = new BiologyClassRoomFactory();
        Student student = factory.createStudent("John", "Doe");
        Teacher teacher = factory.createTeacher("Jack", "Sparrow"); // The client doesnt even know whether teacher will be BiologyTeacher/Physics Teacher. It depends on the factory
    }
}
