package _20230504.Demo;

/**
 * 法师类
 */
public class Magic extends NamedRole implements Role{
    private int level;
    private MagicStick stick;//法师武器


    @Override
    public int attack() {
        return level*5;
    }//攻击方法

    @Override
    public void practise() {//练习方法
        if(stick==null){
            level++;
        }
        else{
            level= level+1+ stick.fire();
        }
    }

    public Magic(){}

    public Magic(int level, MagicStick stick) {
        this.level = level;
        this.stick = stick;
    }

    public Magic(String name, int age, int level, MagicStick stick) {
        super(name, age);
        this.level = level;
        this.stick = stick;
    }

    @Override
    public String toString() {
        return "NamedRole{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
