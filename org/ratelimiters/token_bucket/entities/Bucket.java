package org.ratelimiters.token_bucket.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Bucket {
    String id;
    int maxCapacity = 50; //default
    AtomicInteger currentTokens;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public AtomicInteger getCurrentTokens() {
        return currentTokens;
    }

    public void setCurrentTokens(int tokens) {
        this.currentTokens.addAndGet(tokens); //need not handle return of int count
        //this.currentTokens.set(Math.min(maxCapacity, this.currentTokens.addAndGet(tokens)));
    }



}
