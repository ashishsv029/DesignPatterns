package org.ratelimiters.token_bucket.DAO;

import org.ratelimiters.token_bucket.entities.Bucket;

import java.util.ArrayList;

public class BucketDAO {
    public ArrayList<Bucket> buckets;
    public BucketDAO() {
        this.buckets = new ArrayList<>();
    }
    void addBucket(Bucket bucket) {
        buckets.add(bucket);
    }
}
