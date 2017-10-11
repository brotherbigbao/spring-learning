package me.liuyibao.aop;

import org.springframework.stereotype.Component;

/**
 * Created by liuyibao on 2017/10/10.
 */
@Component
public class MoviePerformance implements Performance {
    @Override
    public void perform(int trackNumber) {
        System.out.println("perform body " + trackNumber);
    }
}
