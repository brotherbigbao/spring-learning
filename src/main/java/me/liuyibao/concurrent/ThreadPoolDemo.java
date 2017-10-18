package me.liuyibao.concurrent;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class ThreadPoolDemo {
    public static class MyTask implements Runnable {
        @Autowired
        public void run() {
            System.out.println(System.currentTimeMillis() + ":Thread ID:" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            MyTask task = new MyTask();
            ExecutorService es = Executors.newFixedThreadPool(5);
            for (int i=0; i<10; i++) {
                es.submit(task);
            }
        }
    }
}
