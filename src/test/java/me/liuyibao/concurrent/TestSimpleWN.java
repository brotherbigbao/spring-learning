package me.liuyibao.concurrent;

import org.junit.Test;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class TestSimpleWN {
    @Test
    public void testT1T2() {
        Thread t1 = new SimpleWN.T1();
        Thread t2 = new SimpleWN.T2();
        t1.start();
        t2.start();
    }
}
