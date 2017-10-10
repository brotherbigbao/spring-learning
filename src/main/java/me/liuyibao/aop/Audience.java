package me.liuyibao.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by liuyibao on 2017/10/10.
 */
@Aspect
public class Audience {

    @Before("execution(* me.liuyibao.aop.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* me.liuyibao.aop.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(* me.liuyibao.aop.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("execution(* me.liuyibao.aop.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
