package com.vizor.redis;

import com.vizor.utils.EnvVariables;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisException;

import java.util.Optional;

public enum Redis {
    INSTANCE;

    private final JedisPool pool = new JedisPool(EnvVariables.getEnv("REDIS_SERVICE_HOST").get(), 6379);

    public Optional<String> getByKey(final int database, final int key) {
        try (Jedis jedis = pool.getResource() ) {
            jedis.select(database);
            return Optional.of(jedis.get(String.valueOf(key)));
        } catch (JedisException je) {
            return Optional.empty();
        }
    }

    public void addData(final int key, final String json) {
        try ( Jedis jedis = pool.getResource() )  {
            //save to redis
            jedis.set(String.valueOf(key), json);
        } catch (JedisException je) {
            //if something wrong happen, return it back to the pool
        }
    }
}
