package org.designpatterns.creational.abstract_factory_6.example1.classroom_factories_impl;

import org.designpatterns.creational.abstract_factory_6.example1.ClassRoomFactory;
import org.designpatterns.creational.abstract_factory_6.example1.Student;
import org.designpatterns.creational.abstract_factory_6.example1.Teacher;
import org.designpatterns.creational.abstract_factory_6.example1.student_impl.BiologyStudent;
import org.designpatterns.creational.abstract_factory_6.example1.teacher_impl.BiologyTeacher;

public class BiologyClassRoomFactory implements ClassRoomFactory {
    @Override
    public Student createStudent(String firstName, String lastName) { // This is a factory method pattern
        return new BiologyStudent(firstName, lastName);
    }

    @Override
    public Teacher createTeacher(String firstName, String lastName) { // This is a factory method pattern
        return new BiologyTeacher(firstName, lastName);
    }
}
