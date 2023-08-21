package _20230330;

import java.util.Scanner;

public class _0330_1 {
    public static void main(String[] args) {
        /**
         * 声明数组：
         *      数据类型[] 数组名; 例如： int[] a;
         * 创建数组（分配空间）
         *      a = new 数据类型[数据大小];
         * 声明并分配空间：
         *      int[] arr=new int[5];
         * 元素：指数组中储存的值。
         * 索引：数组中的每一个元素都有一个下标，从0开始至长度-1 结束。
         * 取值：数组名[下标];
         * 赋值：数组名[下标]=值；
         * 默认值：
         *      基本类型： 整数0 小数0.0 布尔false 字符' '
         *      引用类型： null
         * 属性：length 表示数组的长度（大小）。
         * 遍历：将数组中的元素从头到尾（或反之）访问一遍。通常使用for循环。
         * 异常：操作数组元素时，一定要在合法的索引范围内， 即从0开始至长度-1 结束。如果超出范围会使程序异常。
         */
        /* 声明一个int类型的数组 */
        int[] a;
        /* 为数组a分配空间,大小为10 */
        a = new int[10];
        /* 思考 此时的数组 a 中是否有值？如果有是多少？ */
        System.out.println("获取数组中的第1个元素："+a[0]);
        /* 例1：使用随机数，味素中元素赋值 */
//        Random r = new Random();
//        int i = r.nextBoolean(10);
//        int r=(int) (Math.random()*10);//返回一个0-10（不包含10）的随机数。
//        System.out.println("获取一个随机数："+r);
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*10);
        }
        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        /**
         * 显示初始化：
         *      数据类型[] 数组名 = {1,2,3,4,5};
         * 显示初始化与分配空间：
         *      int[] a = new int[]{1,2,3,4,5};
         * 注意：
         *      1.使用显示初始化定义数组时，必须在一行内完成。
         *      2.显示初始化与分配空间一起使用时，不能指定长度。
         */
        /* 显示初始化 */
        //错误示例：
        //int[] arr;
        //arr = {1,2,3,4,5};
        /* 显示初始化与分配空间 */
        //错误示例：
        //int[] arr1 = new int[5]{1,2,3,4,5};
        /**课堂练习1：
         * 定义一个数组，用来存储学生成绩，分别输入五门课的成绩，并计算总成绩和平均成绩。
         */
//        int[] score = {96,78,65,80,88};
        //定义数组：存储成绩
        double[] score = new double[5];
        //创建Scanner对象
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < score.length ; i++) {
            System.out.println("请输入第"+(i+1)+"门课成绩：");
            //获取控制台输入的成绩
            double v = sc.nextDouble();
            //将输入的成绩赋值给数组中对应的元素
            score[i]=v;
            sum+=score[i];
        }
        System.out.println("五门课总成绩："+sum);
        System.out.println("五门课平均成绩："+ sum/score.length);

        /**
         * 课堂练习2：
         *      定义一个数组，将数组中的元素倒置。
         */
        int[] nums = {2,4,6,8,10};
        for (int i = 0; i < nums.length/2; i++) {
            int t = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i]=t;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
}
