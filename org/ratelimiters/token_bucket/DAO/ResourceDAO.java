package org.ratelimiters.token_bucket.DAO;

import org.ratelimiters.token_bucket.entities.Resource;

import java.util.HashMap;

public class ResourceDAO {
    public HashMap<String, Resource> resourceRegistry;
    public ResourceDAO() {
        resourceRegistry = new HashMap<>();
    }

    void addResource(String id, Resource res) {
        if(!resourceRegistry.containsKey(id)) {
            resourceRegistry.put(id, res);
        }
    }

    Resource getResource(String id) {
        return this.resourceRegistry.get(id);
    }
}
