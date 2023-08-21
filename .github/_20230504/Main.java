package _20230504;

import _20230427.Animals;

/**
 * 抽象类:
 *  修饰类
 *      语法： abstract class 类名 {}
 *          1.可以修饰类，不能创建对象，可以声明引用，只能靠子类创建对象。（强制多态）,抽象类中也可以有非抽象方法
 *          2.可以修饰方法，抽象方法：只有方法声明，没有方法实现(没有大括号)。抽象方法只能出现在抽象类中。
 *          3.子类继承父类，必须实现父类中的所有抽象方法，除非子类是一个抽象类。
 *  修饰方法
 *      语法： abstract 返回值类型 方法名()
 *
 *  总结：
 *      抽象类常用于将子类中的共性，属性或方法，提取出来进行声明和定义。
 */
public class Main {
    public static void main(String[] args) {
        //创建对象，抽象类不能实例化
//        Animal animal = new Animal();
        Animal a = new Dog();
        a.print();
    }
}
//抽象类
abstract class Animal{
    String name;
    int age;
    //抽象方法
    public abstract void eat();
    public void print(){
        System.out.println("方法");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
}