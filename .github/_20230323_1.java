package _20230323;

public class _20230323_1 {
    public static void main(String[] args) {
        /**
         * 循环结构：重复的且有规律的执行程序代码。
         * 三要素：循环变量初始值、循环终止条件、循环标量的递增or递减.
         *
         * 使用:通常循环次数时使用for循环，未知循环次数时使用while循环。
         *
         * 关键字：
         *      break;:表示终止当前循环
         *      continue;:表示跳过当前循环，继续下一次循环
         */
        /**
         * for 循环:
         *  特点：执行次数为0~N次
         *      语法：
         *          for(初始值;终止条件;变量递增){
         *              //循环体
         *          }
         */

        /* 计算1+2+3+4+5+...+100数之和 */
//        int n=0;
//        for(int i=1;i<=100;i++){
//            n+=i;
//        }
//        System.out.println("1+2+3+4+5+...+100=" + n);
        /**
         * while 循环
         * 特点：执行次数为0~N次
         *   语法:
         *      while(布尔表达式){
         *          //循环体
         *      }
         *  eg:
         *      计算1+3+5+7+9+...+99数之和
         */
//        int i=1,n=0;
//        while(i<=99){
//            n+=i;
//            i+=2;
//        }
//        System.out.println("while新欢运算1+3+5+7+9+...+99="+n);

        /**
         * do-while 循环
         * 特点：执行次数为1~N次
         *  语法:
         *  do{
         *      //循环体
         *  }while(布尔表达式)
         */
//        int a=0;
//        do{
//            System.out.println("循环变量的值是："+a);
//            a++;
//        }while(a<5);
//        a=0;
//        do{
//            System.out.println("循环变量的值是："+a);
//            a++;
//        }while(a<0);
        /**
         * 练习1:
         * 求水仙花数。所谓水仙花数，是指一个三位数abc,如果满足a3（立方）=b3=c3=abc,则abc是水仙花数。
         * 分析：
         *  1.确定使用哪个循环结构：for
         *  2.初始值：100
         *  3.终止条件：小于1000
         *  4.递增：1/次。
         */
//        int a=0;
//        int b=0;
//        int c=0;
//        System.out.println("100-1000水仙花数有：");
//        for(int i=100;i<1000;i++){
//            //求得个十百三位上的数
//            a=i/100;
//            b=i/10%10;
//            c=i%100%10;
//            //判断条件
//            if(a*a*a+b*b*b+c*c*c==i)
//                System.out.println(+i);
//        }
        /* 结束关键字: */
//        for(int i=0;i<5;i++){
//            if(i==2){
////                continue;
////                break;
//            }
//            System.out.println("循环变量"+i);
//        }

    }
}
