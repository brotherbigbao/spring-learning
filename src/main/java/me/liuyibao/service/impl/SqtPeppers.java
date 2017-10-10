package me.liuyibao.service.impl;

import me.liuyibao.service.CompactDisc;
import me.liuyibao.enums.Type;
import org.springframework.stereotype.Component;

/**
 * Created by liuyibao on 2017/10/3.
 */
public class SqtPeppers implements CompactDisc {
    private String title = "This is title";
    private String body = "This is body";

    public SqtPeppers(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void play() {
        System.out.println(title);
        System.out.println(body);
        if (Type.RICE.equals(getType())) {
            System.out.println("rice");
        }
    };

    private Type getType() {
        return Type.RICE;
    }
}
