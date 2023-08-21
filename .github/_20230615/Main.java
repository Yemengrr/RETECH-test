package _20230615;
/**
 * 多线程：
 *  进程：一段程序的执行过程。在操作系统中所有程序都是同时并行的运行吗？
 *  线程：一个进程在执行过程中可以
 *  时间片：
 *  创建：
 *      1.继承 Thread 类 ，重写 run 方法
 *      2.实现 Runnable 接口 重写 run 方法
 *      3.实现 Callable 接口 重写 run 方法
 *  方法：
 *      sleep() 休眠当前线程，参数为毫秒，时间结束后自动唤醒
 *      start() 启动线程，使当前线程为就绪状态
 *      join() 阻塞线程
 *      wait() 使当前线程等待，调用 notify() 唤醒
 *      notify() 使当前线程唤醒。
 *      yield() 出让时间片
 *  线程状态： 新建、就绪、运行、阻塞、死亡。
 *  共享数据：当多个线程同时操作时，临界资源产生了线程不同步问题
 *  线程同步： synchronized 关键字
 *      1.同步代码块
 *      2.同步方法
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"线程正在运行。。。");
        //创建线程类对象
        DemoThread dt = new DemoThread();
        //调用 start 方法，这个方法继承自父类 Thread，调用后执行run方法中的代码
        dt.start();//调用此方法后，线程即为就绪状态，等待CPU分配时间片获取后运行。（启动线程）线程启动后，会调用run()方法。
        //练习：龟兔赛跑
//        Rabbit rabbit = new Rabbit();
//        WangBa wangBa = new WangBa();
//        rabbit.start();
//        wangBa.start();
        //12036售票窗口模拟：定义一个售票类，属性 count(int) 表示余票。 启动3个线程作为售票窗口，打印测试数据
        _12306 a1 = new _12306();
        new Thread(a1,"窗口1").start();
        _12306 a2 = new _12306();
        new Thread(a2,"窗口2").start();
        _12306 a3 = new _12306();
        new Thread(a3,"窗口3").start();

    }
}
