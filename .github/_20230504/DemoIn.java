package _20230504;

/**
 * 接口：
 *  与抽象类相同点：
 *      1.不能创建对象，但可以声明引用。（强制多态）
 *      2.编译后都会生成对应的.class文件。
 *  不同点：
 *      1.接口中不可以有构造方法，//静态代码块和初始代码块。
 *      2.接口所有的方法都是抽象方法，默认为 public abstract.(JDK1.8后可以有默认方法和静态方法)
 *      3.接口所有的属性都是常量，默认 public static final。
 */
interface In1{
    //访问权限修饰符：接口中的方法无论有没有写修饰符，默认都为public
    void m();
}
class ClassA{
    //访问权限修饰符：默认（default）
    void m(){
        System.out.println(123);
    }
}
/** [在JAVA中有一句话：“接口加反射，什么都能做”]
 *
 * 语法：一种特殊的抽象类，可以多继承。
 *      interface 接口名{}
 *      interface 接口 extends 父接口1,父接口2,父接口3{}
 *  类实现接口：一个类实现接口后，要实现接口中的所有方法（接口中方法默认为抽象方法），除非该类是一个抽象类。
 *      类名 implements 接口1,接口2,接口3{}
 *  类继承父类并实现多个接口：
 *      类名 extends 父类 implements 接口1,接口2{}
 */
public class DemoIn {
    public static void main(String[] args) {

    }
}
//定义一个接口
interface Inter1{
    //方法声明：修饰符 返回值类型 方法名 参数
    //方法实现：大括号{}中的方法体。
    public abstract void m1();
    void method();
//    public static void m2(){
//        System.out.println("a");
//    }
//    public default void m3(){
//        System.out.println("b");
//    }
}
class Abs{}
interface Inter2{}
interface Inter3{}
//一个类继承父类，实现多个接口
class A extends Abs implements  Inter1,Inter2,Inter3{
    //实现接口中的方法：覆盖接口中的抽象方法。
    @Override
    public void m1() {

    }
    @Override
    public void method() {

    }
}
abstract class Abstract1 implements Inter1{

}

