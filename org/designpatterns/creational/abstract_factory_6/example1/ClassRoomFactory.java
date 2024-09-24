package org.designpatterns.creational.abstract_factory_6.example1;

public interface ClassRoomFactory {
    // has factory methods i.e these methods returns instances - Ideally this factory produces Teachers and Students which are related to a class
    Student createStudent(String firstName, String lastName); // this can return any kind of student i.e BiologyStudent, PhysicsStudent
    Teacher createTeacher(String firstName, String lastName);
}
