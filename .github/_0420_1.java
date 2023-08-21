package _20230420;

/**
 * 封装：
 *  1.属性私有化，隐藏对外可见性
 *  2.提供公开的get和set方法
 *  private 表示私有的，仅本类内部可见。
 */

/**
 * 定义一个类标注：
 *  1.属性和方法
 *  2.构造方法，定义一个无参构造方法和有参的构造。
 *  3.属性要满足封装原则
 */
public class _0420_1 {
    public static void main(String[] args) {
        Student stu = new Student("小明",17,"Java01");
        stu.setName("小磊");

        System.out.println(stu.getName());
    }
}
// 代码提示Alt + insert
