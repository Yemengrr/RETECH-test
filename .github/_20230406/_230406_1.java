package _20230406;

public class _230406_1 {
    public static void main(String[] args) {
        /**
         * 1.定义类，创建对象
         * 语法：
         *      class 类名{}
         * 创建对象：
         *      1.声明引用:
         *          类名 引用名;
         *      2.使用new 关键词创建对象（开辟空间，调用构造）。
         *          引用名 = new 类名();
         *      3.声明引用并创建对象（常用）：
         *          类名 引用名 = new 类名();
         */
        //声明引用（变量）
        Car car;
        //创建对象
        car = new Car();
        /**
         * 2.通过对象调用方法和属性
         * 语法：
         *      引用名.属性名;
         *      引用名.方法名();
         */
        System.out.println(car.price);
        System.out.println(car.color);
        car.run();
        /**
         * 3.给对象的属性赋值
         *  方式:
         *      1.使用引用名，属性名赋值。
         *      2.通过构造方法赋值。
         *   
         */
        car.color = "五彩斑斓的黑";
        car.name = "佩嘉西.桑托劳";
        car.price=980000;
        System.out.println("赋值后："+car.name);
        System.out.println("赋值后："+car.price);
        System.out.println("赋值后："+car.color);
    }
}

/**
 * 练习：写一个Worker类，并创建多个Worker对象。
 * 为Worker类添加三个属性。
 * 1 String 类型的name，表示工人的姓名。
 * 2 int 类型的age,表示工人的年龄。
 * 3 double 类型的salary，表示工人的工资。
 */

/**
 *汽车类：是所有客观存在的汽车的分类。
 * 属性：这个类有什么？
 * 方法：这个类能干什么？
 */
class Car{
    //汽车属性
    String name;//名称
    String color;//颜色
    int price;//价格
    //开车方法
    void run(){
        System.out.println("嘀嘀嘀嘀嘀嘀嘀嘀嘀嘀嘀嘀。");
    }
}
