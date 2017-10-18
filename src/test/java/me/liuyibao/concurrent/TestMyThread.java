package me.liuyibao.concurrent;

import org.junit.Test;

/**
 * Created by liuyibao on 2017/10/16.
 */
public class TestMyThread {
    @Test
    public void testRun() {
        Thread t1 = new MyThread();
        t1.start();

    }
}
