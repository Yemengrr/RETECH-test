package _20230420.demo;

public class Soldier extends Role{
    private int hurt;

    public void Soldier(int hurt) {
        this.hurt = hurt;
    }

    public Soldier(){}
//    public Soldier(int hurt) {
//        this.hurt = hurt;
//    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
    public Soldier(int hurt,String name){
        super(name);
        this.hurt = hurt;
    }
    @Override
    public int attack() {
        return hurt;
    }
}
