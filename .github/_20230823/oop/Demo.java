package _20230823.oop;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Animals a1 = Animals.getInstance();
        Animals a2 = Animals.getInstance();
        Animals a3 = Animals.getInstance();
        Animals a4 = Animals.getInstance();
        Animals a5 = Animals.getInstance();
        a1.foo();
        a2.foo();
        a3.foo();
        a4.foo();
        a5.foo();
    }
}
