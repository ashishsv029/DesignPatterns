package org.ratelimiters.token_bucket.DAO;

import org.ratelimiters.token_bucket.entities.UserResource;

import java.util.HashMap;

public class UserResourceDAO {
    public HashMap<String, UserResource> userResourceRegistry;
    public UserResourceDAO() {
        this.userResourceRegistry = new HashMap<>();
    }

    void addUserResource(UserResource userResource) {
        String userId = userResource.getUser_id();
        String resourceId = userResource.getResource_id();
        String id = userId + "_" + resourceId; // not a good way
        if(!userResourceRegistry.containsKey(id)) {
            userResourceRegistry.put(id, userResource);
        }
    }

    UserResource getUserResource(UserResource userResource) {
        String userId = userResource.getUser_id();
        String resourceId = userResource.getResource_id();
        String id = userId + "_" + resourceId; // not a good way
        return this.userResourceRegistry.get(id);
    }
}
