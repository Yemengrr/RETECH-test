package _20230504.Demo;
/**
 * 名字抽象类
 */
public abstract class NamedRole implements Role{
    private String name;
    private int age;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public NamedRole(){}
    //有参的构造方法用以给属性赋值
    public NamedRole(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
