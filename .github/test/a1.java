//package test;
//
//import java.util.Scanner;
//
//public class a1{
//    public static void main(String[] args) {
//        //定义Scanner对象，用于接收用户指令
//        Scanner sc = new Scanner(System.in);
//        //商品列表
//        System.out.println("===============================");
//        System.out.println("请选择购买的商品编号");
//        System.out.println("1.牙膏   2.平底锅   3.呲水枪");
//        System.out.println("===============================");
//        //定义累加计价对象sum 、 用户反馈暂存对象str
//        double sum = 0;
//        String str = "";
//        //程序主循环
//        do {
//            System.out.println("请输入商品编号：");
//            int lag = sc.nextInt();
//            System.out.println("请输入购买数量：");
//            int num = sc.nextInt();
//            double sl = 0;
//            switch (lag) {
//                case 1:
//                    System.out.print("牙膏 单价:￥25 数量:"+num);
//                    sl = 25;
//                    break;
//                case 2:
//                    System.out.print("平底锅 单价:￥150 数量:"+num);
//                    sl = 150;
//                    break;
//                case 3:
//                    System.out.print("呲水枪 单价:￥100 数量:"+num);
//                    sl = 100;
//                    break;
//            }
//            sum += sl * num;
//            System.out.println(" 合计:￥" + sum);
//            System.out.println("是否继续y/n");
//            str = sc.next();
//        } while (str.charAt(0)=='y');//调用charAt方法将string对象与char字符进行判断
//        System.out.println("会员请键入y登录,非会员请键入n");
//        str = sc.next();
//        if(str.charAt(0)=='y') {
//            sum = MembersPrice(sum);
//        }
//        System.out.println("应付金额："+sum);
//        System.out.print("实付金额：");
//        double n=sc.nextInt();
//        System.out.println(n);
//        if(n>sum){
//            double m =n-(sum);
//            System.out.println("找零:"+m);
//        }
//        if(n<sum){
//            System.out.println("实付金额不足，交易失败");
//        }
//
//    }
//    public static double MembersPrice(double price) {//会员折扣方法
//        return price * 0.9;
//    }
//}
//
//
