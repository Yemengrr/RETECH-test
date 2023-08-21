package _20230406;

/**
 * 练习：
 *  从键盘接收三门课程分数，计算三门课的平均分和总成绩，编写成绩计算类实现功能。
 */
public class ScoreCalc {
    //计算平均分方法
    double getSvg(double a,double b,double c){
        double d=(a+b+c)/3;
        return d;
    }
    //计算总成绩方法
    double getSum(double a,double b,double c){
        double d=a+b+c;
        return d;
    }
}
