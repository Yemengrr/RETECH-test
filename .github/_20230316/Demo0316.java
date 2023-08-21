package _20230316;
/**
 * 分支结构：
 *      if-else
 *      switch-case
 */
public class Demo0316 {
    //主方法：java 程序的入口。快捷键： 方法1：psvm+回车。方法2：main+回车。
    public static void main(String[] args) {
        /**
         *  if 结构
         *   语法：如果布尔表达式结果为真，则执行其后代码块中的代码。否则跳过执行。
         *      if(布尔表达式){
         *          //代码
         *      }
         */
        /*EG1：
            定义一个表示年龄的变量，如果超过18岁，则输出 你已经是成年人了*/
//        int year=19;
//        if(year>=18){
//            System.out.println("你已经是成年人了");
//        }
//        System.out.println("执行后续代码：");
        /**
         *  if-else结构
         *  语法：如果布尔表达式结果为真，则执行if分支，反之则执行else分支
         *      if(布尔表达式){
         *          //if分支代码
         *      }else{
         *          //else分支代码
         *      }
         */
        /*EG2:定义一个表示成绩的变量，如果大于
分，则输出：合格，反之输出：不合格。*/
//        int num = 100;
//        if (num >= 60) {
//            System.out.println("合格");
//        } else {
//            System.out.println("不合格");
//        }
        /**
         * if- else if - else 多重if结构
         * 语法：从上到下，依次判断布尔式的结果，如果结果为真，执行分支；否则执行else分支。
         * 注意：if-else 结构均为互斥判断，如果存在多个条件同时满足，后面的满足条件的分支不会执行。
         *      else分支表示，所有结果均为假时执行此代码块。
         *      if(布尔1){
         *          //分支1
         *      }
         *      else if(布尔2){
         *          //分支2
         *      }
         *      else if(布尔3){
         *          //分支3
         *      }
         *      else{
         *
         *      }
         */
        /*EG3:定义成绩变量
        90分以上（含90）输出“优秀”。
        89-80：良好
        79-70：中等
        69-60：及格
        低于60：不及格
         */
//        int sc=100;
//        if(sc>=90){
//            System.out.println("优秀");
//        }
//        else if(sc>=80&&sc<90){
//            System.out.println("良好");
//        }
//        else if(sc>=70&&sc<80){
//            System.out.println("中等");
//        }
//        else if(sc>=60&&sc<70) {
//            System.out.println("及格");
//        }
//        else if(sc<60){
//            System.out.println("不及格");
//        }
//        else{
//            System.out.println("数据错误");
//        }
        /**
         * 嵌套if结构,不要超过三层。
         *      if(布尔){
         *          if(布尔){
         *          }
         *          else if(布尔){
         *          }
         *          else{
         *          }
         *      }
         *      else{
         *      }
         */
    }
}