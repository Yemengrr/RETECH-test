package _20230822;

import java.util.Scanner;

/**
 * 20230822 test
 */
public class Demo0822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //生成随机数
        int result = initRandom("", 1);
        //提示信息，录入，判断（结束/继续）
        System.out.println("请输入一个数");
        String mes = "";
        do{
            System.out.println(mes);
            int i = sc.nextInt();
            if(i == result){
                System.out.println("输入正确");
                break;
            }else if(i < result){
                mes = "数字偏小，重新输入";
            }else{
                mes = "数字偏大，重新输入";
            }
        }while(true);

    }

    private static int initRandom(String s, int i) {
        return (int) (Math.random()*10);
    }
}
