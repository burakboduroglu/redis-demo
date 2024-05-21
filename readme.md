## Redis Crash Course

### What is Redis?

- Redis is an open-source, in-memory data structure store, used as a database, cache, and message broker.
- It supports data structures such as strings, hashes, lists, sets, sorted sets with range queries, bitmaps, indexes, and streams.
- Redis has built-in replication, Lua scripting, LRU eviction, transactions, and different levels of on-disk persistence, and provides high availability via Redis Sentinel and automatic partitioning with Redis Cluster.

### Why Redis?

- Redis is a NoSQL database, which means it stores data in an unstructured way.
- Redis is an in-memory database, which means it stores data in the RAM.
- Redis is a key-value store, which means it stores data in key-value pairs.

### Redis Data Structures

- Strings
- Lists
- Sets
- Sorted Sets
- Hashes
- Bitmaps
- Streams

### Redis Commands

- "SET key value" use for setting a key-value pair.
- "GET key" use for getting the value of a key.
- "mset key value" use for setting a key-value pair if the key does not exist.
- "mget key" use for getting the value of a key if the key exists.
- "keys \*" use for getting all keys.
- "ttl key" use for getting the time to live of a key.
- "set name value EX 10" use for setting a key-value pair with an expiration time.
- "setex name 10 value" use for setting a key-value pair with an expiration time.
- "hset key field value" use for setting a field-value pair in a hash.
- "hget key field" use for getting the value of a field in a hash.
- "hgetall key" use for getting all field-value pairs in a hash.
- "expire key time" use for setting the expiration time of a key.
- "sadd myset value" use for adding a value to a set.
- "smembers myset" use for getting all values in a set.
- "lpush mylist value" use for adding a value to the left of a list.
- "rpush mylist value" use for adding a value to the right of a list.
- "lrange mylist 0 -1" use for getting all values in a list.
- "zadd myzset 1 value" use for adding a value to a sorted set.
- "zrange myzset 0 -1" use for getting all values in a sorted set.
