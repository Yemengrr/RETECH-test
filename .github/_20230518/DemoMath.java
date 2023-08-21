package _20230518;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * 数学类
 *
 */
public class DemoMath {
    BigInteger big;//用来处理长度超过Long的整数
    BigDecimal bdc;//用来处理长度超过Long的小数

    public static void main(String[] args) {
        double d1 = 4.3333333333;
        double d2 = 5.8;
        System.out.println(d1+d2);
        //math获取随机数
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random()*10);
            System.out.println(random+"\t");
        }
        //使用Random类获取随机数
        Random r = new Random();
        int next = r.nextInt(10);
        System.out.println(next);
    }
}
