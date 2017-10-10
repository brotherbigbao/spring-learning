package me.liuyibao.aop;

import me.liuyibao.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by liuyibao on 2017/10/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestPerformance {

    @Autowired
    private Performance performance;

    @Test
    public void testPerform() {
        performance.perform(3);
        performance.perform(3);
        performance.perform(3);
        performance.perform(3);
        performance.perform(3);
    }

}
