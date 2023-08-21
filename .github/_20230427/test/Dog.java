package _20230427.test;

import _20230427.Animals;

/**
 * 狗
 */
public class Dog extends Animals {
    public String name;
    protected int age;
    String color;
    private String type;

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    public void play(){
        System.out.println("狗玩飞盘");
    }
}
