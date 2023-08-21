package _20230511;


class ClassA{
    static {
        System.out.println("In ClassA Static");
    }
    public ClassA(){
        System.out.println("ClassA()");
    }
}
class ClassB{
    static {
        System.out.println("In ClassB Static");
    }
    public ClassB(){
        System.out.println("ClassB()");
    }
}
class ClassC extends ClassB{
    static{
        System.out.println("In ClassC Static");
    }
    public ClassC(){
        System.out.println("ClassC()");
    }
}

/**
 * 在创建对象之前，（类加载有且仅有一次）先初始化静态成员
 * 创建对象的过程：
 *      1.开辟内存空间，属性默认值
 *      2.初始化属性，属性初始值
 *      3.调用构造方法
 */
class MyClass {
    static ClassA ca = new ClassA();
    ClassC cc = new ClassC();
    static{
        System.out.println("In MyClass Static");
    }
    public MyClass(){
        System.out.println("MyClass()");
    }
}
public class Test {
    public static void main(String args[]){
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        System.out.println(mc1.cc == mc2.cc);
        System.out.println(mc1.ca == mc2.ca);
    }
}
