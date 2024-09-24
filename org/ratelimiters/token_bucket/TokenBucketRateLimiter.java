package org.ratelimiters.token_bucket;

import org.ratelimiters.token_bucket.DAO.ResourceDAO;
import org.ratelimiters.token_bucket.DAO.UserDAO;
import org.ratelimiters.token_bucket.DAO.UserResourceDAO;
import org.ratelimiters.token_bucket.entities.UserResource;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TokenBucketRateLimiter {
    private UserDAO userDao;
    private ResourceDAO resourceDao;
    private UserResourceDAO userResourceDao;
    private final ScheduledExecutorService scheduler;
    private int refillInterval;
    private int refillTokens;

    TokenBucketRateLimiter() {
        this.userDao = new UserDAO();
        this.resourceDao = new ResourceDAO();
        this.userResourceDao = new UserResourceDAO();
        this.scheduler = Executors.newScheduledThreadPool(1);
        this.refillInterval = 10; // in seconds
        this.refillTokens = 2;
        this.startRefilling();

    }


    private void startRefilling() {
        scheduler.scheduleAtFixedRate(() -> {
            // get list of all buckets and update the currentTokens count using setCurrentTokens function called with refillTokens param
            if (!isBlocked) {
                int currentTokens = tokens.get();
                if (currentTokens < bucketCapacity) {
                    tokens.set(Math.min(bucketCapacity, currentTokens + refillRate));
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }


    public static void main(String[] args) {

    }
}
