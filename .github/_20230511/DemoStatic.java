package _20230511;

/**
 * static 修饰符：表示静态的
 *  属性：
 *      语法： static 属性名;
 *      使用： 类名.属性名;
 *  方法：
 *      语法： static 返回值类型 方法名(){}
 *      使用： 类名.方法名；
 *  代码块：称作静态代码块。
 *  注意：
 *      1.静态的方法可以被继承和覆盖，但也得是静态方法，且没有多态（父类引用指向子类对象时，总类覆盖的方法优先执行）。
 *      2.在静态方法中不可以使用this、super。
 *      3.静态方法中不可以直接调用非静态成员，但可以创建对象，使用 对象名调用。
 *
 *  类加载：在创建对象之前发生。在第一次使用某个类时，JVM会在classpath中找到对应的class文件，
 *      读取该class文件的内容（包结构/类名/属性/方法/构造/文件...）到内存，并且保存起来的过程叫做类加载（运行一次）
 *  类加载时机：
 *      1.创建对象时
 *      2.创建子类对象时
 *      3.访问静态成员时
 *      4.Class.forName("包名，类名")
 */
public class DemoStatic {

    String name;
    static int age;
    public void m(){
        System.out.println("m");
    }
    public static void n(){
        System.out.println("n");
    }

    public static void main(String[] args) {
        //System.out.println(name);//静态方法中无法直接调用非静态属性
        //m();//静态方法中无法直接调用非静态方法
        System.out.println(age);
        n();


        Dog dog = new Dog();
        //类名.（静态）属性名
        Dog.details = "pokey";//紫色斜体为静态属性
        dog.details = "hell";//不推荐

        dog.print();
        //调用静态方法：类名.方法名();
        Dog.printS();
        dog.printS();//不推荐
        Dog d1 = new Dog("大黑",4);
        Dog d2 = new Dog("二黑",3);
        Dog.details = "学名Canis";
    }
}
class Animal{
    public static void eat(){
        System.out.println("父类吃");
    }
}
class Dog extends Animal{

    String name;
    int age;
    static String details;

    public static void eat(){
        System.out.println("子类吃");
    }
    //生成代码时，编译器将静态的属性忽略了

    public void print(){
        System.out.println("Dog");
    }
    public static void printS(){
        System.out.println("Dog static");
    }
    public Dog(){}
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
