package _20230420;

/**
 * 工人类
 */
public class Worker {
    private String name;
    private int age;
    private double salary;
    private Address address;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}

    public Worker(){}
    public Worker(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
