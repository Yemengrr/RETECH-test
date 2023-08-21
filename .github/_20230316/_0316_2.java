package _20230316;
// import： 导入包
import java.util.Scanner;

public class _0316_2 {
    public static void main(String[] args) {
        //创建 Scanner 对象 ↓
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数");
        //获取用户在控制台输入的数字，并赋值给变量 a ↓
        int a = sc.nextInt();
        System.out.println("您输入的数字是："+ a);//此处+作用：连接字符串。
        /**
         *  switch-case
         *  语法：根据表达式的值，从上到下，依次匹配,case值如果与表达式结果相等，则执行对应分支，均未匹配时执行default分支。
         *  break：跳出该结构，可省略，如果省略，则直接从上至下执行下面的case分支，直到break为止。
         *  表达式的类型：byte short int char enum(枚举) String(JDK7以后新增)
         *  switch(表达式){
         *      case 值1:{
         *          //case1分支代码
         *          break;
         *      }
         *      case 值2:{
         *          //case2分支代码
         *          break;
         *      }
         *      case 值3：{
         *          //case3分支代码
         *          break;
         *      }
         *      default:{
         *          //默认分支代码
         *      }
         *  }
         */
        /*
        *仍用户输入1-5的数：分别匹配输出，福娃名称：贝贝，晶晶，欢欢，莹莹，妮妮，否则输出 北京欢迎你。
         */
//        switch (a){
//            case 1:System.out.println("贝贝");break;
//            case 2:System.out.println("晶晶");break;
//            case 3:System.out.println("欢欢");break;
//            case 4:System.out.println("莹莹");break;
//            case 5:System.out.println("妮妮");break;
//            default:System.out.println("北京欢迎你");
//        }
        /**
         * 应用场景：
         * if-else：通常用来做：范围判断
         * switch-case：通常用来做：等值判断
         */
        /*输入一个月份，判断并打印输出对应的季节（春夏秋冬）。民间习惯以农历1、2、3月为春季，4、5、6为夏季，以此类推*/
        //方法一（if）：
        if (a>=1&&a<=3){
            System.out.println("春");
        }else if (a>=4&&a<=6){
            System.out.println("夏");
        }else if (a>=7&&a<=9){
            System.out.println("秋");
        }else if (a>=10&&a<=12){
            System.out.println("冬");
        }
        //方法2（switch）：
        switch (a){
            case 1: case 2: case 3:System.out.println("春");break;
            case 4: case 5: case 6:System.out.println("夏");break;
            case 7: case 8: case 9:System.out.println("秋");break;
            case 10: case 11: case 12:System.out.println("冬");break;
        }
    }
}
