package _20230525;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 异常： 产生（运行时）异常后 程序中断 后续代码无法执行
 *  Throwable 是 java 中的所有错误和异常的父类。
 *      Error 表示错误，程序员无法处理，只能通过修改源代码解决
 *      Exception 表示异常、例外，重点学习。
 *          运行时异常：所有继承于 RunTimeException 的类及其子类。
 *              常见有：NullPointException ClassCastException IndexOutOfBoundException
 *          已检查异常(非运行时异常)：必须处理，编译报错。通常是继承自 Exception 的。（RunTimeException除外）
 *              常见有：IDException SQLException
 * 异常的处理方式：
 *      1.消极处理: （踢皮球） 通常用于处理非运行时异常
 *          语法： throws 异常类名
 *      2.积极处理：当try语句块中的代码发生异常时，跳转至catch块中执行。异常代码后的代码跳过执行
 *          语法：try{}catch(){} | try{}catch(){}catch(){}catch(){} | try{}catch(){}finally{}
 *              try{
 *                  //可能发生异常的代码
 *              }catch(要捕获的异常类名 引用名){
 *                  //异常处理的代码
 *              }
 * 注意：
 *      1.try后可以跟多个catch但是父类类型必须放后面（从小到大）。
 *      2.try必须有，finally可有可无且只能有一个，catch可有可无可以多个
 *      3.手动抛出异常钰消极处理异常的区别，前者使用 throw 关键字抛出一个异常对象，只能写在方法体中。
 *        而后者使用 throws 声明一个异常类型，只能写在方法声明中。
 * 产生异常的两种方式：
 *      1.系统自动抛出
 *      2.手动抛出语法： throw new 异常类名();
 * 方法异常补充：
 *      1.方法声明中的第五部分。在方法参数后使用 throws 异常类名 来声明异常，调用方法时要处理异常。
 *      2.子类不能比父类抛出更大的异常。
 */
public class DemoThrowable {
    public static void main(String[] args) {
//        int[] arr = new int[1024 * 1024 * 9999999];//错误:OutOfMemoryError 无法处理
//        new DemoThrowable().a();//错误： StackOverflowError
//        int a = 10;
        System.out.println("代码开始");
//        try{
//            System.out.println("try开始");
////            System.out.println("零为除数："+a/0);//算数异常：ArithmeticException
//            String str = null;
//            System.out.println(str.equals("abc"));
//            System.out.println("try结束");//未执行被跳过的代码
//        }catch (ArithmeticException ar){
//            System.out.println("错误："+ar.getMessage());
//            ar.printStackTrace();//系统默认
//        }catch (NullPointerException n){
//            System.out.println("错误："+n.getMessage());
//            n.printStackTrace();
//        }catch (Exception e){
//            System.out.println("使用 Exception 做通用异常处理");
//        }finally {
//            System.out.println("无论是否发生异常，是否正确捕获，此处代码总是会被执行");
//        }
        n(100);
        System.out.println("代码结束");

    }
//    int i = 0;
//    public void a(){
//        System.out.println("a"+(i++));
//        b();
//    }
//    public void b(){
//        System.out.println("b");
//        a();
//    }
    //在方法的声明处使用 throws 声明异常 （消极处理方式）
    public static void m() throws FileNotFoundException {
        FileOutputStream fot = new FileOutputStream("123");
    }
    public static void n(int e){
        if(e == 10) {
            throw new ClassCastException("类转换");
        }
        else if(e == 20){
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }else {
            throw new NullPointerException("空指针");
        }
    }
}