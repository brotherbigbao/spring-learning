package me.liuyibao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by liuyibao on 2017/10/10.
 */
@Aspect
@Component
public class Audience {

    private int counts;

    @Pointcut("execution(* me.liuyibao.aop.Performance.perform(int)) && args(trackNumber)")
    public void performance(int trackNumber) {}

    @Before("performance(trackNumber)")
    public void silenceCellPhones(int trackNumber) {
        counts += trackNumber;
        System.out.println("Silencing cell phones " + counts);
    }

    @Before("performance(trackNumber)")
    public void takeSeats(int trackNumber) {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance(trackNumber)")
    public void applause(int trackNumber) {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance(trackNumber)")
    public void demandRefund(int trackNumber) {
        System.out.println("Demanding a refund");
    }

    @Around("performance(trackNumber)")
    public void watchPerformance(ProceedingJoinPoint jp, int trackNumber) {
        try {
            counts += trackNumber;
            System.out.println("Silencing cell phones " + counts);
            jp.proceed();
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}
