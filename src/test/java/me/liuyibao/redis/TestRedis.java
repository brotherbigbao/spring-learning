package me.liuyibao.redis;

import me.liuyibao.config.AppConfig;
import me.liuyibao.jdbc.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuyibao on 2017/10/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestRedis {

    @Autowired
    private RedisConnectionFactory cf;

    @Autowired
    private RedisTemplate redis;

    @Test
    public void testCf() {
        RedisConnection conn = cf.getConnection();
        conn.set("greeting".getBytes(), "Hello World".getBytes());
    }

    @Test
    public void testRead() {
        RedisConnection conn = cf.getConnection();
        byte[] greetingBytes = conn.get("greeting".getBytes());
        String greeting = new String(greetingBytes);
        System.out.println(greeting);
    }

    @Test
    public void testTemplate() {
        Task task = new Task(1L, 200343L, 188L, "title");
        System.out.println(task);
        //redis.opsForValue().set(task.getTitle(), task);
        //Object result = (Task)redis.opsForValue().get("title");
        //System.out.println(result);


        //redis.opsForList().rightPush("cart", task);
        //redis.opsForList().rightPush("cart", task);
        //Task taskGet = (Task)redis.opsForList().leftPop("cart");
        //System.out.println(taskGet);

        redis.opsForSet().add("set", task);
        redis.opsForSet().add("set", task);
        redis.opsForSet().add("set", task);
        redis.opsForSet().add("set", task);

    }
}
