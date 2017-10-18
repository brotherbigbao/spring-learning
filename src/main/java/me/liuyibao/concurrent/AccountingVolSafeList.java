package me.liuyibao.concurrent;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class AccountingVolSafeList implements Runnable {

    static AccountingVolSafeList instance = new AccountingVolSafeList();

    //static List<Long> i = new CopyOnWriteArrayList<>();
    static List<Long> i = new Vector<>();
    static Deque<Long> j = new ConcurrentLinkedDeque<>();

    public void increase() {
            i.add(1L);
            j.add(1L);
    }

    @Override
    public void run() {
        for (int j=0; j<10000000; j++) {
            increase();
        }
    }
}
