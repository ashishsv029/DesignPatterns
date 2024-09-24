package org.ratelimiters.token_bucket.DAO;

import org.ratelimiters.token_bucket.entities.User;

import java.util.HashMap;

public class UserDAO {
    public HashMap<String, User> userRegistry;

    public UserDAO() {
        this.userRegistry = new HashMap<>();
    }

    void addUser(User user) {
        String id = user.getId();
        if(!userRegistry.containsKey(id)) {
            userRegistry.put(id, user);
        }
    }

    User getUser(String userId) {
        return this.userRegistry.get(userId);
    }
}
