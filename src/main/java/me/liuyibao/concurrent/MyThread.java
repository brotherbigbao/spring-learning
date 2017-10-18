package me.liuyibao.concurrent;

/**
 * Created by liuyibao on 2017/10/16.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, I am t1");
    }
}
