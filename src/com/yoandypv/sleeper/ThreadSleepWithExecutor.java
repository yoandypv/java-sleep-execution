package com.yoandypv.sleeper;

import java.util.concurrent.TimeUnit;

public class ThreadSleepWithExecutor {

    public static SleeperWithExecutor sleeperWithExecutor;

    public ThreadSleepWithExecutor(){
        sleeperWithExecutor = new SleeperWithExecutor();
    }
    public void doTaskX(){
        System.out.println("Doing task X");
    }

    public static void main(String[] args) {
        ThreadSleepWithExecutor threadSleepWithExecutor = new ThreadSleepWithExecutor();
        long sleepTime = 2000;
        System.out.println("Step 1");
        sleeperWithExecutor.runWithDelay(() -> threadSleepWithExecutor.doTaskX(), sleepTime, TimeUnit.MILLISECONDS);
        Thread.getAllStackTraces().keySet().forEach((t) -> System.out.println(t.getName()));
        System.out.println("Step 2");
    }
}
