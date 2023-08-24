package _20230823.oop;

import java.util.UUID;

public abstract class Animals {
    public abstract void foo();
    public static Animals getInstance(){




        String s = UUID.randomUUID().toString();
        s = s.substring(0,1);
        boolean flag = true;
        if("01234567".contains(s)){
            flag = false;
        }
        if(flag){
            return new Kitty();
        }else{
            return new Puppy();
        }

    }
}
