package org.concurrent;

/**
 * 线程实例对象的属性值
 *
 * @author chenzhongqiang
 * @create 2018-03-09 17:23
 **/
public class MyThreadInfo extends Thread {

    @Override
    public void run() {
        System.out.println("MyThreadInfo 的线程实例正在执行任务");

    }

    public static void main(String[] args) {
        MyThreadInfo threadInfo = new MyThreadInfo();
        threadInfo.start();

        System.out.println("MyThreadInfo的线程对象 \n"
                + "线程的唯一标识符"+threadInfo.getId()+"\n"
                +"线程名称:"+threadInfo.getName()+"\n"
                +"线程状态:"+threadInfo.getState()+"\n"+
                "线程优先级:"+threadInfo.getPriority());
    }
}
