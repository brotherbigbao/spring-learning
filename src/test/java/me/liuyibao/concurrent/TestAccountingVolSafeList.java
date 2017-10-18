package me.liuyibao.concurrent;

import org.junit.Test;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class TestAccountingVolSafeList {
    @Test
    public void testRun() {
        Thread t1 = new Thread(AccountingVolSafeList.instance);
        Thread t2 = new Thread(AccountingVolSafeList.instance);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(AccountingVolSafeList.i.size());
        System.out.println(AccountingVolSafeList.j.size());
    }
}
