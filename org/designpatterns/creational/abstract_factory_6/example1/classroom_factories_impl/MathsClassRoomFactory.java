package org.designpatterns.creational.abstract_factory_6.example1.classroom_factories_impl;

import org.designpatterns.creational.abstract_factory_6.example1.ClassRoomFactory;
import org.designpatterns.creational.abstract_factory_6.example1.Student;
import org.designpatterns.creational.abstract_factory_6.example1.Teacher;
import org.designpatterns.creational.abstract_factory_6.example1.student_impl.MathsStudent;
import org.designpatterns.creational.abstract_factory_6.example1.teacher_impl.MathsTeacher;

public class MathsClassRoomFactory implements ClassRoomFactory {
    @Override
    public Student createStudent(String firstName, String lastName) {
        return new MathsStudent(firstName, lastName);
    }

    @Override
    public Teacher createTeacher(String firstName, String lastName) {
        return new MathsTeacher(firstName, lastName);
    }
}
