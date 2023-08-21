package _20230420.demo;
/*角色类*/
public class Role {
    private String name;

    public Role() {}

    public Role(String name) {
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    //攻击方法
    public int attack(){
        return 0;
    }
}
