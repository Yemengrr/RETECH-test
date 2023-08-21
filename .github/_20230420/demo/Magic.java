package _20230420.demo;

public class Magic extends Role {
    private int level;

    public int attack() {
        return level*5;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Magic(int level) {
        this.level = level;
    }
    public Magic(int level,String name){
        super(name);
        this.level = level;
    }
}
