package org.designpatterns.creational.protoype_registry_3;
import java.util.*;
public class UserRegistryImpl implements UserRegistry{
    private HashMap<UserRole, User> registry = new HashMap<>();
    @Override
    public User getPrototype(UserRole role) {
        return registry.get(role);
    }

    @Override
    public User getClone(UserRole role) throws CloneNotSupportedException {
        return (User) registry.get(role).clone();
    }

    @Override
    public void addPrototype(UserRole role, User user) {
        registry.put(role, user);
    }
}
