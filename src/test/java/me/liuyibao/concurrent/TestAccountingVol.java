package me.liuyibao.concurrent;

import org.junit.Test;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class TestAccountingVol {
    @Test
    public void testRun() {
        Thread t1 = new Thread(AccountingVol.instance);
        Thread t2 = new Thread(AccountingVol.instance);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(AccountingVol.i.size());

        String tmp = "test";
        Integer i = 1;
        //Integer.valueOf(i);
        //String.valueOf(i);
    }
}
