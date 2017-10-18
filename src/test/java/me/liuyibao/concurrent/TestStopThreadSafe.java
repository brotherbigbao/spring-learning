package me.liuyibao.concurrent;

import org.junit.Test;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class TestStopThreadSafe {
    @Test
    public void test() {
        new StopThreadSafe.ReadObjectThread().start();
        while (true) {
            StopThreadSafe.ChangeObjectThread t = new StopThreadSafe.ChangeObjectThread();
            t.start();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.stopMe();
        }
    }
}
