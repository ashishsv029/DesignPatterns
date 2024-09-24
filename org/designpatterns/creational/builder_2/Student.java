package org.designpatterns.creational.builder_2;
// Impl 1 (current): Using Static Inner Class and Private constructor
// Impl 2 : Use a builder StudentBuilder Interface and implement concrete builder classes which creates student class differently
public class Student {
    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    private Student(StudentBuilder builder) {
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

    static StudentBuilder getBuilder(){
        return new StudentBuilder(); // ideally we are creating object of a static class
    }

    public static class StudentBuilder { // has only state and setter methods
        int age;
        String name;
        String batch;
        int gradYear;
        String course;

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        Student build(){ // build method returns an instance, so this is a hidden Factory Method Design Pattern
            // violating SRP as we are doing both validation and building, we can seperate validation to another method
            // validations (lazy validation i.e validating the parameters just before building the object. Eager validation happens when we validate inside the setter functions)
            if(this.age < 20){
                throw new IllegalArgumentException("Age must be at least 20");
            }
            if(this.gradYear > 2024){
                throw new IllegalArgumentException("GradYear must be smaller than 2024");
            }
            return new Student(this);
        }
    }
} // Here we can clearly see validations and object building is completely seperated from main Class

class Client {
    public static void main(String args[]) {
        Student s = Student.getBuilder()
                .setAge(25)
                .setGradYear(2025)
                .setBatch("Apr23")
                .setName("Ashish")
                .build();


    }
}
