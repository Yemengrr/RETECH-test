package _20230823.oop;

public class Puppy extends Animals {
    private int age;
    private String name;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Puppy() {}

    public Puppy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void foo() {
        System.out.println("汪");
    }
}
