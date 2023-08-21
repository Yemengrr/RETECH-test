package _20230420;

/**
 * 学生类
 */
public class Student {
    private String name;
    private int age;
    private String cls;
    //get方法
    public String getName(){
        return name;
    }
    //set方法
    public void setName(String name){
        if(name.length()>10){
            System.out.println("非法用户名");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public Student(){}

    public Student(String name,int age,String cls){
        this.name=name;
        this.age=age;
        this.cls=cls;
    }
}
