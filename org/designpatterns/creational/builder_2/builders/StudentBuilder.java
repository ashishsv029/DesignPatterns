package org.designpatterns.creational.builder_2.builders;

public abstract class StudentBuilder {
    protected int age; //accessible from different package subclasses only
    protected String name;
    protected String batch;
    protected int gradYear;
    protected String course;
    public abstract StudentBuilder setCourse(String course);
    public abstract StudentBuilder setAge(int age);
    public abstract StudentBuilder setName(String name);
    public abstract StudentBuilder setBatch(String batch);
    public abstract StudentBuilder setGradYear(int gradYear);
    public abstract Student build();
}
