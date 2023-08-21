package Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //定义Scanner对象，用于接收用户指令
        Scanner sc = new Scanner(System.in);
        //定义累加计价对象sum 、 用户反馈暂存对象str
        double sum = 0;
        String str;
        //定义货物类添加货物至仓库集合
        Object[] gud = new Object[6];
        goods g1 = new goods(1,"牙膏",25);
        goods g2 = new goods(2,"平底锅",150);
        goods g3 = new goods(3,"面包",6);
        goods g4 = new goods(4,"玻璃杯",12);
        goods g5 = new goods(5,"可口可乐",3);
        goods g6 = new goods(6,"玩具车",45);
        gud[0] = g1;
        gud[1] = g2;
        gud[2] = g3;
        gud[3] = g4;
        gud[4] = g5;
        gud[5] = g6;
        //遍历集合列出商品
        for(int i = 0;i<= gud.length-1;i++) {
            System.out.println(gud[i].toString());
        }
        do {
            System.out.println("请输入商品编号：");
            int lag = sc.nextInt();
            System.out.println("请输入购买数量：");
            int num = sc.nextInt();
            double sl = 0;

            switch (lag) {
                case 1:
                    System.out.print(g1.print1(num));
                    sl = 25;
                    break;
                case 2:
                    System.out.print(g2.print1(num));
                    sl = 150;
                    break;
                case 3:
                    System.out.print(g3.print1(num));
                    sl = 6;
                    break;
                case 4:
                    System.out.print(g4.print1(num));
                    sl = 12;
                    break;
                case 5:
                    System.out.print(g5.print1(num));
                    sl = 3;
                    break;
                case 6:
                    System.out.print(g6.print1(num));
                    sl = 45;
                    break;
            }

            sum += sl * num;
            System.out.println(" 合计:￥" + sum);
            System.out.println("是否继续y/n");
            str = sc.next();
        } while (str.charAt(0)=='y');//调用charAt方法将string对象与char字符进行判断
        System.out.println("您是会员吗y/n");
        str = sc.next();
        if(str.charAt(0)=='y') {
            sum = MembersPrice(sum);
        }
        System.out.println("应付金额："+sum);
        System.out.print("实付金额：");
        double n=sc.nextInt();
        System.out.println(n);
        if(n>sum){
            double m =n-(sum);
            System.out.print("找零:");
            System.out.printf("%.2f",m);
        }
        if(n<sum){
            System.out.println("实付金额不足，交易失败");
        }

    }
    public static double MembersPrice(double price) {//会员折扣方法
        return price * 0.9;
    }
}
