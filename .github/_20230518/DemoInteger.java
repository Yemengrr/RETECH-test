package _20230518;

/**
 * 包装类：8种简单类型所对应的对象类型
 *  1.类型转换:使用parseXxx 或 valueOf进行类型转换
 *  2.默认值：简单类型默认是0或0.0，对象类型的默认值都是null
 *  3.int -- Integer char -- Character 以外都是首字母大写
 */
public class DemoInteger {
    public static void main(String[] args) {
        //8种简单类型
        //整数
        byte b = 1;
            Byte by = 1;
        short s = 2;
            Short sh = 2;
        int i = 3;
            Integer i1 = 3;
        long l = 4L;
            Long lo = 4L;
        //小数
        float f = 0.5f;
            Float fl = 0.5F;
        double d = 3.14;
            Double dou = 3.14;
        //字符串和布尔
        char c = 'a';

        boolean bo = true;
            Boolean boo = true;
        //类型转换
        int a = 10;
        double d1 = a;//小转大，直接赋值
        double d2 = 3.14;
        int a1 = (int)d2;//大转小，强制转换
        String s1 = "110";
        int a2 = Integer.parseInt(s1);
        Integer integer = Integer.valueOf(s1);
    }
}
