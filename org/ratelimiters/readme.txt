Types of RateLimiters

-> Token Bucket
        -> Assume there is a bucket for every user (identity_id)
        -> The tokens will be added to every bucket at fixed rate (for ex: 10 per min), till max capacity of the bucket is filled
        -> When a request comes, the associated bucket is checked to see whether there is atleast 1 token in bucket
        -> If no tokens are left, a rate limiter error is thrown
        -> Burst of requests can happen at start and end of the refill time (i.e at 59th second and 1st second, totally 20 requests can be fired at once)
    Use Cases:-
       1. To Limit the number of requests
       2. To block the user for some time if there are more than configured number of failures.
            (for ex:- if we notice


-> Leaky Bucket
-> Fixed Window
-> Sliding Window
-> Sliding Window Log