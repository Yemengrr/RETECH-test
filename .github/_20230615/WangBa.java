package _20230615;

/**
 * 王八线程
 */
public class WangBa extends Thread{
    private int i = 100;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(9);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("王八还剩"+i+"米到达终点");
            i--;
            if(i==0){
                System.out.println("王八赢了！");
                break;
            }
        }
    }
}
