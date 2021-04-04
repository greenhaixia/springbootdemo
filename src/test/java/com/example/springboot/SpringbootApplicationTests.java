package com.example.springboot;

import com.example.springboot.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> strRedisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
    }

    @Test
    public void testString() {
//        redisUtil.set("strKet", "redis test-2");
//        System.out.println(redisUtil.get("strKet"));
//        redisUtil.del("strKet");
        final String key = "incKey";
        redisUtil.set(key, 1);
        redisUtil.incr(key, 9);
        System.out.println(redisUtil.get(key));
        redisUtil.decr(key, 3);
        System.out.println(redisUtil.get(key));
        redisUtil.expire(key, 60);
    }

    @Test
    public void testList() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        final String key = "listKey";
        redisUtil.lSet(key, list);
        redisUtil.lSet(key, "five");
        System.out.println(redisUtil.lGetIndex(key, 2));
        System.out.println(redisUtil.lGetListSize(key));
        System.out.println(redisUtil.lGet(key, 1, 3));
        redisUtil.lUpdateIndex(key, 0, "1111");

    }
}
