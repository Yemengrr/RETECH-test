package _20230518;

import java.util.Scanner;

/**
 * 字符串类： String 称为 不可变字符串，使用双引号包裹的一个或多个字符
 * 可变字符串:
 *      StringBuffer    线程安全，效率低
 *      StringBuilder   线程不安全，效率高
 */
public class DemoString {
    public static void main(String[] args) {
//        String str = "18322058221";
//        System.out.println("根据下标返回一个字符:"+str.charAt(3));
//        System.out.println("根据字符返回第一次出现的下标："+str.indexOf('0'));
//        System.out.println("根据字符返回最后一次出现的下标："+str.lastIndexOf('0'));
//        System.out.println("截取字符串(含头不含尾)："+str.substring(2,9));//JS中可以反向截取，java中不允许
////        System.out.println(test1_1)?"是回文":"不是回文");
//        System.out.println(test1_2()?"是回文":"不是回文");
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 ="d";
        String s4 = s1+s3;//abcd
        String s5 ="abcd";
        String s6="hello";
        s6="word";//不改变原来的值
        System.out.println(s1==s2);//==用来比较两个对象的地址
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
//        StringBuffer 与 StringBuilder
        StringBuffer buffer = new StringBuffer("你好");
        buffer.append("a");
        buffer.append("bc");
        System.out.println(buffer);
        /**
         * 练习1：控制台输入一个字符串，判断是否为回文字符串。
         *  解析：
         *      1.首尾字符比较。如果相等跳过循环，否则return false。
         *      2.使用StringBuffer类中的reverse()方法。
         */
    }
    public static boolean test1_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串以判定是否为回文：");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static boolean test1_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串以判定是否为回文：");
        String str = sc.next();
        StringBuffer buffer = new StringBuffer(str);
        String reverse = buffer.reverse().toString();
        return str.equals(reverse);
    }
}
