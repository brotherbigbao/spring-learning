package me.liuyibao.concurrent;

/**
 * Created by liuyibao on 2017/10/13.
 */
class MyRunnable implements Runnable { // 1.实现接口Runnable
    private int i = 1000000;
    @Override
    public void run() { // 2.重写run方法
        for(; i > 0 ; i--)
            System.out.println("将要执行的代码写到run方法中..." + i);
    }
}
