package _20230615;

/**
 * 兔子线程
 */
public class Rabbit extends Thread{
    private int i = 100;
    @Override
    public void run() {
        //休眠

        while (true){
            if(i==50){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("兔子还剩"+i+"米到达终点");
            i--;
            if(i==0){
                System.out.println("兔子赢了！");
                break;
            }
        }
    }
}
