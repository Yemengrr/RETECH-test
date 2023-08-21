package _20230615;

/**
 * 继承Thread
 */
public class DemoThread extends Thread{
    @Override
    public void run() {
        //Thread.currentThread().getName() 获取当前线程名
        System.out.println(Thread.currentThread().getName()+"进程类");
    }
}
