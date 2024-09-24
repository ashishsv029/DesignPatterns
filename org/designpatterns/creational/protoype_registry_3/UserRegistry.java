package org.designpatterns.creational.protoype_registry_3;

public interface UserRegistry {
    public User getPrototype(UserRole role);
    public void addPrototype(UserRole role, User user);
    public User getClone(UserRole role) throws CloneNotSupportedException;
}