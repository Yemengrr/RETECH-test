package _20230427;

import _20230427.test.Dog;

/**
 * 权限修饰符：
 *      public 公开的，所有类都可以继承
 *      protected 受保护的，同包和不同包子类可访问（子类权限）
 *         （default）默认的，同包可访问（包权限）
 *      private 私有的，只能本类中访问
 *
 * 多态：当父类引用指向不同的子类对象时，（父类 对象名 = new 子类（））所产生的多种形态，称为多态。
 *      多态时，有以下特征：
 *      1.如果子类覆盖了父类中的方法，运行时子类覆盖的方法优先执行。
 *      2.如果子类没有覆盖，则执行父类中的方法
 *      3.只能调用子类覆盖的方法，子类中独有的方法无法直接调用（需要强制转换）
 * 类型转换：
 *      1.向上转型：小（子类）类型转为大（父类）类型，直接赋值。
 *      2.向下转型：大（父类）类型转为小（子类）类型，强制转换。
 *
 * 注意：父类引用强转为子类对象时，编译正确。但运行时可能会报ClassCastException异常
 * 使用instanceof关键字来判断
 *
 * instanceof关键字：是不是
 *      语法： 引用名 instanceof 类名
 *      如果兼容，返回true ， 否则false
 * 多态的应用：
 *      1.应用在方法参数。   方法参数定义为父类类型，实际传参时为子类对象。
 *      2.应用在方法返回值。 方法的返回值定义为父类类型，返回时可以为任意子类对象。
 */
public class Demo extends Dog {
    public static void main(String[] args) {
//        Animals a = new Animals();
//        //同包下可以访问：public、protected、default
//        Dog d = new Dog();
//        //不同包下只能访问public
//        //不同包下访问protected使用this、super
//        //this.age;
        Animals a1 = new Dog();
        Animals a2 = new Cat();
        a1.eat();
        a2.eat();
        Dog dog = (Dog)a1;
        dog.play();

        if(a2 instanceof Dog){
            Dog d1 =(Dog)a2;
            d1.play();
        }
        else {
            System.out.println("类型不匹配，无法强制转换");
        }


//强制转换简单案例：
        int a = 10;
        double b = a;
        double pi = 3.1415926;
        int i = (int)pi;
    }
//    public void m(){
//        System.out.println(this.age);
//    }
}
