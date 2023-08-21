package _20230420.demo;

import java.util.Spliterator;

/**
 * 作业1：
 *  创建一个 Role 角色类
 *  属性：name String
 *  方法：public int attack(){return 0;}表示对敌人的伤害值
 *
 *  创建magic类 继承Role类
 *  属性：level int 表示魔法等级（范围为1~10）
 *  方法：pubic int attack(){return 0;}
 *  该方法返回法师的攻击造成的伤害数值：魔法伤害*法术基本伤害值（固定为5）
 *
 *  创建Soldier类 继承Role类
 *  属性：hurt int
 *  方法：pubic int attack(){return 0;}
 *  该方法返回战士的攻击造成的伤害数值：攻击属性值。
 *
 *  要求：
 *      1.定义类的基本结构，满足封装原则，实现继承关系。
 *      2.分别创建 法师对象和战士对象，输出名字及伤害值。
 *  再设计一个Team 类，表示一个组队。具有如下方法
 *      1） addMember，表示组队增加一个成员。注意：组队成员最多为6 人
 *      提示：应当利用一个数组属性，保存所有成员
 *      2） attackSum，表示组队所有成员进行攻击时，对敌人造成的总伤害值
 */
public class Main {
    public static void main(String[] args) {
        Magic m1 = new Magic(6,"卡尔萨斯");
        Magic m2 = new Magic(8,"艾维尼亚");
        Magic m3 = new Magic(4,"卡西奥佩娅");
//        System.out.println("法师："+magic1.getName()+"的攻击伤害值："+attack);
        Soldier s1 = new Soldier(60,"盖伦");
        Soldier s2 = new Soldier(80,"亚托克斯");
        Soldier s3 = new Soldier(40,"奥恩");
        Team team = new Team();
        team.addMember(s1);
        team.addMember(s2);
        team.addMember(s3);
        team.addMember(m1);
        team.addMember(m2);
        team.addMember(m3);
        int atk = team.attackSum();
        System.out.println("小队总伤害:"+atk);
    }
}
