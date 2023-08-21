package _20230615;

/**
 * 12306售票模拟类
 */
public class _12306 implements Runnable {
    private static int count = 1000;//全类共享
    private static Object obj = new Object();
    @Override
    public void run() {

        while (true) {
            //同步代码块，参数为一个锁对象
            synchronized (obj) {
                if(count > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + count + "张票。");
                    count--;
                }else{
                    break;
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"已售罄。");
    }
}
