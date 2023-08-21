package _20230406;

public class _230406_2 {
    public static void main(String[] args) {
        /**
         * 方法声明：
         *      1.修饰符（包括权限修饰符等）
         *          可有可无，可多个 无顺序要求。
         *      2.返回值类型
         *          可以是8种简单类型和引用类型。
         *          return 返回值类型;
         *          void 表示没有返回值。 return可省略。
         *      3.方法名
         *          满足命名规范（小驼峰），望文生义。
         *      4.参数列表
         *          定义方法中需要的参数（形参）。
         *      5.抛出的异常
         * 补充：
         *      1.return 关键字可以用在if分支中，表示终止程序执行。
         *      2.return 关键字后不能有代码。
         * 方法实现（方法体）：开始大括号与结束大括号包裹的代码。
         *
         */
        //1.创建类的对象
        _230406_2 dm = new _230406_2();
        //2.调用类的方法，对象名，方法名。
        int a = dm.calc(3 ,5);
        //3.接受方法的返回值时需要定义同类型的变量
        System.out.println(a);

        /* 测试课堂练习 */
        ScoreCalc sc = new ScoreCalc();
        double svg=sc.getSvg(97.5,98,89.5);//测试平均值
        double sum=sc.getSum(90.5,86,95);//测试总分
        System.out.println(svg);
        System.out.println(sum);

        /**
         * 方法重载：
         *  概念： 在 java 中允许在一个类中定义相同名字的方法，但是必须参数不同。也称"编译时 多态 "
         *  参数不同：
         *      1.类型不同
         *      2.顺序不同
         *      3.个数不同
         */
    }
    public int calc(double c,int d,int e){
        return 0;
    }
    public int calc(int c,double d){
        return 0;
    }
    public int calc(double c,int d){
        return 0;
    }
    /* 定义一个方法，计算两数之和 */
    public int calc(int a,int b){
        int c = a+b;
        return c;
    }

    public double[] getInfo() {
        double[] d = {1.69,95.5,3.14};
        return d;
    }
    public Student getStu(){
        Student stu = new Student();
        stu.height = 1.90;
        stu.weight = 103.5;
        return stu;
    }
}
class Student{
    double height =1.69;
    double weight =95.5;
}
