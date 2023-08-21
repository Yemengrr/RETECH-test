package _20230518;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期时间类
 *  1.Date
 *  2.Calender
 *  3.LocalDate
 *  4.LocalTime
 */
public class DemoDate {
    public static void main(String[] args) {
        //Date 类
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());//返回毫秒值
        //Calender类
        Calendar c = Calendar.getInstance();
        System.out.println("获取年："+c.get(Calendar.YEAR));
        System.out.println("获取月："+(c.get(Calendar.MONTH)+1));
        System.out.println("获取日："+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("获取时："+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("获取分："+c.get(Calendar.MINUTE));
        System.out.println("获取秒："+c.get(Calendar.SECOND));
        System.out.println("当前时间："+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日   "+c.get(Calendar.HOUR_OF_DAY)+"："+c.get(Calendar.MINUTE)+"："+c.get(Calendar.SECOND));
        //LocalDate类
        LocalDate now = LocalDate.now();
        System.out.println("LocaleDate获取当前时间为："+now);
        System.out.println("LocaleDate获取年为："+now.getYear());
        System.out.println("LocaleDate获取月为："+now.getMonth());
        System.out.println("LocaleDate获取日of月为："+now.getDayOfMonth());
        System.out.println("LocaleDate获取日of周为："+now.getDayOfWeek());
        System.out.println("LocaleDate获取日of年为："+now.getDayOfYear());
        //LocalTime类，获取时间相关的属性。
        LocalTime time = LocalTime.now();
        System.out.println("LocalTime获取时："+time.getHour());
        System.out.println("LocalTime获取分："+time.getMinute());
        System.out.println("LocalTime获取秒："+time.getSecond());
        //时间格式转换
        //LocalDate--->字符串
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = dtf.format(LocalDate.now());
        System.out.println(format);
        //字符串--->LocalDate
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parse = LocalDate.parse("1997/07/01",dt);
        System.out.println(parse);
    }
}
