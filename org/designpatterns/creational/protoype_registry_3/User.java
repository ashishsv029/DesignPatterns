package org.designpatterns.creational.protoype_registry_3;

public class User implements Cloneable {
    public String firstName;
    public String lastName;
    public String email;
    public User(String a, String b, String c) {
        this.firstName = a;
        this.lastName = b;
        this.email = c;
    }

    // copy constructor if deep clone is needed
    public User(User other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.email = other.email;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // instead of cloneable interface we can also use Copy constructor to create a clone
    // this clone function just does shallow copy and to do deep copy we need to use copy constructor only
}
