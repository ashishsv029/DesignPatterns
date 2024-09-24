package org.designpatterns.creational.builder_2.builders.impl;

import org.designpatterns.creational.builder_2.builders.Student;
import org.designpatterns.creational.builder_2.builders.StudentBuilder;

public class PGStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    @Override
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setBatch(String batch) {
        this.batch = "PG_" + batch;
        return this;
    }

    @Override
    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    @Override
    public Student build(){ // This is a hidden Factory Method Pattern
        // violating SRP as we are doing both validation and building, we can seperate validation to another method
        // validations (lazy validation i.e validating the parameters just before building the object. Eager validation happens when we validate inside the setter functions)
        if(this.age < 22 || this.age > 28){
            throw new IllegalArgumentException("Age must be at least 22");
        }
        if(this.gradYear > 2024){
            throw new IllegalArgumentException("GradYear must be smaller than 2024");
        }
        return new Student(this);
    }
}


