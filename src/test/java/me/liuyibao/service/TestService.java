package me.liuyibao.service;

import me.liuyibao.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuyibao on 2017/10/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestService {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void testPlay() {
        compactDisc.play();
    }

}
