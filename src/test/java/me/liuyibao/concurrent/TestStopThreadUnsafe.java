package me.liuyibao.concurrent;

import org.junit.Test;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class TestStopThreadUnsafe {
    @Test
    public void test() {
        new StopThreadUnsafe.ReadObjectThread().start();
        while (true) {
            Thread t = new StopThreadUnsafe.ChangeObjectThread();
            t.start();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.stop();
        }
    }
}
