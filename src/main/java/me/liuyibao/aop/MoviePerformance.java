package me.liuyibao.aop;

/**
 * Created by liuyibao on 2017/10/10.
 */
public class MoviePerformance implements Performance {
    @Override
    public void perform(int trackNumber) {
        System.out.println("perform body " + trackNumber);
    }
}
