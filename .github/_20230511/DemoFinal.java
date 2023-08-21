package _20230511;

/**
 * final 修饰符：表示最终的。
 *  属性：
 *      语法：final 数据类型 属性名;
 *      说明：称为常量，不可改变的值（不能二次赋值）
 *  方法：
 *      语法：final 返回值类型 方法名(){}
 *      说明：不能被覆盖，但可以被继承。
 *  类：
 *      语法：final class 类名{}
 *      说明：不能被继承
 */
public class DemoFinal {
    final String name="谢不肉";
    public static void main(String[] args) {
        DemoFinal df = new DemoFinal();
//        df.name = "1";//不能进行二次赋值
    }
}
final class F{

}
//class A extends F{
//
//}
class Father{
    public final void m(){
        System.out.println("fa");
    }
}
class son extends Father{
    //final修饰的方法不可以覆盖
    //    public void m(){}
    public void n(){
        m();
    }
}
