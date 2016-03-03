package com.wolf.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by wolf on 16/3/3.
 *
 *
 */
public class Client {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        int taskSize = 5;
        // 创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future> list = new ArrayList<Future>();

        for (int i = 0; i < taskSize; i++) {
            Callable c = new MyCallable(i + " ");
            // 执行任务并获取Future对象
            Future f = pool.submit(c);
            list.add(f);
        }
        // 关闭线程池
        pool.shutdown();

        // 获取所有并发任务的运行结果
        for (Future f : list) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println("retrieveResult: " + f.get().toString());
        }
    }

}

class MyCallable implements Callable<Object> {
    private String taskNum;

    MyCallable(String taskNum) {
        this.taskNum = taskNum;
    }

    /**
     * 在该方法可以做一些逻辑处理
     * @return
     * @throws Exception
     */
    public Object call() throws Exception {
        System.out.println(">>>" + taskNum + "任务启动");
        Date start = new Date();
        Thread.sleep(2000);
        Date end = new Date();
        long useTime = end.getTime() - start.getTime();
        System.out.println(">>>" + taskNum + "任务终止");
        return taskNum + "任务返回运行结果,当前任务时间【" + useTime + "毫秒】";
    }
}
