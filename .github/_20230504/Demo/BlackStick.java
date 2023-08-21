package _20230504.Demo;

import java.util.Calendar;

/**
 * 黑法杖
 */
public class BlackStick implements MagicStick{
    @Override
    public int fire() {
        //0表示1月，11表示12月
        int m = Calendar.getInstance().get(Calendar.MONTH)-1;
        if(m%2==0){
            return 2;
        }
        else{
            return 1;
        }
    }
}
