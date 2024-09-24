package org.ratelimiters.token_bucket.entities;

import java.util.Date;

public class UserResource {
    String id;
    String status; //ALLOWED, BLOCKED
    String user_id;
    String resource_id;
    String bucket_id;
    Date blockedAt;

    public UserResource(String user_id, String resource_id) {
        this.id = "random_id";
        this.status = "ALLOWED";
        this.user_id = user_id;
        this.resource_id = resource_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public String getBucket_id() {
        return bucket_id;
    }

    public void setBucket_id(String bucket_id) {
        this.bucket_id = bucket_id;
    }

    public Date getBlockedAt() {
        return blockedAt;
    }

    public void setBlockedAt(Date blockedAt) {
        this.blockedAt = blockedAt;
    }
}
