package org.ratelimiters.token_bucket.entities;

public class Resource {
    String id;
    String name;
    int refillRate = 10; // default
    int refillInterval = 2; // is seconds (default)

    public int getRefillRate() {
        return refillRate;
    }

    public void setRefillRate(int refillRate) {
        this.refillRate = refillRate;
    }

    public int getRefillInterval() {
        return refillInterval;
    }

    public void setRefillInterval(int refillInterval) {
        this.refillInterval = refillInterval;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
