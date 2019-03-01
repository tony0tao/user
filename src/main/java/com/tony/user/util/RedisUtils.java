package com.tony.user.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public String get(String key) {

        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value) {

        boolean state = false;
        try {
            redisTemplate.opsForValue().set(key, value);
            state = true;
        } catch (Exception e) {

        }
        return state;
    }

    /**
     * 写入缓存并设置过期时间
     *
     * @param key
     * @param value
     * @param seconed
     * @return
     */
    public boolean set(String key, String value, long seconed) {

        boolean state = false;
        try {
            redisTemplate.opsForValue().set(key, value, seconed, TimeUnit.SECONDS);
            state = true;
        } catch (Exception e) {

        }
        return state;
    }

    /**
     * 设置过期时间
     *
     * @param key
     * @param seconed
     * @return
     */
    public boolean expire(String key, long seconed) {

        boolean state = false;
        try {
            redisTemplate.expire(key, seconed, TimeUnit.SECONDS);
            state = true;
        } catch (Exception e) {

        }
        return state;
    }

    /**
     * 删除缓存
     *
     * @param key
     * @return
     */
    public boolean del(String key) {

        boolean state = false;
        try {
            redisTemplate.delete(key);
            state = true;
        } catch (Exception e) {

        }
        return state;
    }
}
