package org.designpatterns.creational.builder_2.builders;

import org.designpatterns.creational.builder_2.builders.impl.PGStudentBuilder;
import org.designpatterns.creational.builder_2.builders.impl.UGStudentBuilder;

// Impl 1: Using Static Inner Class and Private constructor
// Impl 2 (current): Use a builder StudentBuilder Interface and implement concrete builder classes which creates student class differently
public class Student {
    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    public Student(StudentBuilder builder) { //package level access atleast but ensure client should never call this constructor directly
        age = builder.age;
        name = builder.name;
        batch = builder.batch;
        gradYear = builder.gradYear;
        if(builder.course != null){
            this.course = builder.course;
        } else {
            this.course = "Academy";
        }
    }

    static StudentBuilder getBuilder(String type) throws Exception{ // Same as Simple Factory Design Pattern
        if(type.equals("UG"))
            return new UGStudentBuilder(); // we can return whatever concrete builder we want
        else if (type.equals("PG"))
            return new PGStudentBuilder();
        else
            throw new Exception("Not a valid type");
    }
}


class Client {
    public static void main(String args[]) throws Exception {
        Student ugStudent1 = Student.getBuilder("UG")
                .setAge(25) // throws exception for this value as 25 is not suitable age for UG
                .setGradYear(2025)
                .setBatch("Apr23")
                .setName("Ashish")
                .build();

        Student PgStudent1 = Student.getBuilder("PG")
                .setAge(29)
                .setGradYear(2025)
                .setBatch("Apr23")
                .setName("Ashish")
                .build();


    }
}
