package org.designpatterns.creational.protoype_registry_3;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        UserRegistry registry = new UserRegistryImpl();
        registry.addPrototype(UserRole.STUDENT, new User("John", "Doe", "john@doe.in"));
        User user = registry.getPrototype(UserRole.STUDENT);
        user.firstName = "Jack"; // we are modifying the prototype
        // instead of building the object, we are cloning the existing prototype and getting new objects
        User jackUserInstance1 = registry.getClone(UserRole.STUDENT);
        User jackUserInstance2 = registry.getClone(UserRole.STUDENT);
        User jackUserInstance3 = registry.getClone(UserRole.STUDENT);
        User jackUserInstance4 = registry.getClone(UserRole.STUDENT);

    }

}
