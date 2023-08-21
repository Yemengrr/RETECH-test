package _20230504.Demo;

import java.util.Calendar;

/**
 * 绿法杖
 */
public class GreenStick implements MagicStick{
    @Override
    public int fire() {
        //0表示1月，11表示12月
        int m = Calendar.getInstance().get(Calendar.MONTH)-1;
        if(m>=6&&m<=8){
            return 2;
        }
        else {
            return 1;
        }
    }
}
