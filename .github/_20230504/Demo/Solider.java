package _20230504.Demo;

/**
 * 战士类
 */
public class Solider extends NamedRole{
    private int hurt;
    private Weapon weapon;
    public int attack(){
        return hurt+weapon.fire();
    }
    public void practise(){
        hurt+=10;
    }

    public Solider() {

    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
