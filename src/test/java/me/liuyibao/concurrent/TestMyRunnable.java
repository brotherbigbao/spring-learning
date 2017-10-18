package me.liuyibao.concurrent;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyibao on 2017/10/13.
 */

public class TestMyRunnable {
    @Test
    public void testStart() {
        MyRunnable mr = new MyRunnable();
        //new Thread(mr).start();
        long start = System.currentTimeMillis();

        List<Thread> list = new ArrayList<Thread>();
        for(int i = 0; i < 2; i++)
        {
            Thread thread = new Thread(mr);
            thread.start();
            list.add(thread);
        }

        try
        {
            for(Thread thread : list)
            {
                thread.join();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("子线程执行时长：" + (end - start));
    }
}
