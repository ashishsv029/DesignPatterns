package org.designpatterns.creational.builder_2.builders.impl;

import org.designpatterns.creational.builder_2.builders.Student;
import org.designpatterns.creational.builder_2.builders.StudentBuilder;

public class UGStudentBuilder extends StudentBuilder {

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
        this.batch = "UG_" + batch;
        return this;
    }

    @Override
    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    @Override
    public Student build(){ // voilating SRP as we are doing both validation and building, we can seperate validation to another method
        // validations (lazy validation i.e validating the parameters just before building the object. Eager validation happens when we validate inside the setter functions)
        if(this.age < 17 || this.age > 21){ // only 17-21 age is allowed
            throw new IllegalArgumentException("Not a good age to do UG");
        }
        if(this.gradYear > 2024){
            throw new IllegalArgumentException("GradYear must be smaller than 2024");
        }
        return new Student(this);
    }
}
