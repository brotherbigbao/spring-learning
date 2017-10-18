package me.liuyibao.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyibao on 2017/10/17.
 */
public class AccountingVol implements Runnable {

    static AccountingVol instance = new AccountingVol();

    static List<Long> i = new ArrayList<>();

    public void increase() {
        synchronized (instance) {
            i.add(1L);
        }
    }

    @Override
    public void run() {
        for (int j=0; j<10000000; j++) {
            increase();
        }
    }
}
